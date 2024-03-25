package com.example.demo_cache.controller;

import com.example.demo_cache.service.NumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/number")
public class NumberController {

    private final Logger logger = LoggerFactory.getLogger(NumberController.class);

    private final NumberService numberService;

    public NumberController(NumberService numberService) {
        this.numberService = numberService;
    }

    @GetMapping(path = "/square/{number}")
    public Map<String, BigDecimal> getSquare(@PathVariable Long number) {
        logger.info("call numberService to square {}", number);
        return Map.of("square", numberService.square(number));
    }
}
