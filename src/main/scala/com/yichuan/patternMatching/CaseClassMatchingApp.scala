package com.yichuan.patternMatching

/**
 * @Author: yichuan
 * @Date: 2020/10/20 7:58 下午
 * @Description:
 */
object CaseClassMatchingApp extends App {

  class Man

  case class CTO(name: String, age: Int) extends Man

  case class Employee(name: String, age: Int) extends Man

  case class Other(name: String, age: Int) extends Man

  def caseClassMatch(person: Man): Unit = {
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
