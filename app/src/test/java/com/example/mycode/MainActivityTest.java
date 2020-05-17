package com.example.mycode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void emailvalidationtest() {
        final String emailstring="nemichand@gmail.com";
        boolean output,expected=true;
        MainActivity obj=new MainActivity();
        output=obj.emailvalidationtest(emailstring);
        assertEquals(expected,output);
    }
}