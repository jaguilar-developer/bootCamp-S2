package com.bootcamp.bank.credits.database.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "credits")
public class Credit {

    @Id
    private String id;
    @Indexed
    private String requestNumber;
    private Number creditLimit;
    private String creationDate;
    private Number balancePaid;
    private Number status;
}
