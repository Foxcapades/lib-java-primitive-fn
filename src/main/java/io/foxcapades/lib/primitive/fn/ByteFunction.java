package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ByteFunction<R> {
  R apply(byte val);
}
