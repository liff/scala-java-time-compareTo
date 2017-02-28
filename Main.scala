import scala.scalajs.js.JSApp
import java.time._

object Main extends JSApp {
  def main(): Unit = {
    val a = Duration.ofMillis(1000)
    val b = Duration.ofMillis(2000)
    println(s"a compareTo b = ${a compareTo b}")
  }
}
