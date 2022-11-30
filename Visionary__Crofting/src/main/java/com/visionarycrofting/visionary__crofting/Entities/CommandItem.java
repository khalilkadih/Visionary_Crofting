package com.visionarycrofting.visionary__crofting.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
  /*  @ManyToOne
    @JsonManagedReference
    private Product product;*/

    @OneToMany(mappedBy = "commandItem")
    private List<Product> products;

    @ManyToOne
    private Command command;
}
