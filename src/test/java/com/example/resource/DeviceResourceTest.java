/**  
 * @Project: simple-service
 * @Title: DeviceResourceTest.java
 * @Package com.example.resource
 * @Description: TODO
 * @author qsdepth@foxmail.com
 * @date 2015-1-7 下午4:40:17
 * @Copyright: 2015 
 * @version V1.0  
 */

package com.example.resource;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.Main;
import com.example.model.Device;

/**
 * @ClassName DeviceResourceTest
 * @Description TODO
 * @author qsdepth@foxmail.com
 * @date 2015-1-7
 */

public class DeviceResourceTest extends DeviceResource {

	//全局字段
	private HttpServer server;
	private WebTarget target;
	
	@Before
	public void setUp() throws Exception {
		server = Main.startServer();
		Client c = ClientBuilder.newClient();
		target = c.target(Main.BASE_URI);
	}

	@After
	public void tearDown() throws Exception {
		server.shutdownNow();
	}

	/**
	 */
	@Test
	public void testGet() {
		String testIp = "12.10.68.143";
		//带参数的get请求
		Device device = target.path("device").queryParam("ip", testIp).request()
				.get(Device.class);
	}

	/**
	 */
	@Test
	public void testPut() {
		
	}

}
