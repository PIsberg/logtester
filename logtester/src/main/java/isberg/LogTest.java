package isberg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//TODO: add unit tests instead of everything in main ..

public class LogTest {
	
	protected static final org.slf4j.Logger slf4jlogger = org.slf4j.LoggerFactory.getLogger(LogTest.class);
	
    public static void main(String[] args) {
    	
    	System.out.println("TRACE " + slf4jlogger.isTraceEnabled());
    	System.out.println("DEBUG " + slf4jlogger.isDebugEnabled());
    	System.out.println("ERROR " + slf4jlogger.isErrorEnabled());
    	System.out.println("INFO " + slf4jlogger.isInfoEnabled());
    	
    	
   //#Test 1 Stringconcatenation
//    	int i = 0;
//    	while(i<10000) {
//    		logger.debug("asdf" + "asdf" + i);
//    	}
    	
//    	   //# Test 2 Without Stringconcatenation
//     	System.out.println("asfasdf");
//    	int i = 0;
//    	while(i<10000) {
//    		logger.debug("asdf{}asdf", i);
//    	}
    	
    	
 	   //# Test 3 Check for trace level is turned on?
    	int i = 0;
    	while(i<10000) {
    		slf4jlogger.trace("asdf" + "asdf" + i);
    	}
    	
    	
  	   //# Test 4 Check for trace level is turned on?
//     	int i = 0;
//     	while(i<10000) {
//     		if(logger.isTraceEnabled()) {
//     			logger.trace("asdf" + "asdf" + i);
//     		}
//     	}
	}
}
