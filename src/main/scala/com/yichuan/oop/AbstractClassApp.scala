package com.yichuan.oop

/**
 * @Author: yichuan
 * @Date: 2020/10/30 3:03 下午
 * @Description:
 */
object AbstractClassApp extends App {
  private val controller = new UserController
  println(controller)
  val dog = new Dog("san pao")
  println(dog.age)
  println(dog)

  val cat = new Cat("gai")
  println(cat.age)
  println(cat)

}

// 抽象方法定义及继承
abstract class BaseController {
  def connect = println("connect success")

  def save

  def delete

  def update
}

class UserController extends BaseController {
  override def save: Unit = println("override save")

  override def delete: Unit = println("override delete")

  override def update: Unit = println("override update")
}

// 抽象变量
abstract class Pet(name: String) {
  val greeting: String
  var age: Int

  override def toString() = s"$greeting,I am $age"
}

class Dog(name: String) extends Pet(name) {
  val greeting: String = "Woof"
  var age: Int = 3
}

class Cat(name: String) extends Pet(name) {
  override val greeting: String = "Meow"
  override var age: Int = 2
}
