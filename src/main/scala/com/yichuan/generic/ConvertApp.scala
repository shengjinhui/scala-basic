package com.yichuan.generic

/**
 * @Author: yichuan
 * @Date: 2020/10/31 8:34 下午
 * @Description: 非变,协变,逆变
 */
object ConvertApp extends App {

  // 非变
  val t1: Temp1[Sub] = new Temp1[Sub]
  // val t2: Temp1[Supper] = t1 Error: 编译报错,因为是非变,Super和Sub有父子关系,但是Temp1[Super]和Temp1[Sub]无任何关系

  // 协变
  val t3: Temp2[Sub] = new Temp2[Sub]
  val t4: Temp2[Supper] = t3 // 因为是协变,Super和Sub有父子关系,Temp[2],Temp2[Super]和Temp2[Sub]是父子类关系

  // 逆变
  val t5: Temp3[Sub] = new Temp3[Sub]
  //  val t6: Temp3[Supper] = t5  Error: 因为是逆变,Super和Sub有父子关系,Temp3[Super]和Temp3[Sub]是子父类关系(反转)
  val t7: Temp3[Supper] = new Temp3[Supper]
  val t8: Temp3[Sub] = t7
}

class Supper

class Sub extends Supper

class Temp1[T]

class Temp2[+T]

class Temp3[-T]