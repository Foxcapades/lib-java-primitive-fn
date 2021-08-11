package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToIntBiFunction<A1, A2> {
  int apply(A1 val1, A2 val2);
}
