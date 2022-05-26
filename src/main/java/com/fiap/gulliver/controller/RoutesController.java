package com.fiap.gulliver.controller;

import com.fiap.gulliver.model.Route;
import com.fiap.gulliver.service.IRouteService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

// https://zetcode.com/springboot/postgresql/
// https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku
// https://stackoverflow.com/questions/35531661/using-env-variable-in-spring-boots-application-properties

// docker run -d -p 5432:5432 postgres:alpine

@Controller
public class RoutesController {
	@Autowired
    private IRouteService routeService;

	@GetMapping("/routes")
	public String getRoutes(Model model) {
		var routes = (List<Route>) routeService.findAll();

		model.addAttribute("routes", routes);

		return "route";
	}
}