package com.visionarycrofting.visionary__crofting.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties({"product" ,"callOffers" })
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String password;

    @OneToMany(mappedBy = "stock")
    @JsonManagedReference
    private List<Product> product;

    @OneToMany(mappedBy = "stock")
    @JsonManagedReference
    private List<CallOffer> callOffers;

}
