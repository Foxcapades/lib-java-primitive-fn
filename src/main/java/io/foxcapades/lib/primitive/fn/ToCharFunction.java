package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToCharFunction<V> {
  char apply(V val);
}
