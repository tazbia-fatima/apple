// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sanjana/Documents/Sanjana /play-java-starter-example/conf/routes
// @DATE:Fri Jan 18 12:03:11 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
