package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碎屏险保障卡激活码查询
 *
 * @author auto create
 * @since 1.0, 2021-11-15 09:30:45
 */
public class AlipayInsSceneMobileCodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6466356119635875374L;

	/**
	 * 请求渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 激活码值
	 */
	@ApiField("code_value")
	private String codeValue;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

}
