package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-15 10:44:47
 */
public class AlipayMarketingCardBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2262875147225897686L;

	/** 
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
