package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.business.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-27 10:07:41
 */
public class AlipayPcreditHuabeiAuthBusinessConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6744378826441855286L;

	/** 
	 * 业务信息回执失败原因描述
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
