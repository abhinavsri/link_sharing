package com

import grails.validation.Validateable
import com.link.User
/**
 * Created by abhinav on 2/8/16.
 */

@Validateable
class UserCO {
    String email
    String username
    String password
    String confirmPassword

    static  constraints={
        username blank:false,validator:{val,obj->
            if(User.findByUsername(val)) {
                return "please enter the unique username"
            }
        }
        email validator:{val,obj->
            if(User.findByEmail(val)){
                return "please enter the unique username"
            }
        }

        password blank:false

        confirmPassword blank:false ,validator:{val,obj->
            if(!(obj.password.compareTo(val)==0))
            {
                return "enter the correct paasword"
            }
        }
    }
}
