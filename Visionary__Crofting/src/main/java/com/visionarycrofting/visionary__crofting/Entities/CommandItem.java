package com.visionarycrofting.visionary__crofting.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CommandItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String referenceOfItem;
    private Integer itemQuantity;
    private Double itemUnitPrice;
    @Column(name = "productReference")
    @ManyToOne
    private Product product;
    @ManyToOne
    private Command command;
}
