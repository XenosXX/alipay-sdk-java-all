package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家券可用门店信息
 *
 * @author auto create
 * @since 1.0, 2022-04-08 19:42:24
 */
public class OrderVoucherAvailableShop extends AlipayObject {

	private static final long serialVersionUID = 5125528533736162521L;

	/**
	 * 代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id 接口参数是列表类型。 限制： 1、real_shop_ids中的门店id必须是代运营商业关系门店id。 2、real_shop_ids如果包含重复的门店id会自动进行去重操作。3、shop_ids、real_shop_ids必须二选一
	 */
	@ApiListField("real_shop_ids")
	@ApiField("string")
	private List<String> realShopIds;

	/**
	 * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。 限制： 1、shop_ids中的门店id必须是支付宝门店id。 2、shop_ids如果包含重复的门店id会自动进行去重操作。  3、shop_ids、real_shop_ids必须二选一
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public List<String> getRealShopIds() {
		return this.realShopIds;
	}
	public void setRealShopIds(List<String> realShopIds) {
		this.realShopIds = realShopIds;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
