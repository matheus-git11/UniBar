package io.github.matheusgit11.UniBar.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Drink {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String description;
    @Column
    private String name;
    @Column
    private List<String> ingredientes;
    @Column
    private String modoDePreparo;
    @Column
    private Double graduacaoAlcoolica;

    public Drink(){

    }

    public Drink(String description, String name, List<String> ingredientes, String modoDePreparo, Double graduacaoAlcoolica) {
        this.description = description;
        this.name = name;
        this.ingredientes = ingredientes;
        this.modoDePreparo = modoDePreparo;
        this.graduacaoAlcoolica = graduacaoAlcoolica;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", ingredientes=" + ingredientes +
                ", modoDePreparo='" + modoDePreparo + '\'' +
                ", graduacaoAlcoolica=" + graduacaoAlcoolica +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    public void setModoDePreparo(String modoDePreparo) {
        this.modoDePreparo = modoDePreparo;
    }

    public Double getGraduacaoAlcoolica() {
        return graduacaoAlcoolica;
    }

    public void setGraduacaoAlcoolica(Double graduacaoAlcoolica) {
        this.graduacaoAlcoolica = graduacaoAlcoolica;
    }
}
