/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rodri
 */
import java.util.List;

public class Llibre {
    private String titol;
    private String ISBN;
    private String editorial;
    private int anyPublicacio;
    private List<Autor> autors;
    private List<Exemplar> exemplars;

    public Llibre(String titol, String ISBN, String editorial, int anyPublicacio, List<Autor> autors) {
        this.titol = titol;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.anyPublicacio = anyPublicacio;
        this.autors = autors;
    }

    public String getTitol() {
        return titol;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnyPublicacio() {
        return anyPublicacio;
    }

    public List<Autor> getAutors() {
        return autors;
    }

    public List<Exemplar> getExemplars() {
        return exemplars;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAnyPublicacio(int anyPublicacio) {
        this.anyPublicacio = anyPublicacio;
    }

    public void setAutors(List<Autor> autors) {
        this.autors = autors;
    }

    public void setExemplars(List<Exemplar> exemplars) {
        this.exemplars = exemplars;
    }

    
}
