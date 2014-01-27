package com.spotify.trickle;

import com.google.common.util.concurrent.ListenableFuture;

/**
 * Code that has a inputs of type A and B, and returns a value of type R. Side-effects such as
 * writing to a database are permitted, but authors are encouraged to keep implementations free
 * of side-effects if at all possible.
 */
public interface Func2<A, B, R> extends Func<R> {
  ListenableFuture<R> run(A arg1, B arg2);
}
