package siva.hb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contract_table")
public class Contracts {
	@Id
	@Column(name = "cid")
	private Integer contractId;

	@Column(name = "cvendor")
	private String contractVendor;

	@Column(name = "cregcode")
	private String contractRegCode;
	
	@ManyToOne
	@JoinColumn(name = "qidfk")
	private Quote quote;

	public Contracts() {
		super();
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public String getContractVendor() {
		return contractVendor;
	}

	public void setContractVendor(String contractVendor) {
		this.contractVendor = contractVendor;
	}

	public String getContractRegCode() {
		return contractRegCode;
	}

	public void setContractRegCode(String contractRegCode) {
		this.contractRegCode = contractRegCode;
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "Contract [contractId=" + contractId + ", contractVendor=" + contractVendor + ", contractRegCode="
				+ contractRegCode + ", quote=" + quote + "]";
	}

}
