package com.example.demo.model;

public class Product {

    private String id;
    private String description;
    private String instancia;

    public Product(String id, String description, Double price,String instancia) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.instancia = instancia;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;

}
