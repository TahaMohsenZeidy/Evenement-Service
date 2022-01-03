package com.example.demo.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Evenement;
import com.example.demo.service.IEvenementService;

@RestController
public class EvenementRestController {

	@Autowired
	IEvenementService evenementService;
	
	@GetMapping(value = "/evenements")
	public List<Evenement> findAllEvenements()
	{
		return evenementService.findAll();
	}
	@GetMapping(value = "/evenement/{id}")
	public Evenement findEvenementById(@PathVariable Long id)
	{
		return evenementService.findEvenement(id);
	}
	@GetMapping(value = "/evenement/search/titre")
	public Evenement findEvenementByTitre(@RequestParam String titre)
	{
		return evenementService.findByTitre(titre);
	}
	@GetMapping(value = "/evenement/search/lieu")
	public List<Evenement> findEvenementByLieu(@RequestParam String lieu)
	{
		return evenementService.findByLieu(lieu);
	}
	@GetMapping(value = "/evenement/search/date")
	public List<Evenement> findEvenementByDate(@RequestParam Date date)
	{
		return evenementService.findByDate(date);
	}
	@PostMapping(value = "/evenement/add")
	public Evenement addEvenement(@RequestBody Evenement evenement)
	{
		return evenementService.addEvenement(evenement);
	}
	@PutMapping(value="evenement/{id}")
	public Evenement editEvenement(@PathVariable Long id,@RequestBody Evenement evenement)
	{
		evenement.setId(id);
		return evenementService.updateEvenement(evenement);
	}
	@DeleteMapping(value="evenement/{id}")
	public void deleteEvenement(@PathVariable Long id)
	{
		evenementService.deleteEvenement(id);
	}
	
}
