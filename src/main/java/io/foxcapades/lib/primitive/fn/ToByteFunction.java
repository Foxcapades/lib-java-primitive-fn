package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToByteFunction<V> {
  byte apply(V val);
}
