package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保单列表查询
 *
 * @author auto create
 * @since 1.0, 2022-03-28 17:17:46
 */
public class AlipayInsSceneApplicationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3783167677884387448L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 商户生成的外部投保业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
