package com.fm2gp.maths

object OptimalAdditionChains {

  def half(n: Int): Int = n >> 1

  def optimalAdditionChain(n: Int): Seq[String] = {
    Seq.empty[String]
  }

  (1 to 100).map(optimalAdditionChain)
}

/*
4
b = (a + a)
return b + b
=> 2

5
b = a + a
return b + b + a
=> 3

9
b = a + a + a
return b + b + b
=> 4

14
b = a + a
c = b + b
return c + c + c + b
=> 5

16
b = a + a
c = b + b
d = c + c
return d + d
=> 4

17
b = a + a + a
c = b + b + a
return c + c + b
=> 6
 */