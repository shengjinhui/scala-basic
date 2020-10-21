package com.yichuan.patternMatching

/**
 * @Author: yichuan
 * @Date: 2020/10/20 7:58 下午
 * @Description:
 */
object CaseClassMatchingApp extends App {

  class Person

  case class CTO(name: String, age: Int) extends Person

  case class Employee(name: String, age: Int) extends Person

  case class Other(name: String, age: Int) extends Person

  def caseClassMatch(person: Person): Unit = {
    person match {
      case CTO(name, age) => println("CTO name is: " + name + ",age is: " + age)
      case Employee(name, age) => println("Employee name is: " + name + ",age is: " + age)
      case Other(name, age) => println("Other name is: " + name + ",age is: " + age)
      case _ => println("who are you")
    }
  }

  caseClassMatch(CTO("Jack Ma", 57))
  caseClassMatch(Employee("sjh", 22))
  caseClassMatch(Other("other", 18))

}
