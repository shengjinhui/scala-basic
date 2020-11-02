package com.yichuan.generic

/**
 * @Author: yichuan
 * @Date: 2020/10/31 7:31 下午
 * @Description: 泛型的上下界
 */
object UpperLowerApp extends App {

  def getPerson[T <: People](arr: Array[T]) = println(arr)

  getPerson(Array(new People(), new People()))
  getPerson(Array(new Student(), new People()))
  //getPerson(Array("", "", "")) // 这里运行的时候会抛出异常,Error:inferred type arguments [String] do not conform to method getPerson's type parameter bounds [T <: com.yichuan.generic.Person]
}


class People

class Student extends People

