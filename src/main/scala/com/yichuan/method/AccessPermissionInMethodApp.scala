package com.yichuan.method

/**
 * @Author: yichuan
 * @Date: 2020/10/30 6:15 下午
 * @Description:
 *                          控制方法作用域
 *                          scala中包含以下五种作用域
 *                          - 对象私有作用域
 *                          - 私有的
 *                          - 包内可见的
 *                          - 指定包内可见的
 *                          - 公共的
 */
class AccessPermissionInMethodApp {

}

class Foo {
  private[this] def isFoo = true

  def doFoo(other: Foo): Unit = {
    // if (other.isFoo) 编译器会抛出Symbol isFoo is inaccessible from this place错误,即其他类不可访问
    this.isFoo
  }
}
