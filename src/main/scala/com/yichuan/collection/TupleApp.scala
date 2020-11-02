package com.yichuan.collection

/**
 * @Author: yichuan
 * @Date: 2020/10/31 3:15 下午
 * @Description:
 */
object TupleApp extends App {
  var tuple1 = ("张三", 23)
  var tuple2 = "李四" -> 25

  println(tuple1)
  println(tuple2)

  var tuple3 = ("daBai", 3, "Golden Retriever", "wolf")
  println(tuple3._1)

  val iterator = tuple3.productIterator
  for (i <- iterator) println(i)
}
