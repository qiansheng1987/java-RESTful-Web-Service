/**  
 * @Project: simple-service
 * @Title: DeviceDao.java
 * @Package com.example.service
 * @Description: TODO
 * @author qsdepth@foxmail.com
 * @date 2015-1-7 ÏÂÎç4:27:25
 * @Copyright: 2015 
 * @version V1.0  
 */

package com.example.service;

import java.util.concurrent.ConcurrentHashMap;

import com.example.model.Device;

/**
 * @ClassName DeviceDao
 * @Description TODO
 * @author qsdepth@foxmail.com
 * @date 2015-1-7
 */

public class DeviceDao {
	
	ConcurrentHashMap<String, Device> fakeDB = new ConcurrentHashMap<String, Device>();
	public DeviceDao() {
		fakeDB.put("12.10.68.143", new Device("12.10.68.143"));
		fakeDB.put("12.10.68.168", new Device("12.10.68.168"));
	}
	
	public Device getDevice(String ip) {
		return fakeDB.get(ip);
	}
	
	public Device updateDevice(Device device) {
		String ip = device.getIp();
		fakeDB.put(ip, device);
		return fakeDB.get(ip);
	}
}








