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
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Deces_mairie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IDDeces;
    Integer Annee_Deces;
    Integer Numero_Acte_Deces;
    Date Date_Deces;
    String Heure_Deces;
    String Quartier_Deces;
    String Structure_Sanitaire_Deces;
    String Prenoms_Deces;
    String Nom_Deces;
    String Sexe_Deces;
    Date Date_Naissance_deces;
    Integer Annee_Naissance_Deces;
    String Lieu_Naissance_Deces;
    String Profession_Deces;
    String Situation_Matrimoniale_Deces;
    String Conjoint_Deces;
    String Prenom_Pere_Deces;
    String Nom_Pere_Deces;
    String Profession_Pere_Deces;
    String Domicile_Pere_Deces;
    String Prenom_Mere_Deces;
    String Nom_Mere_Deces;
    String Profession_Mere_Deces;
    String Domicile_Mere_Deces;
    String Prenom_Declarant_Deces;
    String Nom_Declarant_Deces;
    String Profession_Declarant_Deces;
    String Adresse_Declarant_Deces;
    String NIN_Declarant_Deces;
    String Degre_De_Parente_Deces;
    Integer Annee_Jugement_Deces;
    Integer Numero_Jugement_Deces;
    Date Date_Jugement_Deces;
    Date Date_Inscription_Deces;
    String Lieu_Deces;
    Date Date_Declarant_Deces;
    String Heure_Declarant_Deces;
    String Temoins_Deces;

    @JsonIgnore
    @OneToMany(mappedBy = "IDQartier")
    private List<Quartier_mairie> quartier_mairie;

    @JsonIgnore
    @OneToMany(mappedBy = "IDStructure_Sanitaire")
    private List<Structure_Sanitaire> structure_sanitaire;
    @JsonIgnore
    @OneToMany(mappedBy = "IDUtilisateur_Utilisateur")
    private List <Utilisateur_mairie> utilisateur_mairie;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Registre_mairie registre_mairie;




}
