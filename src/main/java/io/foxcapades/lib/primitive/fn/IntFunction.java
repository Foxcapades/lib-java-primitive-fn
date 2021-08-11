package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface IntFunction<R> {
  R apply(int val);
}
