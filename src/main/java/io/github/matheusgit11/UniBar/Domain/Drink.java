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
    private String imageLink;
    @Column
    private Double graduacaoAlcoolica;

    public Drink(){

    }

    public Drink(String description, String name, Double graduacaoAlcoolica , String imageLink) {
        this.description = description;
        this.name = name;
        this.graduacaoAlcoolica = graduacaoAlcoolica;
        this.imageLink = imageLink;
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


    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public Double getGraduacaoAlcoolica() {
        return graduacaoAlcoolica;
    }

    public void setGraduacaoAlcoolica(Double graduacaoAlcoolica) {
        this.graduacaoAlcoolica = graduacaoAlcoolica;
    }
}
