lazy val root = project.in(file("."))
  .settings(
    name := "scio.g8",
    test in Test := {
      val _ = (g8Test in Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m",
                                "-Xmx1024m",
                                "-XX:ReservedCodeCacheSize=128m",
                                "-XX:MaxPermSize=256m",
                                "-Xss2m",
                                "-Dfile.encoding=UTF-8")
  )
