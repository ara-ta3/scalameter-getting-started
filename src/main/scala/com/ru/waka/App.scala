package com.ru.waka

object App {
  def fibonacci(n: Int): Int = {

//    def loop(n: Int, a1: Int = 0, a2: Int = 1): Int =
//      if (n<=0) 0
//      else loop(n-1, a2, a1 + a2)

    if (n <= 0) 0
    else if (n == 1 || n == 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
}