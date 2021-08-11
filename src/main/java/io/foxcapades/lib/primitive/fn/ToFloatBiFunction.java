package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToFloatBiFunction<A1, A2> {
  float apply(A1 val1, A2 val2);
}
