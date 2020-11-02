package com.yichuan.generic

/**
 * @Author: yichuan
 * @Date: 2020/10/31 6:26 下午
 * @Description:
 */
object GenericMethodApp extends App {
  // 方法一: 不采用泛型
  def getMiddleElement(arr: Array[Any]) = arr(arr.length / 2) // 注意: 这里的实现原理即向上转型,但是向上转型是比较消耗资源的
  // 方式二: 采用自定义的泛型方法来实现
  def getMiddleElement[T](arr: Array[T]) = arr(arr.length / 2)
}

