package com.spring4study.rajan.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author rajan
 * Monitor class
 * 
 *@since 27Jun2021
 */
@Component
//@Primary
public class Monitor implements HardDrive {

	/**
	 *Method which show monitor hardware configuration details.
	 */
	public void showHardDriveConfig() {
		System.out.println("Monitor harddrive configured!!!!");

	}

}
