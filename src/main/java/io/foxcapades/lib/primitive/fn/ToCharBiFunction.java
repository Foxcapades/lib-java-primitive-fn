package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToCharBiFunction<A1, A2> {
  char apply(A1 val1, A2 val2);
}
