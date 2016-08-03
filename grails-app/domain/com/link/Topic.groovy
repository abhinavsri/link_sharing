package com.link

class Topic {
    String name
    User createdBy
    Date dateCreate
    Date dateUpdate
    //add Enum


    static hasMany = [subscriptions:Subscription]
    static constraints = {
    }
}
