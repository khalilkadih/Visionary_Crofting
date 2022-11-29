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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String referenceOfItem;
    private Integer itemQuantity;
    private Double itemUnitPrice;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Command command;
}
