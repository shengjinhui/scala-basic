package com.yichuan.implicitConversion

import java.io.File
import com.yichuan.implicitConversion.ImplicitAspect._

/**
 * @Author: yichuan
 * @Date: 2020/10/21 12:02 上午
 * @Description:
 */
object ImplicitConversionApp extends App {
  //   定义隐式转换函数即可

  val man = new Man("sjh")
  // 使用了隐式转换之后,man对象拥有了superman对象的方法
  man.fly()


  val file = new File("/Users/jhs/scalaProjects/scala-train/src/test/scala/com/yichuan/test.txt")
  val text = file.read()
  println(text)

}

class Man(val name: String) {
  def eat(): Unit = {
    println(s"man [$name] eat...")
  }
}

class Superman(val name: String) {
  def fly(): Unit = {
    println(s"superMan [$name] fly...")
  }
}

class RichFile(val file: File) {
  // 增强的方法 => read
  def read(): String = {
    scala.io.Source.fromFile(file.getPath).mkString
  }
}
