package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.schoolcard.sign response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-13 14:19:05
 */
public class AlipayCommerceEducateCampusSchoolcardSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1634233457387573858L;

	/** 
	 * 开通成功，返回的schema
	 */
	@ApiField("schema_url")
	private String schemaUrl;

	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}
	public String getSchemaUrl( ) {
		return this.schemaUrl;
	}

}
