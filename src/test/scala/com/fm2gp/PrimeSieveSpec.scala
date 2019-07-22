package com.fm2gp

import org.scalatest.{FlatSpec, Matchers}

class PrimeSieveSpec extends FlatSpec with Matchers {

  "PrimeSieve.sift" should "return only primes" in {
    // given
    val primeSieve = new PrimeSieve(30)

    // when
    val primes = primeSieve.sift

    // then
    primes should be(Seq(2, 3, 5, 7, 11, 13, 17, 19, 23, 29))
  }
}