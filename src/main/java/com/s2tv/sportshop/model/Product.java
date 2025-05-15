package com.s2tv.sportshop.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "Product")
public class Product {
    @Id
    String id;

    String product_title;
    String product_brand;
    String product_category;
    String product_description;
    String product_img;
    double product_price;
    double product_percent_discount;
    List<Color> colors;
    boolean product_display;
    int product_countInStock;
    boolean product_famous;
    double product_rate;
    int product_selled;

    @CreatedDate
    Date createdAt;

    @LastModifiedDate
    Date updatedAt;
}
