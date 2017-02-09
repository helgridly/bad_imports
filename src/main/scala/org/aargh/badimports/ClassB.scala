package org.aargh.badimports

import spray.json.DefaultJsonProtocol

case class ClassB(
                   val field1: Int,
                   val field2: String
                 )

class ClassBModel extends DefaultJsonProtocol {
  implicit val ClassBFormat = jsonFormat2(ClassB)
}

object ClassBModel extends ClassBModel
