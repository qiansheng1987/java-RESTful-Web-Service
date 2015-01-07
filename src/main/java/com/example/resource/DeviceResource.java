/**  
 * @Project: simple-service
 * @Title: DeviceResource.java
 * @Package com.example
 * @Description: TODO
 * @author qsdepth@foxmail.com
 * @date 2015-1-7 ����4:21:54
 * @Copyright: 2015 
 * @version V1.0  
 */

package com.example.resource;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.example.model.Device;
import com.example.service.DeviceDao;

/**
 * @ClassName DeviceResource
 * @Description <p>
 *              ������Դ���������豸��REST API
 *              </p>
 * @author qsdepth@foxmail.com
 * @date 2015-1-7
 */

@Path("device")
public class DeviceResource {

	private final DeviceDao deviceDao;

	public DeviceResource() {
		deviceDao = new DeviceDao();
	}

	// GET����
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML })
	public Device get(@QueryParam("ip") final String deviceIp) {
		Device result = null;
		if (deviceIp != null) {
			result = deviceDao.getDevice(deviceIp);
		}
		return result;
	}

	// ��ע��3��PUT ����
	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Device put(final Device device) {
		Device result = null;
		if (device != null) {
			result = deviceDao.updateDevice(device);
		}
		return result;
	}
}
