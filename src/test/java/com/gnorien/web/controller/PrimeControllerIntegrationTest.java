/**
 * 
 */
package com.gnorien.web.controller;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.gnorien.web.service.PrimeService;


@RunWith(SpringRunner.class)
@WebMvcTest(value = PrimeController.class, excludeAutoConfiguration = SecurityAutoConfiguration.class)
public class PrimeControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private PrimeService service;

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void givenPrime_whenGetPrime_thenReturnArray() throws Exception {

        List<Integer> allPrimes = Arrays.asList(2, 3, 5);

        given(service.sieveOfEratosthenes(6)).willReturn(allPrimes);
        
    }

}