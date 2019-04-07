package com.manmath.Boot.Hibernate.dao;

import org.springframework.data.repository.CrudRepository;

import com.manmath.Boot.Hibernate.Model.BaseballCard;

public interface BaseballCardRepository extends CrudRepository<BaseballCard,Long> {
}
