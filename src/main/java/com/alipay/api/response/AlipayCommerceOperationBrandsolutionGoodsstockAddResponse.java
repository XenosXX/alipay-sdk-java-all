package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnrolledMerchantResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.brandsolution.goodsstock.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-09 13:23:16
 */
public class AlipayCommerceOperationBrandsolutionGoodsstockAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6633479517269982169L;

	/** 
	 * 批量修改结果
	 */
	@ApiListField("data")
	@ApiField("enrolled_merchant_result")
	private List<EnrolledMerchantResult> data;

	public void setData(List<EnrolledMerchantResult> data) {
		this.data = data;
	}
	public List<EnrolledMerchantResult> getData( ) {
		return this.data;
	}

}
