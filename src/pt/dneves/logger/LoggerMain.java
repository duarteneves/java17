package pt.dneves.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerMain {

	
	private static Logger logger = Logger.getLogger(LoggerMain.class.getName());

	
	public static void main(String[] args) {

		defineLogger();
		
		logger.setLevel(Level.INFO);

		
		try {

			// ...

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Your error message", e);
		}

		logger.log(Level.INFO, "Your message");
		logger.info("Your message");
		
		
		/*
		 * SEVERE
		 * WARNING 
		 * INFO 
		 * CONFIG 
		 * FINE 
		 * FINER 
		 * FINEST
		 */

		// API
		logger.setLevel(Level.FINEST);
		loggingEnteringExisting();

		
		// good practices

		logger.setLevel(Level.FINE);

		
		String id = "2";
		
		
		if(Integer.valueOf(id) < 50) {
			throw new NullPointerException();
		}
		
		
		

		logger.log(Level.FINE, "Product " + id + " has been selected");

		if (logger.isLoggable(Level.FINE)) {
			logger.log(Level.FINE, "Product " + id + " has been selected");
		}
		
		logger.log(Level.FINE, "Product {0} has been selected", id);

	}

	public static void loggingEnteringExisting() {

		logger.entering(LoggerMain.class.getName(), "loggingEnteringExisting");

		// ...
		
		logger.exiting(LoggerMain.class.getName(), "loggingEnteringExisting");

	}

	public static void defineLogger() {

		
//		Handler[] handlers = logger.getHandlers();
//
//		logger.addHandler(new ConsoleHandler());
//		handlers = logger.getHandlers();
//
//		for (Handler handler : handlers) {
//			handler.setLevel(Level.CONFIG);
//		}

		
		// Root
		
		Logger rootLogger = Logger.getLogger("");

		Handler[] handlers = rootLogger.getHandlers();

		for (Handler handler : handlers) {
			handler.setLevel(Level.FINEST);
		}

	}

}
