package org.aargh.badimports

import org.scalatest.{Assertions, FreeSpec}

import ClassAModel._
import ClassBModel._

import spray.json._
import spray.json.DefaultJsonProtocol._

class ImportSpec extends FreeSpec with Assertions {
  "JSON imports" - {
    "should work" in {
      val a = ClassA(1, "a")
      val b = ClassB(2, "b")

      //import spray.json.DefaultJsonProtocol._ required here. Why?

      Seq(a).toJson
      Seq(b).toJson
    }
  }
}