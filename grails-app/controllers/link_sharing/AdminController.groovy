package link_sharing

import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_ADMIN")
class AdminController {

    def index() {
       render "i am inside admin controller"
    }
}
