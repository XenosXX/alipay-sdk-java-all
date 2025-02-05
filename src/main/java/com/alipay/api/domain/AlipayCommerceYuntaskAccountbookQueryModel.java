package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金记账本信息查询
 *
 * @author auto create
 * @since 1.0, 2022-03-24 10:16:32
 */
public class AlipayCommerceYuntaskAccountbookQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2889946871416592929L;

	/**
	 * 资金代扣签约时的出资方uid
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

}
