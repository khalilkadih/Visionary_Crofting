package com.visionarycrofting.visionary__crofting.Entities;

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
public class Command {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String reference;
    private Date commandDate;
    private Double commandTotalPrice;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "command")
    private List<CommandItem> commandItem;


}
