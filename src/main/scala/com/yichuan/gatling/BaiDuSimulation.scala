package com.yichuan.gatling

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

/**
 * @Author: yichuan
 * @Date: 2020/10/21 6:43 下午
 * @Description:
 */
class BaiDuSimulation extends Simulation {
  // 1. 配置下head 即请求路径
  val httpConf = http.baseURL("https://www.baidu.com")

  // 2. 声明Scenario,指定请求动作
  val scn = scenario("BaiDuSimulation").during(100) {
    exec(http("baidu_home").get("/"))
  }


  // 3.设置线程数并组装,这里atOneUsers即线程数
  setUp(scn.inject(atOnceUsers(10)).protocols(httpConf))

}

object Test extends App{
  private val simulation = new BaiDuSimulation()
  println(simulation)
}
