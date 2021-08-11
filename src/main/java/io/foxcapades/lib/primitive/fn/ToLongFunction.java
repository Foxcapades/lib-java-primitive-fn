package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToLongFunction<V> {
  long apply(V val);
}
