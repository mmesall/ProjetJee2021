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
public class Naissance_mairie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long IDNaissance;
         Date Annee_Naissance;
        String Numero_Naissance;
        String Prenom_Naissance;
        String Nom_Naissance;
        Date Date_Naissance;
        Date Heure_Naissance;
        String Sexe_Naissance;
        String CodeQuartier_Naissance;
        String CodeStructure_Naissance;
        String PrenomP_Naissance;
        String NomP_Naissance;
        Date Date_NaissanceP_Naissance;
        Integer Anne_NaissanceP_Naissance;
        String Lieu_NaissanceP;
        String ProfessionP_Naissance;
        String DomicileP_Naissance;
        String PrenomM_Naissance;
        String NomM_Naissance;
        Date Date_NaissanceM_Naissance;
        Integer Annee_Naissance_M_Naissance;
        String Lieu_NaissanceM_Naissance;
        Date Anne_NaissanceM_Naissance;
        String ProfessionM_Naissance;
        String DomicileM_Naissance;
        String PrenomD_Naissance;
        String NomD_Naissance;
        String ProfessionD_Naissance;
        Integer NIND_Naissance;
        String  AdresseD_Naissance;
        Date Annee_Jugement_Naissance;
        String Numeto_Jugement_Naissance;
        Date Date_Jugement_Naissance;
        String Lieu_Jugement_Naissance;
        Date Date_Inscription_Naissance;
        Date Date_Declarant_Naissance;

    @JsonIgnore
    @OneToMany(mappedBy = "IDQartier")
    private List<Quartier_mairie> quartier_mairie;

    @JsonIgnore
    @OneToMany(mappedBy = "IDStructure_Sanitaire")
    private List <Structure_Sanitaire> structure_sanitaires;
    @JsonIgnore
    @OneToMany(mappedBy = "IDUtilisateur_Utilisateur")
    private List<Utilisateur_mairie> utilisateur_mairies;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Registre_mairie registre_mairie;








}
