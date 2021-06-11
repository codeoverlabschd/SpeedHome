package com.speedhome.speedhome.service;


import com.speedhome.speedhome.dao.PropertyRepository;
import com.speedhome.speedhome.entity.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropertyService implements  IPropertyService{
 
    @Autowired
    private PropertyRepository repo;
     
    public List<Property> listAll() {
        return repo.findAll();
    }
     
    public Property save(Property propertyModel) {
        return repo.save(propertyModel);
    }
     
    public Property get(Integer id) {
    	List<Integer> listIds = new ArrayList<>();
    	listIds.add(id);
    	List<Property> listProperty = repo.findAllById(listIds);
    	return listProperty.isEmpty()?null:listProperty.get(0);
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }

	public Property update(Property propertyModel) {
		return repo.save(propertyModel);
	}
}
