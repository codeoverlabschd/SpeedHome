package com.speedhome.speedhome.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.speedhome.speedhome.entity.Property;
import com.speedhome.speedhome.service.IPropertyService;

@Controller
@RequestMapping("/speedhome")
public class PropertyController {
	
	@Autowired
	private IPropertyService propService;
	
	
	@RequestMapping("/get-all")
	public @ResponseBody List<Property> getAllProperties() {

		return propService.listAll();
	}
	
	@RequestMapping("/get/{propertyId}")
	@ResponseBody
	public Property getProperty(@PathVariable(name = "propertyId") Integer propertyId) {
		return propService.get(propertyId);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public Property createProperty(@RequestBody Property property) {
		return propService.save(property);
	}
	
	@RequestMapping(value = "/update/{propertyId}", method = RequestMethod.PUT)
	@ResponseBody
	public Property updateProperty(@PathVariable(name = "propertyId") Integer propertyId, @RequestBody Property property) {
		property.setId(propertyId);
		return propService.update(property);
		
	}
	
	@RequestMapping(value = "/delete/{propertyId}" , method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteProduct(@PathVariable(name = "propertyId") Integer propertyId) {
		propService.delete(propertyId);
	    return "Property Deleted";       
	}
}
