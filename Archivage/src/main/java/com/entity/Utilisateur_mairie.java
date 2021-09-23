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
public class Utilisateur_mairie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IDUtilisateur_Utilisateur;
    String login_utilisateur_Utilisateur;
    String Mot_De_Passe_Utilisateur;
    String Nom_complet_Utilisateur;
    String Fonction_Utilisateur;
    String Initiales_Utilisateurs;
    String Etat_Utilisateurs;


    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Naissance_mairie naissance_mairie;


    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Deces_mairie deces_mairie;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Mariage_mairie mariage_mairie;



}
