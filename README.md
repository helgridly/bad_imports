# bad_imports

A minimal repro of some issues with creating Spray JSON model classes and importing them later.

At the commandline, run:

```$ sbt test```

You'll see the test fail.

Uncommenting [this line](https://github.com/helgridly/bad_imports/blob/master/src/test/scala/org/aargh/badimports/ImportSpec.scala#L17) makes it work, but I don't see why it should be necessary.

Two questions:

1. Why is it necessary?
2. How can we make it unnecessary?
