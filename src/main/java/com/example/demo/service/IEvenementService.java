package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.Evenement;

public interface IEvenementService {
	Evenement addEvenement(Evenement evenement);
	void deleteEvenement(Long id);
	Evenement updateEvenement(Evenement evenement);
	Evenement findEvenement(Long id);
	List<Evenement> findAll();
	Evenement findByTitre(String titre);
	List<Evenement> findByDate(Date date);
	List<Evenement> findByLieu(String lieu);
}
