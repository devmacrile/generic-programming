package com.fm2gp

import scala.collection.mutable.ArrayBuffer

class PrimeSieve(val upper: Int) {

  private val oddUpper = upper / 2 - 1
  private val buffer = ArrayBuffer.fill(oddUpper)(true)

  private def markSieve(index: Int, factor: Int): Unit = {
    (index + factor to oddUpper by factor) foreach {
      buffer(_) = false
    }
  }

  private def sift(i: Int, indexSquare: Int): Unit = {
    if (indexSquare < upper) {
      if (buffer(i))
        markSieve(i, i + i + 3)
      sift(i + 1, 2 * i * (i + 3) + 3)
    }
  }

  def sift: Seq[Int] = {
    sift(0, 3)
    Seq(2) ++ buffer.zipWithIndex
      .filter{ case (isPrime, _) => isPrime }
      .map{ case (_, i) => 2 * i + 3 }
  }
}