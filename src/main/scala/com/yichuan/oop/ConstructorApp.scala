package com.yichuan.oop

/**
 * @Author: yichuan
 * @Date: 2020/10/20 12:30 上午
 * @Description:
 */
object ConstructorApp extends App {
  /**
   * 常见主构造函数 & 辅助构造函数
   */
  val person = new Person2("sjh", 18)
  private val person1 = new Person2()
  println(person.hobby)

  /**
   * 私有主构造函数 => 单例模式
   */
  println(SinglePerson.getInstance)


  /**
   * case类主构造函数 & 辅助构造函数实现
   */
  val animal = Animal("sjh")
  val animal2 = Animal()
  println(animal)
  println(animal2)



  // 主构造器
  class Person2(var name: String, var age: Int) {
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

    def this() {
      this(Person2.DEFAULT_NAME, Person2.DEFAULT_AGE)
    }
  }

  object Person2 {
    val DEFAULT_NAME = "sjh"
    val DEFAULT_AGE = 18
  }


  // 私有主构造器,单例模式
  class SinglePerson private {
    override def toString = "this is a singlePerson"
  }

  object SinglePerson {
    def getInstance = new SinglePerson
  }

  // case Class
  case class Animal(var name: String, var age: Int) {
    override def toString = "this is an animal"
  }

  /**
   * 伴生对象的用途之一 在伴生对象中的任意一个方法将会变成该对象的静态方法(所以常被当做工具类)
   */
  object Animal {
    /**
     * case类中构造函数都是隐式构造apply实现的
     *
     * @return
     */
    def apply() = new Animal("<no name>", 0)

    def apply(name: String) = new Animal(name, 0)
  }


}

