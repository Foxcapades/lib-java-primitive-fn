package io.foxcapades.lib.primitive.fn;

import java.util.function.IntFunction;

@FunctionalInterface
public interface BoolFunction<R> {
  R apply(boolean val);
}
