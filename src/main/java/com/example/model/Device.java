/**  
 * @Project: simple-service
 * @Title: Device.java
 * @Package com.example
 * @Description: TODO
 * @author qsdepth@foxmail.com
 * @date 2015-1-7 下午4:14:56
 * @Copyright: 2015 
 * @version V1.0  
 */

package com.example.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName Device
 * @Description 
 * <p>
 * 	Jersey 内部使用JAXB 处理Java 类（POJO）和XML 格式的信息、JSON 格式的信息映射，
	JAXB 通过POJO 中定义的XML 注解（比如@XmlRootElement 代表根节点，@XmlAttribute
	代表一个节点的属性等）将其与XML 格式的信息对应起来。
 * </p>
 * @author qsdepth@foxmail.com
 * @date 2015-1-7
 */

//JAXB 根元素(javax.xml.bind...)
@XmlRootElement(name = "device")
public class Device {
	
	private String deviceIp;
	private int deviceStatus;
	
	public Device() {
	}
	
	public Device(String deviceIp) {
		super();
		this.deviceIp = deviceIp;
	}
	
	//JAXB属性 
	@XmlAttribute
	public String getIp() {
		return deviceIp;
	}
	
	public void setIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}
	
	@XmlAttribute
	public int getStatus() {
		return deviceStatus;
	}
	
	public void seStatus(int deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
}











