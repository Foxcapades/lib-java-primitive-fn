package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToShortFunction<V> {
  short apply(V val);
}
