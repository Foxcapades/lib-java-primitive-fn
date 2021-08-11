package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface CharFunction<R> {
  R apply(char val);
}
