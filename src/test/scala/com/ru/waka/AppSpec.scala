package com.ru.waka

import org.scalatest.freespec.AnyFreeSpec

class AppSpec extends AnyFreeSpec {
  "App" - {
    "fibonacci" in {
      val actual = App.fibonacci(10)
      assert(actual == 55)
    }
  }

}
