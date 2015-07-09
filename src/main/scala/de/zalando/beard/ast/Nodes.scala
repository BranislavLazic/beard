package de.zalando.beard.ast

sealed trait Part

case class Interpolation(identifier: Identifier, attributes: Map[String, String] = Map.empty) extends Part

case class Text(text: String) extends Part

case class Sentence(parts: List[Part]) extends Part

case class BeardTemplate(parts: List[Part])

case class Identifier(identifier: String)