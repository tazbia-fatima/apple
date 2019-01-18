// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sanjana/Documents/Sanjana /play-java-starter-example/conf/routes
// @DATE:Fri Jan 18 12:03:11 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  HelloWorldController_5: controllers.HelloWorldController,
  // @LINE:11
  BooksController_3: controllers.BooksController,
  // @LINE:18
  FoodController_2: controllers.FoodController,
  // @LINE:22
  HomeController_1: controllers.HomeController,
  // @LINE:24
  CountController_0: controllers.CountController,
  // @LINE:26
  AsyncController_4: controllers.AsyncController,
  // @LINE:29
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    HelloWorldController_5: controllers.HelloWorldController,
    // @LINE:11
    BooksController_3: controllers.BooksController,
    // @LINE:18
    FoodController_2: controllers.FoodController,
    // @LINE:22
    HomeController_1: controllers.HomeController,
    // @LINE:24
    CountController_0: controllers.CountController,
    // @LINE:26
    AsyncController_4: controllers.AsyncController,
    // @LINE:29
    Assets_6: controllers.Assets
  ) = this(errorHandler, HelloWorldController_5, BooksController_3, FoodController_2, HomeController_1, CountController_0, AsyncController_4, Assets_6, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HelloWorldController_5, BooksController_3, FoodController_2, HomeController_1, CountController_0, AsyncController_4, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HelloWorld""", """controllers.HelloWorldController.HelloWorld()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """helloSanjana""", """controllers.HelloWorldController.helloSanjana()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello/""" + "$" + """name<[^/]+>""", """controllers.HelloWorldController.hello(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hellos/""" + "$" + """name<[^/]+>""", """controllers.HelloWorldController.hellos(name:String, count:Integer ?= 17)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.createBook()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """Id<[^/]+>""", """controllers.BooksController.getBookById(Id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """Id<[^/]+>""", """controllers.BooksController.updateBookById(Id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """Id<[^/]+>""", """controllers.BooksController.deleteBookById(Id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.getAllBooks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods""", """controllers.FoodController.getFood()"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_HelloWorldController_HelloWorld0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HelloWorld")))
  )
  private[this] lazy val controllers_HelloWorldController_HelloWorld0_invoker = createInvoker(
    HelloWorldController_5.HelloWorld(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "HelloWorld",
      Nil,
      "GET",
      this.prefix + """HelloWorld""",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_HelloWorldController_helloSanjana1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("helloSanjana")))
  )
  private[this] lazy val controllers_HelloWorldController_helloSanjana1_invoker = createInvoker(
    HelloWorldController_5.helloSanjana(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "helloSanjana",
      Nil,
      "GET",
      this.prefix + """helloSanjana""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HelloWorldController_hello2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HelloWorldController_hello2_invoker = createInvoker(
    HelloWorldController_5.hello(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "hello",
      Seq(classOf[String]),
      "GET",
      this.prefix + """hello/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HelloWorldController_hellos3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hellos/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HelloWorldController_hellos3_invoker = createInvoker(
    HelloWorldController_5.hellos(fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "hellos",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """hellos/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BooksController_createBook4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_createBook4_invoker = createInvoker(
    BooksController_3.createBook(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "createBook",
      Nil,
      "POST",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BooksController_getBookById5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_getBookById5_invoker = createInvoker(
    BooksController_3.getBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getBookById",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BooksController_updateBookById6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_updateBookById6_invoker = createInvoker(
    BooksController_3.updateBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "updateBookById",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """books/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BooksController_deleteBookById7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_deleteBookById7_invoker = createInvoker(
    BooksController_3.deleteBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "deleteBookById",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """books/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BooksController_getAllBooks8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_getAllBooks8_invoker = createInvoker(
    BooksController_3.getAllBooks(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getAllBooks",
      Nil,
      "GET",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_FoodController_getFood9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods")))
  )
  private[this] lazy val controllers_FoodController_getFood9_invoker = createInvoker(
    FoodController_2.getFood(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "getFood",
      Nil,
      "GET",
      this.prefix + """foods""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index10_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CountController_count11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count11_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AsyncController_message12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message12_invoker = createInvoker(
    AsyncController_4.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_HelloWorldController_HelloWorld0_route(params@_) =>
      call { 
        controllers_HelloWorldController_HelloWorld0_invoker.call(HelloWorldController_5.HelloWorld())
      }
  
    // @LINE:5
    case controllers_HelloWorldController_helloSanjana1_route(params@_) =>
      call { 
        controllers_HelloWorldController_helloSanjana1_invoker.call(HelloWorldController_5.helloSanjana())
      }
  
    // @LINE:6
    case controllers_HelloWorldController_hello2_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HelloWorldController_hello2_invoker.call(HelloWorldController_5.hello(name))
      }
  
    // @LINE:7
    case controllers_HelloWorldController_hellos3_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Integer]("count", Some(17))) { (name, count) =>
        controllers_HelloWorldController_hellos3_invoker.call(HelloWorldController_5.hellos(name, count))
      }
  
    // @LINE:11
    case controllers_BooksController_createBook4_route(params@_) =>
      call { 
        controllers_BooksController_createBook4_invoker.call(BooksController_3.createBook())
      }
  
    // @LINE:12
    case controllers_BooksController_getBookById5_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_BooksController_getBookById5_invoker.call(BooksController_3.getBookById(Id))
      }
  
    // @LINE:13
    case controllers_BooksController_updateBookById6_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_BooksController_updateBookById6_invoker.call(BooksController_3.updateBookById(Id))
      }
  
    // @LINE:14
    case controllers_BooksController_deleteBookById7_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_BooksController_deleteBookById7_invoker.call(BooksController_3.deleteBookById(Id))
      }
  
    // @LINE:15
    case controllers_BooksController_getAllBooks8_route(params@_) =>
      call { 
        controllers_BooksController_getAllBooks8_invoker.call(BooksController_3.getAllBooks())
      }
  
    // @LINE:18
    case controllers_FoodController_getFood9_route(params@_) =>
      call { 
        controllers_FoodController_getFood9_invoker.call(FoodController_2.getFood())
      }
  
    // @LINE:22
    case controllers_HomeController_index10_route(params@_) =>
      call { 
        controllers_HomeController_index10_invoker.call(HomeController_1.index)
      }
  
    // @LINE:24
    case controllers_CountController_count11_route(params@_) =>
      call { 
        controllers_CountController_count11_invoker.call(CountController_0.count)
      }
  
    // @LINE:26
    case controllers_AsyncController_message12_route(params@_) =>
      call { 
        controllers_AsyncController_message12_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:29
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
