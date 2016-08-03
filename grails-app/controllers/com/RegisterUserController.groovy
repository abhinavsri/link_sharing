package com
import com.link.User
import grails.plugin.springsecurity.annotation.Secured

@Secured("permitAll")
class RegisterUserController {
    def registerUserService

    def index() { }
    def register(UserCO userCO)
    {
    if(userCO.validate())
    {
        println(params)
        User user=registerUserService.registerUser(params)
        println("success")
    //User user=new User(username: params.username,email: params.email,password: params.password,firstName: params.firstName,)
    }
        else {
        userCO.errors.each{print it}
    }
    }
}
