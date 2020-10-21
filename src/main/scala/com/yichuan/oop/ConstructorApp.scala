package com.yichuan.oop

/**
 * @Author: yichuan
 * @Date: 2020/10/20 12:30 上午
 * @Description:
 */
object ConstructorApp {
  def main(args: Array[String]): Unit = {
    val person = new Person("sjh", 18)
    println(person.hobby)
  }
}

// 主构造器
class Person(val name: String, val age: Int) {


  val hobby = "play basketball";
  var gender: String = _;
  println("Person constructor enter")
  println("Person constructor leave")

  // 附属构造器
  def this(name: String, age: Int, gender: String) {
    // 附属构造器的第一行代码必须调用主构造器或者其他附属构造器
    this(name, age)
    this.gender = gender
  }
}
