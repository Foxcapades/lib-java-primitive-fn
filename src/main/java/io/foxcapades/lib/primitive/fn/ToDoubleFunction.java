package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToDoubleFunction<V> {
  double apply(V val);
}
