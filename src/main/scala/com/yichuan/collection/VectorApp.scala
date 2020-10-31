package com.yichuan.collection

/**
 * @Author: yichuan
 * @Date: 2020/10/26 10:39 上午
 * @Description:
 */
object VectorApp extends App {
  var v2 = Vector(1, 2, 3)
  var v1 = Vector.empty[String]
  v1 +:= "3"
  v1.foreach(ele => println(ele))

  var v3 = List(1, 2, 3, 4)
  v3 :+= 5

  v3.foreach(ele => println(ele))


}
