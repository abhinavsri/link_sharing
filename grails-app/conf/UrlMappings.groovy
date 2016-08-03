class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

      //  "/"(view:"/index")
        "/"(view:"/welcome")
//
        //"/"(view:"/view/welcome")
        "500"(view:'/error')
	}
}
