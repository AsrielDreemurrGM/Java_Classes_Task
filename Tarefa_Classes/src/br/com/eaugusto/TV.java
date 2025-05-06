/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 */

package br.com.eaugusto;

/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 06/05/2025
 * @version 1.0
 * {@summary Public class for TVs. Possible properties consist of: Model, Brand, Name, Display Size and a Boolean for if it's a Smart Tv or not.}
 */

public class TV {

	private String model;
	private String brand;
	private String name;
	private Number displaySize;
	private Boolean isSmart;
	
	private Boolean isOn = false;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Number getDisplaySize() {
		return displaySize;
	}
	
	public void setDisplaySize(Number displaySize) {
		this.displaySize = displaySize;
	}
	
	public Boolean getIsSmart() {
		return isSmart;
	}
	
	public void setIsSmart(Boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	public void setIsOn(Boolean isOn) {
		this.isOn = isOn;
	}
	
	public String toggleOnOff() {
		if (this.isOn) {
			setIsOn(false);
			return this.name + " Disabled...";
		}
		setIsOn(true);
		return this.name + " Activated...";
	}
}
