package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserFacePaySkinInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.facepayskin.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-14 15:25:35
 */
public class AlipayCommerceSportsFacepayskinBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6423228846843631587L;

	/** 
	 * 用户付款码皮肤信息列表
	 */
	@ApiListField("data_list")
	@ApiField("user_face_pay_skin_info")
	private List<UserFacePaySkinInfo> dataList;

	public void setDataList(List<UserFacePaySkinInfo> dataList) {
		this.dataList = dataList;
	}
	public List<UserFacePaySkinInfo> getDataList( ) {
		return this.dataList;
	}

}
