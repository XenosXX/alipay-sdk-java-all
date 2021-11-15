package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.certify.open.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-12 10:36:16
 */
public class MybankCreditUserCertifyOpenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5236277142597714457L;

	/** 
	 * 认证错误原因，扩展字段，默认不返回
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 认证的主体信息，一般的认证场景返回为空
	 */
	@ApiField("identity_info")
	private String identityInfo;

	/** 
	 * 认证主体附件信息，主要为图片类材料，一般的认证场景都是返回空
	 */
	@ApiField("material_info")
	private String materialInfo;

	/** 
	 * 是否通过，通过为T，不通过为F
	 */
	@ApiField("passed")
	private String passed;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setIdentityInfo(String identityInfo) {
		this.identityInfo = identityInfo;
	}
	public String getIdentityInfo( ) {
		return this.identityInfo;
	}

	public void setMaterialInfo(String materialInfo) {
		this.materialInfo = materialInfo;
	}
	public String getMaterialInfo( ) {
		return this.materialInfo;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
