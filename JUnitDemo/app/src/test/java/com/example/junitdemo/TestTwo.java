package com.example.junitdemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTwo {
    @Test
    public void test_one_true() {
        assertEquals("ab", Two.two("a", "b"));
    }
}
