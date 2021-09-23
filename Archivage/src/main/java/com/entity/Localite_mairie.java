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
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Localite_mairie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IDLocalite;
    String RegionLocale;
    String Departement;
    String Centre_Locale;
    String ChefLieuLocale;
    String Logolocalite;

   @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Quartier_mairie quartier_mairie;



}
