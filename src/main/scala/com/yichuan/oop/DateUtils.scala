package com.yichuan.oop

import java.text.SimpleDateFormat
import java.util.Date

/**
 * @Author: yichuan
 * @Date: 2020/10/31 12:05 上午
 * @Description:
 */
object DateUtils {
  var sdf: SimpleDateFormat = null

  def date2String(date: Date, template: String) = {
    sdf = new SimpleDateFormat(template)
    sdf.format(date)
  }

  def string2Date(dateString: String, template: String) = {
    sdf = new SimpleDateFormat(template)
    sdf.parse(dateString)
  }

  def main(args: Array[String]): Unit = {
    println(DateUtils.date2String(new Date(), "HH:mm:ss"))
    println(DateUtils.string2Date("2020年10月30日", "yyyy年MM月dd日"))
  }
}

