package org.mycompany.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="money_optional")
public class MoneyOptional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
   
	@Column(name="value")
	protected BigDecimal value;
	@Column(name="iso_currency_code")
    protected String isoCurrencyCode;
	
    public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}
	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}
    
    
}
