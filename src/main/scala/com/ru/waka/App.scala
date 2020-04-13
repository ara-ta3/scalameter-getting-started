package com.ru.waka

object App {
  def fibonacci(n: Int): Int =
    if (n <= 0) 0
    else if (n == 1 || n == 2) n
    else fibonacci(n - 1) + fibonacci(n - 2)
}