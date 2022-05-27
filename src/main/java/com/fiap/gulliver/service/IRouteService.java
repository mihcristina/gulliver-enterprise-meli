package com.fiap.gulliver.service;

import com.fiap.gulliver.model.Route;

import java.util.List;

public interface IRouteService {
    List<Route> findAll();

    List<Route> getByCityName(String city);
}

