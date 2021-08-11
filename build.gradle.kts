plugins {
  `java-library`
  `maven-publish`
  signing
}

group = "io.foxcapades.lib"
version = "1.0.1"

java {
  sourceCompatibility = JavaVersion.VERSION_16
  targetCompatibility = JavaVersion.VERSION_16

  withSourcesJar()
  withJavadocJar()

  modularity.inferModulePath.set(true)
}

publishing {
  repositories {
    maven {
      name = "nexus"
      url  = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/")

      credentials {
        username = project.findProperty("nexus.user") as String?
        password = project.findProperty("nexus.pass") as String?
      }
    }
  }

  publications {
    create<MavenPublication>("maven") {
      from(components["java"])

      pom {
        name.set("Functional Interfaces for Primitives")
        description.set("How about some love for all the primitive types?  Java's functional package only includes functional interfaces for int, long, and double, this library adds them for all primitive types.")

        url.set("https://github.com/Foxcapades/lib-java-primitive-fn")

        developers {
          developer {
            id.set("epharper")
            name.set("Elizabeth Paige harper")
            email.set("foxcapade@gmail.com")
            url.set("https://github.com/Foxcapades")
          }
        }

        scm {
          connection.set("scm:git:git://github.com/Foxcapades/lib-java-primitive-fn.git")
          developerConnection.set("scm:git:ssh://github.com/Foxcapades/lib-java-primitive-fn.git")
          url.set("https://github.com/Foxcapades/lib-java-primitive-fn")
        }
      }
    }
  }
}

artifacts {
  archives(tasks["sourcesJar"])
  archives(tasks["javadocJar"])
  archives(tasks["jar"])
}

signing {
  useGpgCmd()
  sign(configurations.archives.get())
  sign(publishing.publications["maven"])
}