package org.aargh.badimports

import spray.json.DefaultJsonProtocol

case class ClassB(
  field1: Int,
  field2: String
)

object ClassBModel extends DefaultJsonProtocol {
  implicit val ClassBFormat = jsonFormat2(ClassB)
}
