package com.spring4study.rajan.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author rajan
 * 
 * speaker class
 * @since27Jun2021
 *
 */
@Component
//@Primary
public class Speaker implements HardDrive {

	/**
	 *method to show speaker hardware configuration
	 */
	public void showHardDriveConfig() {
		System.out.println("speaker hardware configuration!!!");
	}

}
