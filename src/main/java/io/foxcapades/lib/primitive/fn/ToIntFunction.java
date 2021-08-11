package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToIntFunction<V> {
  int apply(V val);
}
