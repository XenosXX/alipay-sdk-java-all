package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.material.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-24 11:04:11
 */
public class AlipayMarketingMaterialImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2879528472498968916L;

	/** 
	 * 图片唯一资源ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceId( ) {
		return this.resourceId;
	}

}
