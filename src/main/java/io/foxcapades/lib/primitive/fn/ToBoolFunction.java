package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToBoolFunction<V> {
  boolean apply(V val);
}
