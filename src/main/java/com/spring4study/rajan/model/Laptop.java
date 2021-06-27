package com.spring4study.rajan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author rajan
 * 
 * Laptop class
 * 
 * @since 27Jun2021
 *
 */
//@Component("myLap")
@Component
public class Laptop {
	
	@Autowired
	@Qualifier("monitor")
	private HardDrive hardDrive;
	
	public HardDrive getHardDrive() {
		return hardDrive;
	}
	
	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}

	/**
	 * method to show the configuration details
	 */
	public void showConfig() {
		System.out.println("Highly configured!!!!");
		hardDrive.showHardDriveConfig();
	}

}
