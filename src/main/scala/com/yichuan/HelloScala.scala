package com.yichuan

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @Author: yichuan
 * @Date: 2020/10/19 1:41 下午
 * @Description:
 */
object HelloScala {
  def main(args: Array[String]): Unit = {
    println("hello" -> "world", "hei" -> "hei")
  }

  def echo(args: String*): Unit = {
    println(args)
  }


}

case class TestBean() {
  // 对象私有字段,scala不生成相应的get/setter方法
  private[this] var name1 = "name1"
  private var name2 = "name2"

  def method(testBean: TestBean): Unit = {
    name1
    name2
    testBean.name2
  }
}

object TestBean {
  def main(args: Array[String]): Unit = {
    val bean1 = new TestBean();
    bean1.name2
    //    bean1.name1
  }
}
