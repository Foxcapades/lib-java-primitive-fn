package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface LongFunction<R> {
  R apply(long val);
}
