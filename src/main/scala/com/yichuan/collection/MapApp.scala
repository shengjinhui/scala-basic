package com.yichuan.collection

import scala.collection.mutable
import scala.io.StdIn

/**
 * @Author: yichuan
 * @Date: 2020/11/1 12:55 下午
 * @Description:
 */
object MapApp {
  def main(args: Array[String]): Unit = {
//    val map = Map("A" -> 1, "B" -> 2, "C" -> 3)
//
//    // 1.遍历map
//    // 方式一 => 通过普通for循环实现
//    for ((k, v) <- map) println(k, v)
//    println("*" * 15)
//    // 方式二 => 通过foreach函数实现
//    map.foreach(println)
//
//    // 2.通过filterKeys()方法,获取出键为"B"的这组键值对对象,并打印结果
//    println(map.filterKeys(_ == "B"))

    println("Start typing...")
    val str = StdIn.readLine()
    val counter = mutable.Map[Char, Int]()
    val chs = str.toCharArray
    chs.foreach(ch => countInputCharacterNum(ch, counter))
    counter.foreach(println)
  }

  def countInputCharacterNum(c: Char, counter: mutable.Map[Char, Int]) = {
    if (counter.contains(c)) {
      counter += (c -> (counter.getOrElse(c, 1) + 1))
    } else {
      counter += (c -> 1)
    }
  }

}
