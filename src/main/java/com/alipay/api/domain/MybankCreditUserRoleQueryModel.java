package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询网商会员信息
 *
 * @author auto create
 * @since 1.0, 2021-12-02 11:43:43
 */
public class MybankCreditUserRoleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6733499553996735643L;

	/**
	 * 站点会员信息
	 */
	@ApiField("member")
	private Member member;

	public Member getMember() {
		return this.member;
	}
	public void setMember(Member member) {
		this.member = member;
	}

}
