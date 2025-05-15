package com.s2tv.sportshop.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderProduct {
    String productId;
    int quantity;
    String colorName;
    String variantName;
    double price;
    String categoryId;
}
