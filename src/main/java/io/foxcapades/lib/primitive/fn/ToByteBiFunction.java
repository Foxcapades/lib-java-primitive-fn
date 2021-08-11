package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToByteBiFunction<A1, A2> {
  byte apply(A1 val1, A2 val2);
}
