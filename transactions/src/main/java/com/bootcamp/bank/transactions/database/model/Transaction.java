package com.bootcamp.bank.transactions.database.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "transacctions")
public class Transaction {
	
	@Id
	private String id;
	private String numOpe;
	private String creationDate;
	private Number amount;
	private Number idCurrency;
	private String cardNumberOrig;
	private String accountNumberOrig;
	private String cardOwnerNameOrig;
	private String idCustomerOrig;
	private Number idCustomerTypeOrig;
	private String cardNumberDest;
	private String accountNumberDest;
	private String cardOwnerNameDest;
	private String idCustomerDest;
	private Number idCustomerTypeDest;
	private Number status;

}
