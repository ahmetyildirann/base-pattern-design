package com.bootcamp.basePatternDesign;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.*;

public class TestTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }
    @Test
    void test() {
        System.out.println("Test");
    }

    @Test
    void test1() {
        System.out.println("Test1");
    }

    @Test
    void test2() {
        System.out.println("Test2");
    }

    @Test
    void test3() {
        System.out.println("Test3");
    }
}
