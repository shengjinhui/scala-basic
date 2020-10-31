package com.yichuan.oop

/**
 * @Author: yichuan
 * @Date: 2020/10/30 5:58 下午
 * @Description:
 */
object InnerClassApp extends App {
  val p = new PandoraBox
  p.things.foreach(println)
  p.addThing("Thing#3")
}

class PandoraBox {

  case class Thing(name: String)

  var things = new collection.mutable.ArrayBuffer[Thing]()
  things += Thing("Thing#1")
  things += Thing("Thing#2")


  def addThing(name: String) = things += Thing(name)

}