package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放引导可修改信息
 *
 * @author auto create
 * @since 1.0, 2022-04-08 19:34:27
 */
public class VoucherSendGuideModify extends AlipayObject {

	private static final long serialVersionUID = 2134269854862181368L;

	/**
	 * 领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。 说明： 当voucher_type=EXCHANGE_VOUCHER时，该字段可修改，其他不允许修改。
	 */
	@ApiField("voucher_detail_url")
	private String voucherDetailUrl;

	public String getVoucherDetailUrl() {
		return this.voucherDetailUrl;
	}
	public void setVoucherDetailUrl(String voucherDetailUrl) {
		this.voucherDetailUrl = voucherDetailUrl;
	}

}
