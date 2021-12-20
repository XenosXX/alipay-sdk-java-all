package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot根据人脸id删除库中图片
 *
 * @author auto create
 * @since 1.0, 2021-10-29 10:47:29
 */
public class AlipayOpenIotmbsFacedbDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5685161314649751169L;

	/**
	 * 人脸ID
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * 手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
