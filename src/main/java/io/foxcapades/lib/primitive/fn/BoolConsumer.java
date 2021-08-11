package io.foxcapades.lib.primitive.fn;

import java.util.function.IntConsumer;

@FunctionalInterface
public interface BoolConsumer {
  void accept(boolean val);
}
