package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.batch.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-05 17:45:20
 */
public class KoubeiMerchantOperatorBatchDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2794981992683468971L;

	/** 
	 * 批量删除，不保证事务，可能有部分成功，部分失败;
枚举值为： PART_SUCCESS, ALL_SUCCESS
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * true, false
	 */
	@ApiField("success")
	private Boolean success;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
