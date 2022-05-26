package com.fiap.gulliver.repository;

import com.fiap.gulliver.model.Route;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RouteRepository extends CrudRepository<Route, Long> {

}