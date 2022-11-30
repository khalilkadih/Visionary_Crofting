package com.visionarycrofting.visionary__crofting.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Table(name = "commandItem")
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
    @JsonIgnore
    private Product product;
    @ManyToOne
    //@JsonIgnore
    @JoinColumn(name = "command_id", referencedColumnName = "id")
    private Command command;
}
