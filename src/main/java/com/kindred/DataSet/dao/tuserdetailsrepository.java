package com.kindred.DataSet.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface tuserdetailsrepository extends CrudRepository<tuserdetails,Long> {
    List<tuserdetails> findByProvider(String provider);

}
