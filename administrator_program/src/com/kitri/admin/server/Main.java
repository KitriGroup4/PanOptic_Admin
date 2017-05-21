package com.kitri.admin.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static boolean isLog = true;
    public static Server server;
    
    public static void main(String[] args) {
	server = new Server();
	server.start();

//	Thread.sleep(500);

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	reader.readLine();

	server.stop();

	System.out.println("BYE");
//	addLog("disconnect client");
    }

    public static void log(String str) {
	if (isLog) {
	    System.out.println(str);
	}
    }
    
    public static void log(int str) {
	if (isLog) {
	    System.out.println(str);
	}
    }

}
