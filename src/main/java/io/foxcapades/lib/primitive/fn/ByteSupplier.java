package io.foxcapades.lib.primitive.fn;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

@FunctionalInterface
public interface ByteSupplier {
  byte get();
}
