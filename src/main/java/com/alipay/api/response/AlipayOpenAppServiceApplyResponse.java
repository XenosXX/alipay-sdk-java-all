package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-28 14:00:18
 */
public class AlipayOpenAppServiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6611464376913444416L;

	/** 
	 * 服务id
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
