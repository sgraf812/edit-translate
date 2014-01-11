name := "edit-translate"

version := "1.0-SNAPSHOT"

lazy val translators = project

lazy val console = project
  .dependsOn(translators)

lazy val root = project
  .in(file("."))
  .aggregate(translators, console)