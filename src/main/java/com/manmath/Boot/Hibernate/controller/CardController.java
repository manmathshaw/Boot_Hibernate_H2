package com.manmath.Boot.Hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.manmath.Boot.Hibernate.Model.BaseballCard;
import com.manmath.Boot.Hibernate.service.CardService;
import com.manmath.Boot.Hibernate.service.HibernateSearchService;

import java.util.List;

@Controller
public class CardController {

    @Autowired
    private HibernateSearchService searchservice;

    @Autowired
    private CardService cardservice;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String search(@RequestParam(value = "search", required = false) String q, Model model) {
        List<BaseballCard> searchResults = null;
        try {
            cardservice.addCards();
            searchResults = searchservice.fuzzySearch(q);
        } catch (Exception ex) {
        	
        }
        model.addAttribute("search", searchResults);
        return "index";
    }
}