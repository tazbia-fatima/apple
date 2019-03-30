// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tazbiafatima/Documents/Weigh-To-Go-Backend/conf/routes
// @DATE:Fri Mar 29 11:47:01 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  ImagesController_8: controllers.ImagesController,
  // @LINE:25
  FoodIntakeController_4: controllers.FoodIntakeController,
  // @LINE:28
  ProfileController_6: controllers.ProfileController,
  // @LINE:33
  FoodController_2: controllers.FoodController,
  // @LINE:43
  UserController_5: controllers.UserController,
  // @LINE:51
  HomeController_1: controllers.HomeController,
  // @LINE:53
  CountController_0: controllers.CountController,
  // @LINE:55
  AsyncController_3: controllers.AsyncController,
  // @LINE:58
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    ImagesController_8: controllers.ImagesController,
    // @LINE:25
    FoodIntakeController_4: controllers.FoodIntakeController,
    // @LINE:28
    ProfileController_6: controllers.ProfileController,
    // @LINE:33
    FoodController_2: controllers.FoodController,
    // @LINE:43
    UserController_5: controllers.UserController,
    // @LINE:51
    HomeController_1: controllers.HomeController,
    // @LINE:53
    CountController_0: controllers.CountController,
    // @LINE:55
    AsyncController_3: controllers.AsyncController,
    // @LINE:58
    Assets_7: controllers.Assets
  ) = this(errorHandler, ImagesController_8, FoodIntakeController_4, ProfileController_6, FoodController_2, UserController_5, HomeController_1, CountController_0, AsyncController_3, Assets_7, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ImagesController_8, FoodIntakeController_4, ProfileController_6, FoodController_2, UserController_5, HomeController_1, CountController_0, AsyncController_3, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.ImagesController.uploadImage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImagesController.downloadImage(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImagesController.deleteImage(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foodIntake""", """controllers.FoodIntakeController.createFoodIntake()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.createProfile()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/me""", """controllers.ProfileController.updateProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/me""", """controllers.ProfileController.getCurrentProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods""", """controllers.FoodController.getAllFood()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods/""" + "$" + """Id<[^/]+>""", """controllers.FoodController.getFoodById(Id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods""", """controllers.FoodController.createFoods()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """food""", """controllers.FoodController.createFood()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods/""" + "$" + """name<[^/]+>""", """controllers.FoodController.updateFoodByName(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods/""" + "$" + """Id<[^/]+>""", """controllers.FoodController.deleteFoodById(Id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.ImagesController.downloadImage(Id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getAllUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/me""", """controllers.UserController.getCurrentUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.registerUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signin""", """controllers.UserController.signInUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signout""", """controllers.UserController.signOutUser()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """name<[^/]+>""", """controllers.UserController.deleteUserByName(name:String)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_ImagesController_uploadImage0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImagesController_uploadImage0_invoker = createInvoker(
    ImagesController_8.uploadImage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "uploadImage",
      Nil,
      "POST",
      this.prefix + """images""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ImagesController_downloadImage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImagesController_downloadImage1_invoker = createInvoker(
    ImagesController_8.downloadImage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "downloadImage",
      Seq(classOf[String]),
      "GET",
      this.prefix + """images/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ImagesController_deleteImage2_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImagesController_deleteImage2_invoker = createInvoker(
    ImagesController_8.deleteImage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "deleteImage",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """images/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_FoodIntakeController_createFoodIntake3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foodIntake")))
  )
  private[this] lazy val controllers_FoodIntakeController_createFoodIntake3_invoker = createInvoker(
    FoodIntakeController_4.createFoodIntake(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodIntakeController",
      "createFoodIntake",
      Nil,
      "POST",
      this.prefix + """foodIntake""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ProfileController_createProfile4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_createProfile4_invoker = createInvoker(
    ProfileController_6.createProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "createProfile",
      Nil,
      "POST",
      this.prefix + """profile""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ProfileController_updateProfile5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/me")))
  )
  private[this] lazy val controllers_ProfileController_updateProfile5_invoker = createInvoker(
    ProfileController_6.updateProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "updateProfile",
      Nil,
      "PUT",
      this.prefix + """profile/me""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ProfileController_getCurrentProfile6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/me")))
  )
  private[this] lazy val controllers_ProfileController_getCurrentProfile6_invoker = createInvoker(
    ProfileController_6.getCurrentProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "getCurrentProfile",
      Nil,
      "GET",
      this.prefix + """profile/me""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_FoodController_getAllFood7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods")))
  )
  private[this] lazy val controllers_FoodController_getAllFood7_invoker = createInvoker(
    FoodController_2.getAllFood(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "getAllFood",
      Nil,
      "GET",
      this.prefix + """foods""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_FoodController_getFoodById8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FoodController_getFoodById8_invoker = createInvoker(
    FoodController_2.getFoodById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "getFoodById",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """foods/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_FoodController_createFoods9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods")))
  )
  private[this] lazy val controllers_FoodController_createFoods9_invoker = createInvoker(
    FoodController_2.createFoods(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "createFoods",
      Nil,
      "POST",
      this.prefix + """foods""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_FoodController_createFood10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("food")))
  )
  private[this] lazy val controllers_FoodController_createFood10_invoker = createInvoker(
    FoodController_2.createFood(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "createFood",
      Nil,
      "POST",
      this.prefix + """food""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_FoodController_updateFoodByName11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FoodController_updateFoodByName11_invoker = createInvoker(
    FoodController_2.updateFoodByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "updateFoodByName",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """foods/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_FoodController_deleteFoodById12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FoodController_deleteFoodById12_invoker = createInvoker(
    FoodController_2.deleteFoodById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "deleteFoodById",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """foods/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_ImagesController_downloadImage13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImagesController_downloadImage13_invoker = createInvoker(
    ImagesController_8.downloadImage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "downloadImage",
      Seq(classOf[String]),
      "GET",
      this.prefix + """images""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_UserController_getAllUsers14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getAllUsers14_invoker = createInvoker(
    UserController_5.getAllUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getAllUsers",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_UserController_getCurrentUser15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/me")))
  )
  private[this] lazy val controllers_UserController_getCurrentUser15_invoker = createInvoker(
    UserController_5.getCurrentUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getCurrentUser",
      Nil,
      "GET",
      this.prefix + """users/me""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_UserController_registerUser16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_registerUser16_invoker = createInvoker(
    UserController_5.registerUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerUser",
      Nil,
      "POST",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_UserController_signInUser17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signin")))
  )
  private[this] lazy val controllers_UserController_signInUser17_invoker = createInvoker(
    UserController_5.signInUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signInUser",
      Nil,
      "PUT",
      this.prefix + """users/signin""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_UserController_signOutUser18_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signout")))
  )
  private[this] lazy val controllers_UserController_signOutUser18_invoker = createInvoker(
    UserController_5.signOutUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signOutUser",
      Nil,
      "PUT",
      this.prefix + """users/signout""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_UserController_deleteUserByName19_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUserByName19_invoker = createInvoker(
    UserController_5.deleteUserByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUserByName",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """users/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_HomeController_index20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index20_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_CountController_count21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count21_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_AsyncController_message22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message22_invoker = createInvoker(
    AsyncController_3.message,
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

  // @LINE:58
  private[this] lazy val controllers_Assets_versioned23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned23_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:5
    case controllers_ImagesController_uploadImage0_route(params@_) =>
      call { 
        controllers_ImagesController_uploadImage0_invoker.call(ImagesController_8.uploadImage())
      }
  
    // @LINE:6
    case controllers_ImagesController_downloadImage1_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImagesController_downloadImage1_invoker.call(ImagesController_8.downloadImage(id))
      }
  
    // @LINE:7
    case controllers_ImagesController_deleteImage2_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImagesController_deleteImage2_invoker.call(ImagesController_8.deleteImage(id))
      }
  
    // @LINE:25
    case controllers_FoodIntakeController_createFoodIntake3_route(params@_) =>
      call { 
        controllers_FoodIntakeController_createFoodIntake3_invoker.call(FoodIntakeController_4.createFoodIntake())
      }
  
    // @LINE:28
    case controllers_ProfileController_createProfile4_route(params@_) =>
      call { 
        controllers_ProfileController_createProfile4_invoker.call(ProfileController_6.createProfile())
      }
  
    // @LINE:29
    case controllers_ProfileController_updateProfile5_route(params@_) =>
      call { 
        controllers_ProfileController_updateProfile5_invoker.call(ProfileController_6.updateProfile())
      }
  
    // @LINE:30
    case controllers_ProfileController_getCurrentProfile6_route(params@_) =>
      call { 
        controllers_ProfileController_getCurrentProfile6_invoker.call(ProfileController_6.getCurrentProfile())
      }
  
    // @LINE:33
    case controllers_FoodController_getAllFood7_route(params@_) =>
      call { 
        controllers_FoodController_getAllFood7_invoker.call(FoodController_2.getAllFood())
      }
  
    // @LINE:34
    case controllers_FoodController_getFoodById8_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_FoodController_getFoodById8_invoker.call(FoodController_2.getFoodById(Id))
      }
  
    // @LINE:35
    case controllers_FoodController_createFoods9_route(params@_) =>
      call { 
        controllers_FoodController_createFoods9_invoker.call(FoodController_2.createFoods())
      }
  
    // @LINE:36
    case controllers_FoodController_createFood10_route(params@_) =>
      call { 
        controllers_FoodController_createFood10_invoker.call(FoodController_2.createFood())
      }
  
    // @LINE:37
    case controllers_FoodController_updateFoodByName11_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_FoodController_updateFoodByName11_invoker.call(FoodController_2.updateFoodByName(name))
      }
  
    // @LINE:38
    case controllers_FoodController_deleteFoodById12_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_FoodController_deleteFoodById12_invoker.call(FoodController_2.deleteFoodById(Id))
      }
  
    // @LINE:40
    case controllers_ImagesController_downloadImage13_route(params@_) =>
      call(params.fromQuery[String]("Id", None)) { (Id) =>
        controllers_ImagesController_downloadImage13_invoker.call(ImagesController_8.downloadImage(Id))
      }
  
    // @LINE:43
    case controllers_UserController_getAllUsers14_route(params@_) =>
      call { 
        controllers_UserController_getAllUsers14_invoker.call(UserController_5.getAllUsers())
      }
  
    // @LINE:44
    case controllers_UserController_getCurrentUser15_route(params@_) =>
      call { 
        controllers_UserController_getCurrentUser15_invoker.call(UserController_5.getCurrentUser())
      }
  
    // @LINE:45
    case controllers_UserController_registerUser16_route(params@_) =>
      call { 
        controllers_UserController_registerUser16_invoker.call(UserController_5.registerUser())
      }
  
    // @LINE:46
    case controllers_UserController_signInUser17_route(params@_) =>
      call { 
        controllers_UserController_signInUser17_invoker.call(UserController_5.signInUser())
      }
  
    // @LINE:47
    case controllers_UserController_signOutUser18_route(params@_) =>
      call { 
        controllers_UserController_signOutUser18_invoker.call(UserController_5.signOutUser())
      }
  
    // @LINE:48
    case controllers_UserController_deleteUserByName19_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_UserController_deleteUserByName19_invoker.call(UserController_5.deleteUserByName(name))
      }
  
    // @LINE:51
    case controllers_HomeController_index20_route(params@_) =>
      call { 
        controllers_HomeController_index20_invoker.call(HomeController_1.index)
      }
  
    // @LINE:53
    case controllers_CountController_count21_route(params@_) =>
      call { 
        controllers_CountController_count21_invoker.call(CountController_0.count)
      }
  
    // @LINE:55
    case controllers_AsyncController_message22_route(params@_) =>
      call { 
        controllers_AsyncController_message22_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:58
    case controllers_Assets_versioned23_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned23_invoker.call(Assets_7.versioned(path, file))
      }
  }
}
