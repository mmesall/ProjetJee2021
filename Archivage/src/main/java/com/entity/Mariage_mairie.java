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
public class Mariage_mairie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IDMariage;
    Integer Annee_Mariage;
    Integer Numero_Acte_Mariage;
    Date date_declarant_Mariage;
    String Heure_Mariage;
    String Type_Mariage;
    String PremonEpoux_Mariage;
    String NomEpoux_Mariage;
    Date Date_NaissanceEpoux_Mariage;
    String Lieu_NaissanceEpoux_Mariage;
    String ProfessionEpoux_Mariage;
    String DomicileEpoux_Mariage;
    String ResidenceEpoux_Mariage;
    String Conjoints_PrecedentsEpoux_Mariage;
    String Lieu_Declarant_deNaissance_Epoux;
    String PrenomEpoux_Pere_Mariage;
    String NomEpoux_Pere_Mariage;
    String ProfessionEpoux_Pere_Mariage;
    Date Date_Naissance_Epoux_Pere_Mariage;
    Integer Annee_NaissanceEpoux_Pere_Mariage;
    String DomicileEpoux_Pere_Maraige;
    String PrenomEpoux_Mere_Mariage;
    String NomEpoux_Mere_Mariage;
    String ProfessionEpoux_Mere_Mariage;
    Date Date_Naissance_Epoux_Mere_Mariage;
    Integer Annee_NaissanceEpoux_Mere_Mariage;
    String DomicileEpoux_Mere_Maraige;
    String PremonEpouse_Mariage;
    String NomEpouse_Mariage;
    Date Date_NaissanceEpouse_Mariage;
    String Lieu_NaissanceEpouse_Mariage;
    String ProfessionEpouse_Mariage;
    String DomicileEpouse_Mariage;
    String ResidenceEpouse_Mariage;
    String Conjoints_PrecedentsEpouse_Mariage;
    String Lieu_Declarant_deNaissance_Epouse_Mariage;
    String PrenomEpouse_Pere_Mariage;
    String NomEpouse_Pere_Mariage;
    String ProfessionEpouse_Pere_Mariage;
    Date Date_Naissance_Epouse_Pere_Mariage;
    Integer Annee_NaissanceEpouse_Pere_Mariage;
    String DomicileEpouse_Pere_Maraige;
    String PrenomEpouse_Mere_Mariage;
    String NomEpouse_Mere_Mariage;
    String ProfessionEpouse_Mere_Mariage;
    Date Date_Naissance_Epouse_Mere_Mariage;
    Integer Annee_NaissanceEpouse_Mere_Mariage;
    String DomicileEpouse_Mere_Maraige;
    String Option_Mariage;
    String Regime_Matrimoniale;
    Integer AnneeJugement_Mariage;
    Integer Numero_Jugement_Maraige;
    Date date_jujement_Mariage;
    Date date_Inscription_Mariage;
    String Temoins_Mariage;
    String Lieu_Maraige;
    String Mentions_Marginales;
    String Montant_De_La_Dot_Mariage;
    Date Date_Celebration_Mariage;

    @JsonIgnore
    @OneToMany(mappedBy = "IDUtilisateur_Utilisateur")
    private List <Utilisateur_mairie> utilisateur_mairie;
    @JsonIgnore
    @OneToMany(mappedBy = "IDRegistre")
    private List<Registre_mairie> registre_mairie;





}
