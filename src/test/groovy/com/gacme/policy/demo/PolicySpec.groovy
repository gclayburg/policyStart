package com.gacme.policy.demo

import groovy.util.logging.Slf4j
//import org.springframework.boot.test.context.SpringBootTest
import spock.lang.*


/**
 * <br><br>
 * Created 2019-03-06 15:51
 *
 * @author Gary Clayburg
 */
@Slf4j
class PolicySpec extends Specification {

    def "setup"() {
        log.info("setup spec")
    }

    def cleanup() {
        log.info("cleaning spec")
    }

    def setupSpec() {}

    def cleanupSpec() {}

    def "contextok"() {
        expect:
        true
    }
}
