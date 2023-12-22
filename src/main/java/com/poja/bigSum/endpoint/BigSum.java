package com.poja.bigSum.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSum {

    @GetMapping("/big-sum")
    public BigInteger sum(BigInteger a, BigInteger b){
        return a.add(b);
    }
}
