name := "oratocass"
version := "0.1"
scalaVersion := "2.11.8"
version := "1.0"

val sparkVersion = "2.3.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "com.datastax.cassandra" % "cassandra-driver-core" % "3.5.0"
)

unmanagedBase := baseDirectory.value / "lib"