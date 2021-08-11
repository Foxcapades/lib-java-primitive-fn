package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToBoolBiFunction<A1, A2> {
  boolean apply(A1 val1, A2 val2);
}
