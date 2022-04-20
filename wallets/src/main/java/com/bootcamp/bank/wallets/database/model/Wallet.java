package com.bootcamp.bank.wallets.database.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value="wallets")
public class Wallet {
	
	@Id
	private String id;
	@Indexed(unique = true)
	private String numWallet;
	private String ownerFirstName;
	private String ownerLastName1;
	private String ownerLastName2;
	private Number ownerDocType;
	private String ownerDocNumber;
	private String accountDetail;
	private Number status;
	private String creationDate;	

}
