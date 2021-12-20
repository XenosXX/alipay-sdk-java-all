package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭租户开通的isv服务接口
 *
 * @author auto create
 * @since 1.0, 2020-10-19 16:43:58
 */
public class AlipayIserviceCcmServiceCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7573195699366649166L;

	/**
	 * 服务代码。通过<a href="https://opendocs.alipay.com/apis/01dmgh">alipay.iservice.ccm.service.initialize</a>(isv服务初始化接口) 获取。
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
