package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.preorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-22 17:23:40
 */
public class ZhimaCreditPeZmgoPreorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8465158455836122865L;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 芝麻GO预创建单号
	 */
	@ApiField("preorder_no")
	private String preorderNo;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPreorderNo(String preorderNo) {
		this.preorderNo = preorderNo;
	}
	public String getPreorderNo( ) {
		return this.preorderNo;
	}

}
