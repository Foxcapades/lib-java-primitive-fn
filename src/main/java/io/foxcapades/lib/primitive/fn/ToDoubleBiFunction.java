package io.foxcapades.lib.primitive.fn;

@FunctionalInterface
public interface ToDoubleBiFunction<A1, A2> {
  double apply(A1 val1, A2 val2);
}
