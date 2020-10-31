package com.yichuan.oop

/**
 * @Author: yichuan
 * @Date: 2020/10/30 11:54 下午
 * @Description:
 */
object ApplyTest extends App {
  var daBai = GoldenRetriever("daBai", 2)
  println(daBai)

}
class GoldenRetriever(var name: String, var age: Int) {
  override def toString() = s"Hi I am ${name}, I am ${age} years old"
}

object GoldenRetriever {
  def apply(name: String, age: Int) = new GoldenRetriever(name, age)
}