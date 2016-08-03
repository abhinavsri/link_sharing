package login
import com.link.User
import grails.plugin.springsecurity.annotation.Secured

@Secured("permitAll")
class UserRoleController {

    def index() {}
    def decide(){
        String username=params.username
        println(username)
        if(User.findByUsername(username))
        {
            User user=User.findByUsername(username)
            println(user.username)
            //  def userRole=user.getAuthorities()
//            userRole.each {
//                print it
//            }
            if(user.isAdmin)
            {
                println("ads")
                redirect(controller: "admin")
//                render "user_role isAdmin"
                // render (view:"/isAdmin/index",model: [user:user])
            }
            else{
                render"user_role user"}

//            if(userRole.contains("ROLE_ADMIN"))
//            {
//                render "user isAdmin"
//               // render (view:"/isAdmin/index",model: [user:user])
//            }
//            else if(userRole.contains("USER_ROLE"))
//            {
//                render "user role"
//            }
        }


        else{
            render "you are not registered"
        }

    }
    }

