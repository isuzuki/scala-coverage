package io.github.isuzuki

import org.scalatest.{Matchers, WordSpec}

class ServiceTest extends WordSpec with Matchers {
  "Service" can {
    "hello" should {
      "return value hello" in {
        Service.hello shouldBe "hello"
      }
    }
  }
}
