package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.hoteldevice.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-07 10:51:44
 */
public class AlipayOpenIotmbsHoteldeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8316772313512533164L;

	/** 
	 * 刷脸组ID
	 */
	@ApiField("group_id")
	private String groupId;

	/** 
	 * 设备绑定的酒店名称
	 */
	@ApiField("hotel_name")
	private String hotelName;

	/** 
	 * 设备绑定的房间号
	 */
	@ApiField("room_no")
	private String roomNo;

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelName( ) {
		return this.hotelName;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomNo( ) {
		return this.roomNo;
	}

}
