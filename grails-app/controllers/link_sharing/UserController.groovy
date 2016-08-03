package link_sharing

import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_USER")
//@Secured("permitAll")
class UserController {

    def index() { }
}
