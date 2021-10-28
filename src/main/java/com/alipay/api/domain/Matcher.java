package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号用户匹配器
 *
 * @author auto create
 * @since 1.0, 2020-08-10 20:27:29
 */
public class Matcher extends AlipayObject {

	private static final long serialVersionUID = 4866595139573542745L;

	/**
	 * 身份证号码，与user_id、mobile_no不能同时为空
	 */
	@ApiField("identity_card")
	private String identityCard;

	/**
	 * 手机号码，与user_id、identity_card不能同时为空
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 支付宝用户id，2088开头16位长度的字符串，与mobile_no、identity_card不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

	public String getIdentityCard() {
		return this.identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
