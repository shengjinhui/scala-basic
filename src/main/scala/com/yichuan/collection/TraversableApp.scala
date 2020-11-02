package com.yichuan.collection

/**
 * @Author: yichuan
 * @Date: 2020/10/31 10:23 下午
 * @Description:
 */
object TraversableApp extends App {

  // 1. 创建空的Traversable对象
  // 方式1 => 通过empty方法创建
  val t1 = Traversable.empty[Int]

  // 方法2 => 通过小括号实现
  val t2 = Traversable[Int]()

  // 方法3 => 通过Nil实现
  val t3 = Nil

  // 2. 创建带参数的Traversable对象
  // 方式1 => 通过toTraversable()方法实现
  val t4 = List(1,2,3).toTraversable

  // 方式2 => 通过Traversable的伴生对象的apply()方法实现
  val t5 = Traversable(1,2,3)
  println(t4 == t5) // true
}

