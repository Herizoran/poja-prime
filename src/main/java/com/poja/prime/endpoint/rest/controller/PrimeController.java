package com.poja.prime.endpoint.rest.controller;

import java.math.BigInteger;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {
  @GetMapping("/new-prime")
  public BigInteger generateProbablePrime() {
    BigInteger probablePrime = BigInteger.probablePrime(10000, new Random());
    return probablePrime;
  }
}
