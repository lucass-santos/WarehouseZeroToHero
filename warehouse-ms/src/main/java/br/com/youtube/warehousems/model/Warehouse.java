package br.com.youtube.warehousems.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_warehouse")
@Data
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "productId", nullable = false)
    private Long productId;
    @Column(name = "quantity")
    private int quantity;


}
