package com.ru.waka

import org.scalameter.api._

object AppBenchmark extends Bench.LocalTime {
  val sizes: Gen[Int] = Gen.range("sizes")(10, 40, 10)

  performance of "N" in {
    measure method "fibonacci" in {
      using(sizes) in { x => App.fibonacciTailrec(x) }
    }
    measure method "fibonacciSlow" in {
      using(sizes) in { x => App.fibonacci(x) }
    }
  }
}
