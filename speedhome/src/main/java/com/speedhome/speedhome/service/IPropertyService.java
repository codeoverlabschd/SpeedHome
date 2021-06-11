package com.speedhome.speedhome.service;


import com.speedhome.speedhome.entity.Property;

import java.util.List;

/**
 * @author Chandra Bhan Maurya
 */
public interface IPropertyService {
    public List<Property> listAll();

    public Property save(Property propertyModel);

    public Property get(Integer id) ;

    public void delete(Integer id) ;

    public Property update(Property propertyModel) ;
}
