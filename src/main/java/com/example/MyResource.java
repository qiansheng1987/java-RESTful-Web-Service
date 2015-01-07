/**  
 * @Project: simple-service
 * @Title: MyResource.java
 * @Package com.example
 * @Description: TODO
 * @author qsdepth@foxmail.com
 * @date 2015-1-7 下午3:58:23
 * @Copyright: 2015 
 * @version V1.0  
 */

package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @ClassName MyResource
 * @Description TODO
 * @author qsdepth@foxmail.com
 * @date 2015-1-7
 */

//资源路径
@Path("myresource")
public class MyResource {
	
	//资源方法
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got it";
	}
}
















