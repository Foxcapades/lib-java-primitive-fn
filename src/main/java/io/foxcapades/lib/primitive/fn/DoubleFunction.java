package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface DoubleFunction<R> {
  R apply(double val);
}
