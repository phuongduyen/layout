package com.example.junitdemo;

import android.content.Context;
import android.content.Intent;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testIcheck() {
        assertTrue(MainActivity.icheck(2, 4));
    }


    @Test
    public void testCreateIntent(){
        Context context = Mockito.mock(Context.class);
        Intent t = MainActivity.createIntent(context, "edd");
        assertNotNull(t);
    }

}