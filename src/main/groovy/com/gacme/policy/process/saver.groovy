package com.gacme.policy.process

//@Grapes([
//  @Grab('com.garyclayburg:stepsapi:0.6')
//])
//@Grapes(
//        @Grab(group='org.apache.logging.log4j', module='log4j-core', version='2.10.0')
//)
import com.garyclayburg.stepsdsl.StepsBaseClass
import groovy.transform.BaseScript

/**
 * <br><br>
 * Created 2019-03-16 10:39
 *
 * @author Gary Clayburg
 */

@BaseScript StepsBaseClass baseClass
println 'begin'
createNewUser()
createReplace('usersink')

def myc = {123}

def isodd = { int i -> i%2 != 0 }

CharSequence A = "21"
String B = "21".substring(0)

System.out.println("a is "+ A)
println "A is $A"
println "B is $B"
println "EQ is " + (B==A)
