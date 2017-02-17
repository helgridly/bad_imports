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

      a.toJson
      b.toJson

      //[info] All tests passed.
    }
  }
}