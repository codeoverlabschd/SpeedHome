package com.speedhome.speedhome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.speedhome.speedhome.controller.PropertyController;
import com.speedhome.speedhome.dao.PropertyRepository;
import com.speedhome.speedhome.entity.Property;
import com.speedhome.speedhome.service.PropertyService;
 
public class SpeedHomeControllerTest extends SpeedhomeApplicationTests{

	@InjectMocks
    PropertyController propertyController;
     
    @Mock
    PropertyService dao;
    
    @Mock
	PropertyRepository propRepo;
 
    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
     
    @Test
    public void getAllPropertyTest()
    {
        List<Property> list = new ArrayList<Property>();
        Property propOne = setPropertyObject("Speed Home1",45000.00, "test1","fully furnished", "test2", 2, 2, 1, "3 Balcony", "Yes");
        Property propTwo = setPropertyObject("Speed Home2",460000.0, "test2","fully furnished", "test2", 2, 2, 1, "3 Balcony", "Yes");
        Property propThree = setPropertyObject("Speed Home3",4500000, "test3","fully furnished", "test2", 2, 2, 1, "3 Balcony", "Yes");
        
        list.add(propOne);
        list.add(propTwo);
        list.add(propThree);
        Mockito.when(dao.listAll()).thenReturn(list);
        Mockito.when(propRepo.findAll()).thenReturn(list);
         
        //test
        List<Property> propList = propertyController.getAllProperties();
         
        assertEquals(3, propList.size());
    }
     
    private Property setPropertyObject(String propertyName, double price, String type, String furnish, String titleTYpe, int rooms, int bathrooms,
			int carParking, String extraInfo, String offers) {
    	Property propModel = new Property();
    	propModel.setPropertyName(propertyName);
    	propModel.setPrice(price);
    	propModel.setType(type);
    	propModel.setFurnish(furnish);
    	propModel.setTitleType(titleTYpe);
    	propModel.setRooms(rooms);
    	propModel.setBathrooms(bathrooms);
    	propModel.setCarParking(carParking);
    	propModel.setExtraInfo(extraInfo);
    	propModel.setOffers(offers);
    	
    	return propModel;
	}

	@Test
    public void getPropertyByIdTest()
    {
        List<Integer> listIds = new ArrayList<>();
    	listIds.add(1);
		List<Property> list = new ArrayList<Property>();
	    Property propOne = setPropertyObject("Speed Home1",45000.00, "test1","fully furnished", "test2", 2, 2, 1, "3 Balcony", "Yes");
	    list.add(propOne);
	    Mockito.when(dao.get(1)).thenReturn(propOne);
        when(propRepo.getById(1)).thenReturn(propOne);
         
        Property prop = propertyController.getProperty(1);
         
        assertEquals("Speed Home1", prop.getPropertyName());
        assertEquals(45000.00, prop.getPrice());
        assertEquals(2,prop.getRooms());
    }
     
    @Test
    public void createPropertyTest()
    {
    	Property prop = setPropertyObject("Speed Home",45000.00, "test1","fully furnished", "test2", 2, 2, 1, "3 Balcony", "Yes");
    	Mockito.when(dao.save(prop)).thenReturn(prop);
    	when(propRepo.save(prop)).thenReturn(prop);
    	Property prop1 = propertyController.createProperty(prop);
         
    	assertEquals("Speed Home", prop1.getPropertyName());
    }
    
    @Test
    public void updatePropertyTest()
    {
    	Property prop = setPropertyObject("Speed Home",45000.00, "test1","fully furnished", "test2", 2, 2, 1, "3 Balcony", "Yes");
    	Mockito.when(dao.update(prop)).thenReturn(prop);
    	when(propRepo.save(prop)).thenReturn(prop);
    	Property prop1 = propertyController.updateProperty(10,prop);
         
    	assertEquals(10, prop1.getId());
    }
}
