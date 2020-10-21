package com.yichuan.patternMatching

import scala.util.Random

/**
 * @Author: yichuan
 * @Date: 2020/10/20 7:03 下午
 * @Description:
 */
object PatternMatchingApp extends App {
  /**
   * 基本类型匹配
   */
  val nameArray = Array("hello", "world", "scala")
  val name = nameArray(Random.nextInt(nameArray.length))


  name match {
    case "hello" => println("hello")
    case "world" => println("world")
    case _ => println("scala")
  }

  /**
   * Array匹配
   */
  def greeting(array: Array[String]): Unit = {
    array match {
      case Array("sjh") => println("hi sjh")
      case Array(x, y) => println("hi " + x + " hi " + y)
      case Array("sjh", _*) => println("hi sjh and others")
      case _ => println("nobody can hi")
    }
  }

  greeting(Array("sjh", "hello", "world"))


  /**
   * List匹配
   */

  def greetingList(list: List[String]): Unit = {
    list match {
      case "zhangsan" :: Nil => println("hi zhangsan")
      case x :: y :: Nil => println("hi " + x, " hi " + y)
      case "zhangsan" :: tail => println("hi zhangsan and others")
      case _ => println("nobody can hi")
    }
  }

  greetingList(List("zhangsan", "lisi", "name"))


  /**
   * 类型匹配
   */
  def matchType(obj: Any): Unit = {
    obj match {
      case x: Int => println("Int")
      case s: String => println("String")
      case m: Map[_, _] => m.foreach(println)
      case _ => println("other type")
    }
  }

  matchType("1")


}
