package com.yichuan.oop

/**
 * @Author: yichuan
 * @Date: 2020/10/19 1:45 下午
 * @Description:
 */
object SimpleObjectApp {
  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "zhangsan"
    println(person.name + " ... " + person.age)
    person.printInfo()
  }
}

class People {
  // 定义属性
  var name: String = _

  val age: Int = 10

  // private
  private[this ] val gender = "male"

  // 定义方法
  def eat(): String = {
    name + "eat";
  }

  def printInfo(): Unit = {
    println("gender=>" + gender)
  }
}
