package com.example.shopapptech.responses;


import com.example.shopapptech.models.Order;
import com.example.shopapptech.models.OrderDetail;
import com.example.shopapptech.models.Product;
import com.example.shopapptech.repositories.OrderDetailRepository;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data//toString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetailResponse {
    private Long id;

    @JoinColumn(name = "order_id")
    private Long orderId;

    @JoinColumn(name = "product_id")
    private Long productId;

    @Column(name = "price", nullable = false)
    private Float price;

    @Column(name = "number_of_products", nullable = false)
    private int numberOfProducts;

    @Column(name = "total_money", nullable = false)
    private Float totalMoney;

    private String color;

    public static OrderDetailResponse fromOrderDetail(OrderDetail orderDetail) {
        return OrderDetailResponse.builder()
                .id(orderDetail.getId())
                .orderId(orderDetail.getOrder().getId())
                .productId(orderDetail.getProduct().getId())
                .price(orderDetail.getPrice())
                .numberOfProducts(orderDetail.getNumberOfProducts())
                .totalMoney(orderDetail.getTotalMoney())
                .color(orderDetail.getColor())
                .build();
    }

}
