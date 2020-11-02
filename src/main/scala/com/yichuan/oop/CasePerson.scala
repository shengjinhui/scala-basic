package com.yichuan.oop

/**
 * @Author: yichuan
 * @Date: 2020/10/30 12:31 下午
 * @Description: 模板类定义枚举
 */
object Test extends App {
  var person1 = CasePerson("name", 18)
  var person2 = person1.copy(age = 20)
  println(person2)

  val p = Person2("sjh", Male)

}

case class CasePerson(name: String, age: Int) {
  override def toString: String = s"my name is ${name},I am ${age} years old"

}


trait Sex

case object Male extends Sex

case object Female extends Sex

case class Person2(var name: String, var sex: Sex)

object CaseObjectTest extends App {
  val p = Person2("sjh", Male)
}