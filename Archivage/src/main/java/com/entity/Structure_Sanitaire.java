package com.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Structure_Sanitaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IDStructure_Sanitaire;
    String CodeStructure;
    String LibelleStructure;


    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Naissance_mairie naissance_mairie;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private  Deces_mairie deces_mairie;



}
