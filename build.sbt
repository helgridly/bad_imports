name := "badimports"

organization := "org.aargh"

scalaVersion  := "2.11.7"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8", "-target:jvm-1.8")

libraryDependencies ++= {
  Seq(
    "io.spray"            %%  "spray-json"    % "1.3.2",
    "org.scalatest"       %%  "scalatest"     % "2.2.6"   % "test"
	)
}
