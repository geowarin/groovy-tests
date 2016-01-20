import spock.lang.Specification
import spock.lang.Unroll

class MySpec extends Specification {

    @Unroll
    def "max(#a,#b) == #c"() {
        expect:
        MyClass.max(a, b) == c

        where:
        a  | b   | c
        1  | 2   | 2
        42 | -12 | 42
        42 | -12 | -42
    }
}
