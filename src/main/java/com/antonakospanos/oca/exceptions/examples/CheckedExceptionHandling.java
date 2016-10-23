package com.antonakospanos.oca.exceptions.examples;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class CheckedExceptionHandling {
	
	public static void handleResources() {
		try (MyResource m = new MyResource()) {
			// Happy path code
		} catch (IOException ioe) {
			// Handling of checked exception
		} finally {
			// Final execution along with resources release!
		}
	}
	
	public static void handleSocketResources() {
		try (Socket s = new Socket();	InputStream is = s.getInputStream()) {
			// Happy path code
		} catch (IOException ioe) {
			// Handling of checked exception
		} finally {
			// Final execution along with resources release!
		}
	}
}
