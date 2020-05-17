package com.example.junitdemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOne {
    @Test
    public void test_one_true() {
        assertEquals("ab", One.one("a", "b"));
    }
}
