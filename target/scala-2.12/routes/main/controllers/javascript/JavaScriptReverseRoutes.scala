// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tazbiafatima/Documents/Weigh-To-Go-Backend/conf/routes
// @DATE:Fri Mar 29 11:47:01 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:58
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseFoodController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def getFoodById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.getFoodById",
      """
        function(Id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "foods/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("Id", Id0))})
        }
      """
    )
  
    // @LINE:36
    def createFood: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.createFood",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "food"})
        }
      """
    )
  
    // @LINE:35
    def createFoods: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.createFoods",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "foods"})
        }
      """
    )
  
    // @LINE:37
    def updateFoodByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.updateFoodByName",
      """
        function(name0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "foods/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:38
    def deleteFoodById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.deleteFoodById",
      """
        function(Id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "foods/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("Id", Id0))})
        }
      """
    )
  
    // @LINE:33
    def getAllFood: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.getAllFood",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "foods"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getCurrentProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.getCurrentProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/me"})
        }
      """
    )
  
    // @LINE:28
    def createProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.createProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:29
    def updateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.updateProfile",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/me"})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def getCurrentUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getCurrentUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/me"})
        }
      """
    )
  
    // @LINE:48
    def deleteUserByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUserByName",
      """
        function(name0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:46
    def signInUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signInUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signin"})
        }
      """
    )
  
    // @LINE:45
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.registerUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:47
    def signOutUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signOutUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signout"})
        }
      """
    )
  
    // @LINE:43
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseImagesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def downloadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImagesController.downloadImage",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
          }
        
        }
      """
    )
  
    // @LINE:7
    def deleteImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImagesController.deleteImage",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:5
    def uploadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImagesController.uploadImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "images"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseFoodIntakeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def createFoodIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodIntakeController.createFoodIntake",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "foodIntake"})
        }
      """
    )
  
  }


}
