package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-21 11:42:45
 */
public class AlipayMarketingActivityOrdervoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6147167919751296687L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

}
