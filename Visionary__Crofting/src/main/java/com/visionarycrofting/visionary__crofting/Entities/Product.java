package com.visionarycrofting.visionary__crofting.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToMany(mappedBy = "product")
    @JsonManagedReference
    private List<CommandItem> referenceOfProduct;
    @Column
    private String productName;
    @Column
    private Double productPrice;
    @Column
    private String category;
    @Column
    private String description;
    @Column
    private Integer quantity;
    @ManyToOne
    private Stock stock;

}
