package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询资金单据
 *
 * @author auto create
 * @since 1.0, 2021-09-07 10:07:11
 */
public class AlipayFundJointaccountFundOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4786615293318794617L;

	/**
	 * 合花群ID <br/>
补充说明： <br/>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed中返回<br>
- 该字段可在签约接口调用后,由alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号 <br/>
补充说明： <br/>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed中返回<br>
- 该字段可在签约接口调用后，
由alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝侧转账订单号（查询方式一：通过传入
biz_trans_id查询） <br/>
补充说明： <br/>
- 该字段可在调用alipay.fund.jointaccount.fund.btoc.transfer中同步返回 <br/>
- 该字段可在资金操作接口调用后，由alipay.fund.jointaccount.fund.completed中返回
	 */
	@ApiField("biz_trans_id")
	private String bizTransId;

	/**
	 * 资金操作类型：<br/>
- FREEZE：提现申请 <br/>
- UNFREEZE：提现审批拒绝 <br/>
- WITHDRAW：提现审批同意 <br/>
- DEPOSIT：手动转入 <br/>
- SINGLE_TRANSFER：存量资金搬迁
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 商户侧单号（查询方式二：通过传入
out_biz_no查询） <br/>
补充说明： <br/>
- 该字段与各类资金操作接口的请求参数中传入值保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * （发起人）支付宝侧用户唯一标识 <br/>
补充说明： <br/>
- 发起人可为C端用户<br/>
- 发起人也可为B端商户
	 */
	@ApiField("request_uid")
	private String requestUid;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBizTransId() {
		return this.bizTransId;
	}
	public void setBizTransId(String bizTransId) {
		this.bizTransId = bizTransId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestUid() {
		return this.requestUid;
	}
	public void setRequestUid(String requestUid) {
		this.requestUid = requestUid;
	}

}
