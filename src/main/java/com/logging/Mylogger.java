package com.logging;

import java.nio.file.Path;

import java.nio.file.Paths;
import java.util.logging.FileHandler;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Mylogger {
	private static Logger logger = Logger.getLogger("Mylog");

	static {
		
		FileHandler fh;
		
		try {
			fh = new FileHandler("C:/Users/jveer/eclipse-workspace/LoginModule/MylogFile.log",true);
			//String currentUserHomeDir = System.getProperty("user.dir");
			//Path currentDirPath = Paths.get("");
	        //String currentDir = currentDirPath.toAbsolutePath().toString();
			//fh= new FileHandler(currentDir+System.getProperty("file.separator")+"MyLogFile.log",true);

			//System.out.println(System.getProperty("user.dir")+System.getProperty("file.separator")+"MyLogFile.log");
			//System.out.println(System.getProperty("User.dir")+System.getProperty("file.separator"));
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
			logger.info("Logger Initialized");
			
		}catch(Exception e) {
			logger.log(Level.WARNING, "Exception ::", e);
		}
	}
	
	public static void writeToLog(String msg) {
		logger.info(msg);
	}
	public static void writeToLog(String msg, Exception exp) {
		logger.log(Level.WARNING,msg,exp);
		
	}
	
	
	
		
}

