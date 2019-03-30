// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tazbiafatima/Documents/Weigh-To-Go-Backend/conf/routes
// @DATE:Fri Mar 29 11:47:01 IST 2019


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
