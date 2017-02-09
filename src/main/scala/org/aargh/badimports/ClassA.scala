package org.aargh.badimports

import spray.json.DefaultJsonProtocol

case class ClassA(
  field1: Int,
  field2: String
)

class ClassAModel extends DefaultJsonProtocol {
  implicit val ClassAFormat = jsonFormat2(ClassA)
}

object ClassAModel extends ClassAModel