package com.yichuan.implicitConversion

/**
 * @Author: yichuan
 * @Date: 2020/10/21 12:32 上午
 * @Description:
 */
object ImplicitClassApp extends App {

  /**
   * 这里Calculator对于所有int类型的类都进行了隐式增强,使之都具备了add方法
   *
   * @param x
   */
  implicit class Calculator(x: Int) {
    def add(a: Int) = a + x
  }

  println(12.add(3))
}


