// http://koji-k.github.io/groovy-tutorial/unit-test/index.html
@Grab(group='org.spockframework', module='spock-core', version='1.1-groovy-2.4')
import spock.lang.*

class MyFirstSpock extends Specification {

    // execute everytime
    Date date = new Date()

    // executed once
    @Shared
    Date date2 = new Date()

    def setup() {
        println "setup"
        println date.getTime()
    }

    def setupSpec() {
        println "setupSeec"
    }

    def cleanup() {
        println "cleanup"
    }

    def cleanupSpec() {
        println "cleanupSpec"
    }

    def "Hello spock"() {
        setup: "せっとあっぷ"
        List list = (1..10).toList()

        when:
        list.add(100)

        then:
        list.size() == 11
        list.last() == 100

        cleanup:
        list = null
    }

    @Unroll // make separate tests
    def "addition '#left + #right'"() {
        expect:
        left + right == result

        where:
        left|right||result
        3|4||7
        9|13||22
        33|93||126
        // 1|2|4 // falure
    }

}


