package com.galvanize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EchoTest {

    @Test
    public void testShoutReturnsUpperCase(){
        // setup
        Echo echo = new Echo();
        // execution
        String result = echo.shout("hello");
        // assertions
        assertEquals("HELLO!", result);
    }
}
