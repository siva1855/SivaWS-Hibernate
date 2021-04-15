package siva.hb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quote_table")
public class Quote {

	@Id
	@Column(name = "qid")
	private Integer quoteId;
	
	@Column(name = "qminamount")
	private Double quoteMinAmount;
	
	@Column(name = "qtendercode")
	private String quoteTenderCode;

	public Quote() {
		super();
	}

	public Integer getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}

	public Double getQuoteMinAmount() {
		return quoteMinAmount;
	}

	public void setQuoteMinAmount(Double quoteMinAmount) {
		this.quoteMinAmount = quoteMinAmount;
	}

	public String getQuoteTenderCode() {
		return quoteTenderCode;
	}

	public void setQuoteTenderCode(String quoteTenderCode) {
		this.quoteTenderCode = quoteTenderCode;
	}

	@Override
	public String toString() {
		return "Quote [quoteId=" + quoteId + ", quoteMinAmount=" + quoteMinAmount + ", quoteTenderCode="
				+ quoteTenderCode + "]";
	}

}
