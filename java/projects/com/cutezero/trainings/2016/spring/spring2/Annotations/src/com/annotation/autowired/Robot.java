package com.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Autowired annotation can be used in 4 places (2 level)
 * 1. Attribute level (Spring uses reflection api to inject the dependency)
 * 2. Method level
 * 		i. Constructor (uses Constructor )
 * 		ii. Setter Method (uses setter Method)
 * 		iii. Arbitrary Method (Any method having logics and any number of parameters )
 * @author Srikanta.ydon
 *
 */
public class Robot {

	@Autowired
	private Chip chip;	//Always its better to go with 
	
	/**
	 * @Qualifier makes the program vlaues hardcoded. Toavoid we need to use Qualifier-value at configuration file
	 */
	@Autowired
	@Qualifier("sensor3")	//If we dont mention default value is attribute name ex: chip
	private Sensor sensor;
	
	


/*	@Autowired(required=false)
	public Robot(Chip chip) {	//1. with single Constructor
		super();
		System.out.println("Robot(chip)");
		this.chip = chip;
	}
*/
	
	/**
	 * All the Constructors must and should have the attribute as false except default constructor
	 * 
	 * @param chip
	 * @param sensor
	 */
/*	public Robot() {
		super();
	}
*/
/*	@Autowired(required=false)	
	public Robot(Chip chip, Sensor sensor) {	//4 with multiple constructor 
		this.chip = chip;
		this.sensor = sensor;
	}
	
	@Autowired(required=false)
	public Robot(Sensor sensor) {	//4 with multiple constructor 
		this.sensor = sensor;
	}
*/
	
/*	@Autowired
	public void setChip(Chip chip) {	//2. setter level
		this.chip = chip;
	}
*/
/*	@Autowired(required=false)
	public void setChip(Chip chip) {	//2. setter level without the dependency class defined in the configuration file
		this.chip = chip;
	}
*/	 
	
	/**
	 * Arbitrary method can have any kind of accessModifier( Spring never cares Access Modifiers 
	 * because It uses reflection API to overcome this)
	 * The follwing method can be return anything (Spring will ignore the returntype)
	 * 
	 */
/*	@Autowired
	public void setCompleteRobot(Chip chip, Sensor sensor){	//arbitrary level injection
		this.chip = chip;
		this.sensor= sensor;
		System.out.println("setCompleteRobot(chip, robot)");
	}
*/	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", sensor=" + sensor + "]";
	}
	
}
