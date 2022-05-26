package com.fiap.gulliver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cityTo;
    private String cityFrom;

    public Route() {}

    public Route(Long id, String cityTo, String cityFrom) {
        this.id = id;

        this.cityTo = cityTo;
        this.cityFrom = cityFrom;
    }

    public Long getId() {
        return id;
    }

    public String getCityTo() {
        return cityTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }
}