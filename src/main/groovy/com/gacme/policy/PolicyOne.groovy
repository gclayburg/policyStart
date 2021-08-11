package com.gacme.policy

import com.garyclayburg.attributes.AttributesClass
import com.garyclayburg.attributes.ConnectedMatchClass
import com.garyclayburg.attributes.TargetAttribute
import com.garyclayburg.persistence.domain.MainUser

@AttributesClass
@ConnectedMatchClass
class PolicyOne {
    @TargetAttribute(target = "usersink", attributeName = "userName")
    static String username(MainUser user) {
        user.userName
    }
}
