/**
 * 
 */
package com.gnorien.web.utils;

import javax.validation.constraints.NotBlank;

/**
 * @author gnorien
 *
 */
public class PrimeCriteria {
	
	@NotBlank(message = "primeNumber can't empty!")
    String primeNumber;

	
	

	public String getPrimeNumber() {
		return primeNumber;
	}



	public void setPrimeNumber(String primeNumber) {
		this.primeNumber = primeNumber;
	}



}
