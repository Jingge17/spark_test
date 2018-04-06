package cn.itcast.spark

import org.apache.spark.sql.SparkSession

object WordCountDataSet {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder.
      master("local")
      .appName("Spark SQL basic example").getOrCreate()
    import spark.implicits._//要加，不然.as[String]无隐式转换会保错
    val data = spark.read.text("hdfs://master1:9000/hdfs-foo/test-text.txt").as[String]
    data.show()
    val words = data.flatMap(value => value.split(" "))
    words.show()
    val groupedWords = words.groupByKey(_.toUpperCase())
    val counts = groupedWords.count()
    counts.show()

  }
}
