package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-13 14:21:44
 */
public class AlipayCommerceYuntaskAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3831789948446852758L;

	/** 
	 * 签约状态，TEMP：暂存，协议未生效过；NORMAL：正常；STOP：暂停
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
