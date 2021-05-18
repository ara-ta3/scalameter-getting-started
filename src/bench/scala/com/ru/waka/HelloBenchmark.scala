package com.ru.waka

import org.scalameter.api._

class HelloBenchmark extends Bench.LocalTime {
  val sizes: Gen[Int] = Gen.range("size")(from = 1, upto = 5, hop = 2)

  val ranges: Gen[Range] = for {
    size <- sizes
  } yield 0 until size

  performance of "Range" in {
    measure method "map" in {
      using(ranges) in { r =>
        r.map(_ + 1)
      }
    }
  }
  /*
[info] ::Benchmark Range.map::
[info] cores: 6
[info] hostname: ...
[info] name: Java HotSpot(TM) 64-Bit Server VM
[info] osArch: x86_64
[info] osName: Mac OS X
[info] vendor: Oracle Corporation
[info] version: 15+36-1562
[info] Parameters(size -> 1): 0.001506 ms
[info] Parameters(size -> 3): 0.001847 ms
[info] Parameters(size -> 5): 0.001738 ms
[info] Passed: Total 0, Failed 0, Errors 0, Passed 0
   */
}
