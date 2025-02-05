package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品标签返回结果集
 *
 * @author auto create
 * @since 1.0, 2021-12-31 09:40:21
 */
public class GoodsTagResult extends AlipayObject {

	private static final long serialVersionUID = 5215946584264611677L;

	/**
	 * 标签code
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签名称
	 */
	@ApiField("tag_name")
	private String tagName;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
