package org.aargh.badimports

import spray.json.DefaultJsonProtocol
import spray.json.DefaultJsonProtocol._

case class ClassA(
  field1: Int,
  field2: String
)

object ClassAModel extends DefaultJsonProtocol {
  implicit val ClassAFormat = jsonFormat2(ClassA)
}
