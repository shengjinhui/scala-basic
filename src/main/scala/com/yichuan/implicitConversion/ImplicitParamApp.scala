package com.yichuan.implicitConversion

/**
 * @Author: yichuan
 * @Date: 2020/10/21 12:30 上午
 * @Description:
 */
object ImplicitParamApp extends App {

  def testParam(implicit name: String): Unit = {
    println(s"myName is $name")
  }

  implicit val s1 = "zhangsan"
  testParam
}
