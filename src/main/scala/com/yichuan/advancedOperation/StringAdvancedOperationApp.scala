package com.yichuan.advancedOperation

/**
 * @Author: yichuan
 * @Date: 2020/10/20 8:24 下午
 * @Description:
 */
object StringAdvancedOperationApp extends App {

  // 参数插入
  val name = "gai"
  val address = "HangKong"
  println(s"Hello $name,welcome to $address")

  // 多行字符串
  val warn =
    """Stop
      | raised
      |  your
      |  hands
      |  """.stripMargin

}
