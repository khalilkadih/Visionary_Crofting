package com.visionarycrofting.visionary__crofting.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


@Data
@Table(name = "commandItem")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties("products")
public class CommandItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String referenceOfItem;
    private Integer itemQuantity;
    private Double itemUnitPrice;


    @OneToMany(mappedBy = "commandItem")
    @JsonManagedReference
    private List<Product> products;
    @ManyToOne
    @JoinColumn(name = "command_id", referencedColumnName = "id")
    private Command command;
}
