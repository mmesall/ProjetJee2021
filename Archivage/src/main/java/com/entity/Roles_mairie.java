package com.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Roles_mairie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IDRole ;
    String Type_Role;

   @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "IDUtilisateur"),
            inverseJoinColumns = @JoinColumn(name = "IDRole")
    )

    private List <Utilisateur_mairie> utilisateur_mairie;


}
