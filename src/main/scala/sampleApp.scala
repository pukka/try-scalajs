import scala.scalajs.js.{ JSApp, Dynamic }

object sampleApp extends JSApp {
  def main(): Unit = {
    println("Hello world!")
    Dynamic.global.alert("アラート")
  }
}
