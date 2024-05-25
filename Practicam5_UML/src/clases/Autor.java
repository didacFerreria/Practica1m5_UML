/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author rodri
 */
public class Autor {
    private String nom;
    private String nacionalitat;
    private Date dataNaixement;

    public Autor(String nom, String nacionalitat, Date dataNaixement) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.dataNaixement = dataNaixement;
    }

    public String getNom() {
        return nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public Date getDataNaixement() {
        return dataNaixement;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public void setDataNaixement(Date dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    
}
