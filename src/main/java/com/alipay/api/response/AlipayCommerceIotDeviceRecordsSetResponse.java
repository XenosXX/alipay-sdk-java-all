package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DeviceRecords;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.records.set response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-17 15:43:23
 */
public class AlipayCommerceIotDeviceRecordsSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2622661646822856816L;

	/** 
	 * 设备档案
	 */
	@ApiField("device_records")
	private DeviceRecords deviceRecords;

	public void setDeviceRecords(DeviceRecords deviceRecords) {
		this.deviceRecords = deviceRecords;
	}
	public DeviceRecords getDeviceRecords( ) {
		return this.deviceRecords;
	}

}
