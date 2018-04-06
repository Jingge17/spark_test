package cn.itcast.spark

import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * 1.导入spark自带的jar包 maven会遗漏或不兼容而导致报错
  * 2.sparkstreaming只会监控按流输入的文件
  * 3.文本的按流追加也不会被监控，只有创建文件并且按流追加才会被读取
  */
//TODO     val lines = ssc.textFileStream("F://WorkCount/") 不会重复读 只是开始时候读一次
object WordCountStreaming {
  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.WARN)
    val sparkConf = new SparkConf().setAppName("WordCountStreaming").setMaster("local[*]")

    // 创建Streaming的上下文，包括Spark的配置和时间间隔，这里时间为间隔20秒
    val ssc = new StreamingContext(sparkConf, Seconds(10))

    // 指定监控的目录，在这里为/home/hadoop/temp/
    val lines = ssc.socketTextStream("localhost",8888,StorageLevel.MEMORY_ONLY)
    // 对指定文件夹变化的数据进行单词统计并且打印
    val words = lines.flatMap(_.split(" "))
    val wordCounts = words.map(x => (x, 1)).reduceByKey(_ + _)
    wordCounts.print()

    // 启动Streaming
    ssc.start()
    ssc.awaitTermination()
  }
}
