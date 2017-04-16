package com.cake.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.cake.app.model.Status;

public interface StatusDAO extends CrudRepository<Status, Long>{
	public Status findFirstByOrderByAddedDesc();

}
