package com.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Registre_mairie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IDRegistre;
    Integer Numero_Registre;
    Integer Annee_REgistre;
    String Lieu;
    Date Date_jugement;
    Date Date_Inscription;
    @JsonIgnore
    @OneToMany(mappedBy = "IDNaissance")
    private List<Naissance_mairie> naissance_mairie;

    @JsonIgnore
    @OneToMany(mappedBy = "IDDeces")
    private List <Deces_mairie> deces_mairie;

    @JsonIgnore
    @OneToMany(mappedBy = "IDMariage")
    private List<Mariage_mairie> mariage_mairie;


}
