/**  
 * @Project: simple-service
 * @Title: Device.java
 * @Package com.example
 * @Description: TODO
 * @author qsdepth@foxmail.com
 * @date 2015-1-7 ����4:14:56
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
 * 	Jersey �ڲ�ʹ��JAXB ����Java �ࣨPOJO����XML ��ʽ����Ϣ��JSON ��ʽ����Ϣӳ�䣬
	JAXB ͨ��POJO �ж����XML ע�⣨����@XmlRootElement ������ڵ㣬@XmlAttribute
	����һ���ڵ�����Եȣ�������XML ��ʽ����Ϣ��Ӧ������
 * </p>
 * @author qsdepth@foxmail.com
 * @date 2015-1-7
 */

//JAXB ��Ԫ��(javax.xml.bind...)
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
	
	//JAXB���� 
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











