package com.yichuan.collection

import scala.collection.mutable.ListBuffer

/**
 * @Author: yichuan
 * @Date: 2020/10/31 5:37 下午
 * @Description:
 */
object ListApp extends App {
  // 1. 创建一个不可变列表
  val list1 = List(1, 2, 3, 4)
  // 2. 使用`Nil`创建一个不可变的空列表
  val list2 = Nil
  // 3. 使用`::`方法创建列表
  val list3 = 20 :: 21 :: Nil
  println(s"list1: $list1")
  println(s"list2: $list2")
  println(s"list3: $list3")

  // 4 可变列表操作
  var list4 = ListBuffer(5, 6, 7)
  list4 += 8
  list4 ++= List(9, 10)
  list4 -= 5
  list4 --= List(6, 7)
  val list5 = list4.toList
  val arr = list4.toArray
  println(list4) // ListBuffer(8, 9, 10)
  println(list5) // List(8, 9, 10)
  println(arr) // [I@1efbd816 这里输出的数组的地址值
}
