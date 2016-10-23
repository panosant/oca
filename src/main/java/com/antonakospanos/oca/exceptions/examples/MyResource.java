package com.antonakospanos.oca.exceptions.examples;

import java.io.IOException;

public class MyResource implements AutoCloseable {

	@Override
	public void close() throws IOException {
		try {
			// close resource
		} catch (Exception e) {
			throw new IOException("Could not close resource. Cause: ", e);
		}
	}
}
