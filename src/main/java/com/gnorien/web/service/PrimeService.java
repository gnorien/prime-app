/**
 * 
 */
package com.gnorien.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author gnorien
 *
 */
@Service
public class PrimeService {
	

	public List<Integer> sieveOfEratosthenes(int num) {
		List<Integer> list = new ArrayList<Integer>();
		 boolean prime[] = new boolean[num+1];
	        for(int i=0;i<=num;i++)
	            prime[i] = true;
	         
	        for(int p = 2; p*p <=num; p++)
	        {
	            // If prime[p] is not changed, then it is a prime
	            if(prime[p] == true)
	            {
	                // Update all multiples of p
	                for(int i = p*p; i <= num; i += p)
	                    prime[i] = false;
	            }
	        }
	         
	        // Print all prime numbers
	        for(int i = 2; i <= num; i++)
	        {
	            if(prime[i] == true)
	            	list.add(i);
	        }
	    
		return list;
	}

}
