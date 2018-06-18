package com.migu.csdexercise.numberchains

import spock.lang.Specification

import static org.junit.Assert.assertEquals

class NumberChainsSpockTest extends Specification {
    void setup() {
    }

    def "测试当输入123456789时，输出为2"() {
        given:""
        when:"输入123456789"
        NumberChains numberChains = new NumberChains("123456789")
        then:"输出2"
        assertEquals(2,numberChains.calChainLength())
    }

    def "测试当输入1234时，输出为4"() {
        given:""
        when:"输入1234"
        NumberChains numberChains = new NumberChains("1234")
        then:"输出4"
        assertEquals(4,numberChains.calChainLength())
    }

    def "测试当输入0000时，输出为2"() {
        given:""
        when:"输入0000"
        NumberChains numberChains = new NumberChains("0000")
        then:"输出2"
        assertEquals(2,numberChains.calChainLength())
    }
}
