package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 恢复任务
 *
 * @author auto create
 * @since 1.0, 2022-03-24 09:45:14
 */
public class AlipayCommerceYuntaskResumeModel extends AlipayObject {

	private static final long serialVersionUID = 4411255283254669826L;

	/**
	 * 商户pid， 代运营模式需要
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作者uid
	 */
	@ApiField("operate_user_id")
	private String operateUserId;

	/**
	 * 任务模版id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOperateUserId() {
		return this.operateUserId;
	}
	public void setOperateUserId(String operateUserId) {
		this.operateUserId = operateUserId;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
