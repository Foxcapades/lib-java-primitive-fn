package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToFloatFunction<V> {
  float apply(V val);
}
