package com.link

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class User implements Serializable {

	private static final long serialVersionUID = 1

	transient springSecurityService

	String username
	String email
	String password
	String firstName
	String lastName
	//byte photo
	boolean isAdmin
	boolean isActive
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired


	static hasMany=[topics:Topic]




	User(String username, String password) {
		this()
		this.username = username
		this.password = password
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this)*.role
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}

	static transients = ['springSecurityService']

	static constraints = {
		username blank: false, unique: true
		password blank: false
		firstName blank:false, nullable:false
		lastName blank: false
		isAdmin blank:false
		password blank: false,minSize:3
	}

	static mapping = {
		password column: '`password`'
	}
}
