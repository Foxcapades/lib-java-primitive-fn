package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface LongBinaryOperator {
  long apply(long val1, long val2);
}
