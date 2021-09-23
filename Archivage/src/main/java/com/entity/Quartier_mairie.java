package com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Quartier_mairie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IDQartier;
    String CodeQuartier;

    @ManyToOne(cascade = CascadeType.ALL)
    private Naissance_mairie naissance_mairie;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private  Deces_mairie deces_mairie;

    @JsonIgnore
    @OneToMany(mappedBy = "IDLocalite")
    private List<Localite_mairie> localite_mairie;





}
