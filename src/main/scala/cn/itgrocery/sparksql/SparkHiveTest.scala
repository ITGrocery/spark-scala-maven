package cn.itgrocery.sparksql

import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.{SparkConf, SparkContext}

/**
  *
  * @ author chenxl
  * @ date 2018/3/21 13:34
  * @ describe
  *
  */
object SparkHiveTest {

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("SparkHiveTest").setMaster("local[4]")
    val sparkContext = new SparkContext(sparkConf)

    val hiveContext = new HiveContext(sparkContext)
    hiveContext
      .sql("select count(*) from aa")
      .show()
  }

}
