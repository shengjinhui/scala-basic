package com.yichuan.patternMatching

/**
 * @Author: yichuan
 * @Date: 2020/10/20 7:50 下午
 * @Description:
 */
object ExceptionMatchingApp extends App {
  try {
    val l = 10 / 0
  } catch {
    case e: ArithmeticException => println("divisor can't be zero")
    case e: Exception => println(e.getMessage)
  } finally {
    // do nothing
  }
}
