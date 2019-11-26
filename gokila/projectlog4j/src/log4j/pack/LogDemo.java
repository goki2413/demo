package log4j.pack;

import org.apache.log4j.Logger;



public class LogDemo {

	  final static Logger logger=Logger.getLogger(LogDemo.class);
	
	
	void meth1(){
		logger.debug("this is debug");
		logger.info("this is info");
		logger.warn("this is warning");
		logger.error("this is error");
		logger.fatal("this is fatal");
}
	
public static void main(String[] args) {
		LogDemo logdemo=new LogDemo();
		logdemo.meth1();

	}

}
