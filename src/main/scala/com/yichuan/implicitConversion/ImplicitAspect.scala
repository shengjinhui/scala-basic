package com.yichuan.implicitConversion

import java.io.File

/**
 * @Author: yichuan
 * @Date: 2020/10/21 12:21 上午
 * @Description: 隐式转换方法切面,用于封装隐式转换函数
 */
object ImplicitAspect {

  implicit def man2superman(man: Man): Superman = new Superman(man.name)

  implicit def file2RichFile(file: File) = new RichFile(file)
}
