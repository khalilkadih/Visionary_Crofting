package com.visionarycrofting.visionary__crofting.Entities;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "command")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties("commandItem")
public class Command implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String reference;
    private String commandDate;
    private Double commandTotalPrice;
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;
    @OneToMany(mappedBy = "command")
    @JsonManagedReference
    private List<CommandItem> commandItem;
}
