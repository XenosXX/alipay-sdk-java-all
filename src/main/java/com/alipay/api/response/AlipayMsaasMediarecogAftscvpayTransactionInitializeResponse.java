package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aftscvpay.transaction.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-31 14:48:35
 */
public class AlipayMsaasMediarecogAftscvpayTransactionInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8234822157237837823L;

	/** 
	 * 处理结果
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 云平台请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId( ) {
		return this.transactionId;
	}

}
