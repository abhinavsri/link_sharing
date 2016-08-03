import com.link.Role
import com.link.User
import com.link.UserRole
class BootStrap {

    def init = { servletContext ->
        println("**********")
        Role roleAdmin=new Role(authority:"ROLE_ADMIN").save(flush:true,failOnError: true)

        println("4444444")
        User userAdmin =new User(username: "admin",email:"abc@gamil.com",password: "123456",firstName: "admin_first",lastName: "admin_last", isAdmin: true, isActive:true)
        println("11111111111")
        userAdmin.save(flush:true,failOnError: true)

        println("-------------")

        Role roleUser=new Role(authority:"ROLE_USER")
        roleUser.save(flush:true,failOnError: true)
        println("55555555")
        UserRole.create(userAdmin,roleAdmin,true)
        println("Role created 1")
        UserRole.create(userAdmin,roleUser,true)
        println("Role created 2")

    }
    def destroy = {
    }
}
