package com.projeto.everis.citiesapi.countries.repository;

import com.projeto.everis.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>{
}
