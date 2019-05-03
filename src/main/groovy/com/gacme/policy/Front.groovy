package com.gacme.policy

import com.garyclayburg.attributes.AttributesClass
import com.garyclayburg.attributes.TargetAttribute
import com.garyclayburg.persistence.domain.User
@AttributesClass
class Front {
    @TargetAttribute(target="FRONTDOOR",attributeName = "email")
    static String mail(User user) {
        return user.userName
    }
}