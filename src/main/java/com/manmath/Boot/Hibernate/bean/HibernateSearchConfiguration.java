package com.manmath.Boot.Hibernate.bean;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.manmath.Boot.Hibernate.service.HibernateSearchService;

@EnableAutoConfiguration 
@Configuration
public class HibernateSearchConfiguration {

	@Autowired
	private EntityManager bentityManager;

	@Bean
	HibernateSearchService hibernateSearchService() {
		HibernateSearchService hibernateSearchService = new HibernateSearchService(bentityManager);
		//hibernateSearchService.initializeHibernateSearch();
		return hibernateSearchService;
	}
}