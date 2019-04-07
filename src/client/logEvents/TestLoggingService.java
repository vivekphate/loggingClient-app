package client.logEvents;

import java.util.Scanner;

import log.services.LoggerService;
import log.services.impl.LoggerServiceImpl;

public class TestLoggingService {
	
	public static void main(String s[]) {
		LoggerService service = new LoggerServiceImpl();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter log level : 	INFO, DEBUG, WARN, ERROR, FATAL");
		
		String logLevel = sc.next();
		
		System.out.println("Enter namespace: ");
		String ns = sc.next();
		
		String logMsg = "App Testing log";
		
		service.logMsg(logMsg, logLevel, ns);
		
	}
}
