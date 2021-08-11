package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToLongBiFunction<A1, A2> {
  long apply(A1 val1, A2 val2);
}
