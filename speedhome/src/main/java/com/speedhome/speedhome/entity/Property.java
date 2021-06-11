/**
 * 
 */
package com.speedhome.speedhome.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * @author sacha
 *
 */
@Entity
public class Property implements Serializable {
	
private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;
	@Column(name = "property_name")
	String propertyName;
	@Column(name = "price")
	Double price;
	@Column(name = "type")
	String type;
	@Column(name = "furnish")
	String furnish;
	@Column(name = "title_type")
	String titleType;
	@Column(name = "rooms")
	Integer rooms;
	@Column(name = "bathrooms")
	Integer bathrooms;
	@Column(name = "car_parking")
	Integer carParking;
	@Column(name = "extra_info")
	String extraInfo;
	@Column(name = "offers")
	String offers;
	/**
	 * @return the propertyName
	 */
	public String getPropertyName() {
		return propertyName;
	}
	/**
	 * @param propertyName the propertyName to set
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the furnish
	 */
	public String getFurnish() {
		return furnish;
	}
	/**
	 * @param furnish the furnish to set
	 */
	public void setFurnish(String furnish) {
		this.furnish = furnish;
	}
	/**
	 * @return the titleType
	 */
	public String getTitleType() {
		return titleType;
	}
	/**
	 * @param titleType the titleType to set
	 */
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	/**
	 * @return the rooms
	 */
	public Integer getRooms() {
		return rooms;
	}
	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}
	/**
	 * @return the bathrooms
	 */
	public Integer getBathrooms() {
		return bathrooms;
	}
	/**
	 * @param bathrooms the bathrooms to set
	 */
	public void setBathrooms(Integer bathrooms) {
		this.bathrooms = bathrooms;
	}
	/**
	 * @return the carparking
	 */
	public Integer getCarParking() {
		return carParking;
	}
	/**
	 * @param carparking the carparking to set
	 */
	public void setCarParking(int carParking) {
		this.carParking = carParking;
	}
	/**
	 * @return the extraInfo
	 */
	public String getExtraInfo() {
		return extraInfo;
	}
	/**
	 * @param extraInfo the extraInfo to set
	 */
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}
	/**
	 * @return the offers
	 */
	public String getOffers() {
		return offers;
	}
	/**
	 * @param offers the offers to set
	 */
	public void setOffers(String offers) {
		this.offers = offers;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "{\"id\":"+id+",\"propertyName\":"+propertyName+",\"price\":"+price+",\"type\":"+type+",\"furnish\":"+furnish+",\"titleType\":"+titleType+",\"rooms\":"+rooms+",\"bathrooms\":"+bathrooms+",\"carParking\":"+carParking+",\"extraInfo\":"+extraInfo+",\"offers\":"+offers+"}";
	}
	
}
