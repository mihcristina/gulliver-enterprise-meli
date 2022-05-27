package com.fiap.gulliver.repository;

import com.fiap.gulliver.model.Route;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    @Query(value = "select id, city_from, city_to from routes r where LOWER(r.city_from) = LOWER(:city)", nativeQuery = true)
    List<Route> getByCityName(@Param("city") String city);
}