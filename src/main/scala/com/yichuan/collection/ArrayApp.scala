package com.yichuan.collection

import scala.collection.mutable.ArrayBuffer

/**
 * @Author: yichuan
 * @Date: 2020/10/31 2:49 下午
 * @Description:
 */
object ArrayApp extends App {
  /**
   * 1. 数组的初始化
   */
  /**
   * 1.1- 变长数组的初始化
   */
  // 定义
  var arr1 = ArrayBuffer[Int]()
  var arr2 = ArrayBuffer("hadoop", "storm", "spark")
  println(s"arr1: $arr1, arr2: $arr2")

  // 2 数组的增删改操作
  arr2 += "flink"
  arr2 -= "hadoop"
  arr2 ++= Array("hive", "sqoop")
  arr2 --= Array("spark", "storm")
  println(arr2)

  // 3 数组的遍历
  val arr3 = Array(1, 2, 3, 4, 5)
  // 3.1 方式一 => 通过下标获取元素
  for (i <- 0 to arr3.length - 1) println(arr3(i))
  println("*" * 15)
  for (i <- 0 until arr3.length) println(arr3(i)) // 使用until左闭右开
  println("*" * 15)

  // 3.2 方式二 => 直接获取元素
  for (i <- arr3) println(i)

  // 4 数组常用算法
  val arr4 = Array(5, 3, 2, 1, 4)
  println(s"sum: ${arr4.sum}")
  println(s"max: ${arr4.max}")

  arr4.sorted.foreach(println)
  println("*" * 15)
  arr4.reverse.foreach(println)
}


