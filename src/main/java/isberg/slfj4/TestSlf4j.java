package isberg.slfj4;

import isberg.Main;

public class TestSlf4j {
	
	protected static final org.slf4j.Logger slf4jlogger = org.slf4j.LoggerFactory.getLogger(Main.class);
	
	public void logStrConcat(int imax) {
    	int i = 0;
    	while(i<imax) {
    		slf4jlogger.debug("asdf" + "asdf" + i);
    	}
    	

	}

}
