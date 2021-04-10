package main.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkRunner {

    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf()
                .setAppName("firstSparkApp")
                .setMaster("spark://master:7077");
        JavaSparkContext sc = new JavaSparkContext(sparkConf);

        JavaRDD<String> lines = sc.textFile("data.txt");
    }

}
