package com.fiap.gulliver.controller;

import com.fiap.gulliver.model.Route;
import com.fiap.gulliver.service.IRouteService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.io.IOException;

// https://zetcode.com/springboot/postgresql/
// https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku
// https://stackoverflow.com/questions/35531661/using-env-variable-in-spring-boots-application-properties

// docker run -d -p 5432:5432 postgres:alpine

@Controller
public class RoutesController {
	@Autowired
    private IRouteService routeService;

	@GetMapping("/travel-plus")
	public String getRoutes(@RequestParam(name = "city", required = false) String city, Model model) {
		List<Route> routes;
		
		if(city == null || city == "") {
			routes = (List<Route>) routeService.findAll();
		} else {
			routes = (List<Route>) routeService.getByCityName(city);
		}

		model.addAttribute("routes", routes);

		return "travel_plus";
	}
}