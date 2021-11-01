/**
 * 
 */
package com.gnorien.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.gnorien.web.service.PrimeService;
import com.gnorien.web.utils.AjaxResponse;
import com.gnorien.web.utils.PrimeCriteria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gnorien
 *
 */

	@RestController
	public class PrimeController {
		
		@Autowired
		PrimeService primeService;
		
		
		@PostMapping("/api/prime")
	    public ResponseEntity<?> getSearchResultViaAjax(
	            @Valid @RequestBody PrimeCriteria search, Errors errors) {

	        AjaxResponse result = new AjaxResponse();

	        //If error, just return a 400 bad request, along with the error message
	        if (errors.hasErrors()) {

	            result.setMsg(errors.getAllErrors()
	                        .stream().map(x -> x.getDefaultMessage())
	                        .collect(Collectors.joining(",")));

	            return ResponseEntity.badRequest().body(result);

	        }

	        List<Integer> primes= new ArrayList<Integer>();
	      
	      
	      int i=Integer.parseInt(search.getPrimeNumber());  
          // get the prime for a number
	      primes=    primeService.sieveOfEratosthenes(i);
	        
	      
	        if (primes.isEmpty()) {
	            result.setMsg("no prime found!");
	        } else {
	            result.setMsg("success");
	        }
	        result.setResult(primes);

	        return ResponseEntity.ok(primes);

	    }

	}

	

