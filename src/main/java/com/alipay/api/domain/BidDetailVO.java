package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标的详情
 *
 * @author auto create
 * @since 1.0, 2022-05-10 10:59:06
 */
public class BidDetailVO extends AlipayObject {

	private static final long serialVersionUID = 3248524725874244699L;

	/**
	 * 标的截止时间
	 */
	@ApiField("bid_close_date")
	private Date bidCloseDate;

	/**
	 * 标的持续时间（天）
	 */
	@ApiField("bid_lasts_day")
	private Long bidLastsDay;

	/**
	 * 标的名称
	 */
	@ApiField("bid_name")
	private String bidName;

	/**
	 * 标的编号
	 */
	@ApiField("bid_no")
	private String bidNo;

	/**
	 * 开标时间
	 */
	@ApiField("bid_open_date")
	private Date bidOpenDate;

	/**
	 * 标的类别
	 */
	@ApiField("bid_type")
	private String bidType;

	/**
	 * 交易所编码
	 */
	@ApiField("location_code")
	private String locationCode;

	/**
	 * 交易所名称
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 标的所在省市
	 */
	@ApiField("location_place")
	private String locationPlace;

	public Date getBidCloseDate() {
		return this.bidCloseDate;
	}
	public void setBidCloseDate(Date bidCloseDate) {
		this.bidCloseDate = bidCloseDate;
	}

	public Long getBidLastsDay() {
		return this.bidLastsDay;
	}
	public void setBidLastsDay(Long bidLastsDay) {
		this.bidLastsDay = bidLastsDay;
	}

	public String getBidName() {
		return this.bidName;
	}
	public void setBidName(String bidName) {
		this.bidName = bidName;
	}

	public String getBidNo() {
		return this.bidNo;
	}
	public void setBidNo(String bidNo) {
		this.bidNo = bidNo;
	}

	public Date getBidOpenDate() {
		return this.bidOpenDate;
	}
	public void setBidOpenDate(Date bidOpenDate) {
		this.bidOpenDate = bidOpenDate;
	}

	public String getBidType() {
		return this.bidType;
	}
	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	public String getLocationCode() {
		return this.locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationPlace() {
		return this.locationPlace;
	}
	public void setLocationPlace(String locationPlace) {
		this.locationPlace = locationPlace;
	}

}
