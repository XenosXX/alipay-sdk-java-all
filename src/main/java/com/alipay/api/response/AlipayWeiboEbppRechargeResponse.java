package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.weibo.ebpp.recharge response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:09
 */
public class AlipayWeiboEbppRechargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7336238278892966426L;

	/** 
	 * 返回缴费页面
	 */
	@ApiField("partnerpuccharge")
	private String partnerpuccharge;

	public void setPartnerpuccharge(String partnerpuccharge) {
		this.partnerpuccharge = partnerpuccharge;
	}
	public String getPartnerpuccharge( ) {
		return this.partnerpuccharge;
	}

}
