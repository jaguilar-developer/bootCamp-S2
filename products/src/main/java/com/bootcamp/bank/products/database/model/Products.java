package com.bootcamp.bank.products.database.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "products")
public class Products {

    @Id
    private String id;
    private String typeId;
    private String subTypeId;
    private String nameProduct;
    private Sttings sttings;

}
