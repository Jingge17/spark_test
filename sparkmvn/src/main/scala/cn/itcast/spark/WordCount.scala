package cn.itcast.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * spark-submit --class cn.itcast.spark.WordCount --master spark://master1:7077 --executor-memory 512m --total-executor-cores 2 /root/spark-mvn-1.0-SNAPSHOT-shaded.jar
  */
object WordCount {
def main(arg: Array[String]): Unit ={
  //创建SparkConf()并设置App名称
  val conf = new SparkConf().setAppName("WC3")
  //创建SparkContext，该对象是提交spark App的入口
  val sc = new SparkContext(conf)
  //使用sc创建RDD并执行相应的transformation和action
  sc.textFile("hdfs://master1:9000/hdfs-foo/test-text.txt")
    .flatMap(_.split(" "))
    .map((_, 1))
    .reduceByKey(_+_)
    .sortBy(_._2, false)
    .saveAsTextFile("hdfs://master1:9000/hdfs-foo/test-text-afterSparkSort3.txt")
  //停止sc，结束该任务
  sc.stop()
}
}
