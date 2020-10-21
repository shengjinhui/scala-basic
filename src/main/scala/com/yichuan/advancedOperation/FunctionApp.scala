package com.yichuan.advancedOperation

/**
 * @Author: yichuan
 * @Date: 2020/10/20 8:31 下午
 * @Description: 匿名函数
 */
object FunctionApp extends App {
  // 将原来接收两个参数的一个函数,转换为两个
  def sum(a: Int, b: Int) = a + b

  println(sum(2, 3))

  def sum2(a: Int)(b: Int) = a + b

  println(sum2(2)(3))

  // map: 逐个去操作集合中的每个元素
  val l = List(1, 2, 3, 4, 5, 6)
  //  l.map((x: Int) => x * 2)
  //  l.map((x) => x * 2) // 让编译器自己推导类型
  //  l.map(x => x * 2) // 只有单个元素才可以省略括号
  //  l.map(_ * 2).filter(_ > 8).foreach(println) // 直接使用占位符
  l.take(2).foreach(println)



}
