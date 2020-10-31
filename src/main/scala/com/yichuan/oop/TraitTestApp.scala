package com.yichuan.oop

/**
 * @Author: yichuan
 * @Date: 2020/10/31 11:35 上午
 * @Description:
 */
object TraitTestApp extends App {
  val c1 = new ConsoleLogger
  c1.printMsg
}


class Message {
  def printMsg = println("scala is the best")
}

trait Logger extends Message

class ConsoleLogger extends Logger


trait Log extends Message {
  def log(msg: String)
}

class InfoLog extends Log {
  override def log(msg: String): Unit = println(s"this is a info log,content is ${msg}")
}

object WarnLog extends Log {
  override def log(msg: String): Unit = println(s"this is a warn log from a singleton object,content is ${msg}")
}