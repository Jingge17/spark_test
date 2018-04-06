package cn.itcast.spark

import org.apache.spark.{SparkConf, SparkContext}

object WordCountLocal {
    def main(arg: Array[String]): Unit ={
      //创建SparkConf()并设置App名称
      val conf = new SparkConf().setAppName("WC2").setMaster("local[2]")//spark://master1:7077
      //创建SparkContext，该对象是提交spark App的入口
      val sc = new SparkContext(conf)
      //使用sc创建RDD并执行相应的transformation和action
      val result=sc.textFile("hdfs://master1:9000/hdfs-foo/test-text.txt")
        .flatMap(_.split(" "))
        .map((_, 1))
        .reduceByKey(_+_)
        .saveAsTextFile("hdfs://master1:9000/hdfs-foo/test-text-afterSparkSort2.txt") //访问权限报错 修改权限即可 ex：hadoop fs -chmod 777 /hdfs-foo
      sc.stop()
    }
}
