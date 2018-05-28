package io.github.isuzuki

import org.scalatest.{Matchers, WordSpec}

class ServiceTest extends WordSpec with Matchers {
  "Service" can {
    "hello" should {
      "return value hello" in {
        Service.hello shouldBe "hello"
      }
    }

    "sum" should {
      "return added value" in {
        Service.sum(1, 2) shouldBe 3
      }
    }
  }
}
