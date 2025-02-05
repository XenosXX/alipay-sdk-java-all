package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppBaseInfoQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.developer.appinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 23:47:07
 */
public class AlipayOpenMiniDeveloperAppinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2572111817558694378L;

	/** 
	 * 多端应用信息
	 */
	@ApiListField("app_base_info_list")
	@ApiField("mini_app_base_info_query_response")
	private List<MiniAppBaseInfoQueryResponse> appBaseInfoList;

	public void setAppBaseInfoList(List<MiniAppBaseInfoQueryResponse> appBaseInfoList) {
		this.appBaseInfoList = appBaseInfoList;
	}
	public List<MiniAppBaseInfoQueryResponse> getAppBaseInfoList( ) {
		return this.appBaseInfoList;
	}

}
