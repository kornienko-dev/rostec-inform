package com.kornienko

import spock.lang.Specification

class MainTest extends Specification {
    def "test"() {
        given:
        def expected = [1: 2L, 3: 1L, 4: 2L, 5: 2L]

        when:
        def actual = Main.transform([1, 3, 4, 5, 1, 5, 4] as Integer[])
        
        then:
        actual == expected
    }
}
