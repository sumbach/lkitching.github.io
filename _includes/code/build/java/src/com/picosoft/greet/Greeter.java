package com.picosoft.greet;

public class Greeter {
    public void greet(String who, boolean excite) {
	String message = excite ?
	    String.format("Hello %s!", who) :
	    String.format("Hello %s", who);
	System.out.println(message);
    }
}
