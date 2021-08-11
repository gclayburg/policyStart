package com.gacme.policy

import com.garyclayburg.attributes.AttributesClass
import com.garyclayburg.attributes.TargetAttribute
import com.garyclayburg.persistence.domain.MainUser
@AttributesClass
class Front {

    @TargetAttribute(target="FRONTDOOR",attributeName = "userName")
    static String username(MainUser user) {
        return user.userName
    }

    @TargetAttribute(target="FRONTDOOR",attributeName = "id")
    static String id(MainUser user) {
        return user.id
    }
}
