package com.fiap.gulliver.service;

import com.fiap.gulliver.model.Route;
import com.fiap.gulliver.repository.RouteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService implements IRouteService {

    @Autowired
    private RouteRepository repository;

    @Override
    public List<Route> findAll() {
        return (List<Route>) repository.findAll();
    }

    @Override
    public List<Route> getByCityName(String city) {
        return repository.getByCityName(city);
    }
}
