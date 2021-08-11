package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToShortBiFunction<A1, A2> {
  short apply(A1 val1, A2 val2);
}
