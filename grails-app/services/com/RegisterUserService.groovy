package com

import com.link.User
import grails.transaction.Transactional

@Transactional
class RegisterUserService {

    def serviceMethod() {

    }
    User registerUser(params){
        println("inside service beofre save")
        User user=new User(username: params.username,email: params.email,password: params.password,firstName: params.firstName,lastName: params.lastName,isActive: true,isAdmin: false)
        
        user.save(flush: true,failOnError: true)
        println("inside service beofre save")
        user
    }
}
