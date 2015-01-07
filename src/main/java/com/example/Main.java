package com.example;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {

	// 服务器路径
	public static final String BASE_URI = "http://localhost:8080/myapp/";

	public static HttpServer startServer() {
		// 加载资源
		final ResourceConfig rc = new ResourceConfig().packages("com.example");
		// Grizzly HTTP 服务器
		return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI),
				rc);
	}

	public static void main(String[] args) throws IOException {
		final HttpServer server = startServer();
		System.out.println(String.format(
				"Jersey app started with WADL available at "
						+ "%sapplication.wadl\nHit enter to stop it...",
				BASE_URI));
		System.in.read();
		server.shutdownNow();
	}
}
