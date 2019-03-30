// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tazbiafatima/Documents/Weigh-To-Go-Backend/conf/routes
// @DATE:Fri Mar 29 11:47:01 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:58
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:33
  class ReverseFoodController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def getFoodById(Id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "foods/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("Id", Id)))
    }
  
    // @LINE:36
    def createFood(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "food")
    }
  
    // @LINE:35
    def createFoods(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "foods")
    }
  
    // @LINE:37
    def updateFoodByName(name:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "foods/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:38
    def deleteFoodById(Id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "foods/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("Id", Id)))
    }
  
    // @LINE:33
    def getAllFood(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "foods")
    }
  
  }

  // @LINE:28
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getCurrentProfile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile/me")
    }
  
    // @LINE:28
    def createProfile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:29
    def updateProfile(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "profile/me")
    }
  
  }

  // @LINE:53
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:43
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def getCurrentUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/me")
    }
  
    // @LINE:48
    def deleteUserByName(name:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:46
    def signInUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "users/signin")
    }
  
    // @LINE:45
    def registerUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:47
    def signOutUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "users/signout")
    }
  
    // @LINE:43
    def getAllUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
  }

  // @LINE:51
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:55
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:5
  class ReverseImagesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def downloadImage(id:String): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:6
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "images/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:7
    def deleteImage(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "images/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:5
    def uploadImage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "images")
    }
  
  }

  // @LINE:25
  class ReverseFoodIntakeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def createFoodIntake(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "foodIntake")
    }
  
  }


}
