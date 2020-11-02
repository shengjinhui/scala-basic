package com.yichuan.fp

/**
 * @Author: yichuan
 * @Date: 2020/11/1 11:59 上午
 * @Description:
 */
object HighOrderFunctionApp {

  def main(args: Array[String]): Unit = {
    val list1 = (1 to 10).toList

    // 1. 有值的函数
    def func = (x: Int) => "*" * x

    val list2 = list1.map(func)
    println(list2)

    // 2. 匿名函数
    val list3 = list1.map((x: Int) => "*" * x)
    val list4 = list1.map("*" * _)

    println(list3, list4)

    println("*" * 15)

    // 3. 柯里化
    // 如果这个时候,我们相对s1,s2各自再做一些操作就没法做了,所以这个函数还是不够灵活
    def merge(s1: String, s2: String) = s1 + s2

    println(merge("abc", "def"))

    // 我们将f1定义为传入两个string,输出一个string的函数,这样我们后续对s1,s2就可以更加灵活
    def merge2(s1: String, s2: String)(f1: (String, String) => String) = f1(s1, s2)

    merge2("abc", "def")(_.toUpperCase() + _)

    // 4. 闭包
    val y = 10
    val add = (x: Int) => {
      x + y
    }

    println(add(5))

    // 5. 控制对象
    val shopping = (f1: () => Unit) => {
      println("Welcome in!")
      // 这里f1可以写具体在超市做的事儿
      f1()
      println("Thanks for Coming!")
    }

    shopping {
      () => {
        println("Buy a notebook")
        println("Buy a pencil")
        println("Buy a rabbit")
      }
    }


  }

}
