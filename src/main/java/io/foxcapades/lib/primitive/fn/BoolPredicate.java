package io.foxcapades.lib.primitive.fn;

import java.util.function.IntPredicate;

@FunctionalInterface
public interface BoolPredicate {
  boolean test(boolean val);
}
