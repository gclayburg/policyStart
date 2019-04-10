//@Grapes([
//  @Grab('com.garyclayburg:stepsapi:0.6'),
//  @Grab('org.apache.ivy:ivy:2.3.0')])
import com.garyclayburg.attributes.AttributesClass
import com.garyclayburg.attributes.ConnectedMatchClass
import com.garyclayburg.attributes.NewUser
import com.garyclayburg.attributes.TargetAttribute
import com.garyclayburg.persistence.domain.User
import com.garyclayburg.stepsdsl.UserFragment
import groovy.transform.CompileStatic


@AttributesClass
@ConnectedMatchClass
class PolicyOne {

    @TargetAttribute(target = "usersink", attributeName = "userName")
    static String usern(User user) {
        user.userName
    }

//    @CompileStatic
//    @NewUser(target = "emailman")
//    static User usermaker(UserFragment userFragment) {
//        new User(userName: userFragment.userName)
//    }

    @CompileStatic
    @NewUser(target = "emailman")
    static User usermakerr(UserFragment userFragment) {
        if (userFragment.emails != null) {
            new User(userName: userFragment.emails[0].value)
        } else {
            new User(userName: userFragment.userName)
        }
    }

//        new User(userName: userFragment.userName.substring(0,1) + userFragment.userName)
//        def newusername
//        if (userFragment.emails != null && userFragment.emails[0] != null) {
//            newusername = userFragment.emails[0].value
//        } else {
//            newusername = userFragment.userName
//        }
//        new User(userName: newusername)



//        new User(userName: userFragment?.emails[0]?.value ?: "oops")

//        new User(userName: userFragment.emails[0].value)
//        new User(userName: userFragment.userName)
//    }


}