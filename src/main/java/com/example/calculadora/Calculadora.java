package com.example.calculadora;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class Calculadora {

    @GetMapping("/adicao")
    public double adicao(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @PostMapping("/adicao")
    public double adicaoPost(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/subtracao")
    public double subtracao(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @PostMapping("/subtracao")
    public double subtracaoPost(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/multiplicao")
    public double multiplicao(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @PostMapping("/multiplicao")
    public double multiplicaoPost(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/divisao")
    public double divisao(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a / b;
    }

    @PostMapping("/divisao")
    public double divisaoPost(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a / b;
    }

    @GetMapping("/exponenciacao")
    public double exponenciacao(@RequestParam double a, @RequestParam double b) {
        return Math.pow(a, b);
    }

    @PostMapping("/exponenciacao")
    public double exponenciacaoPost(@RequestParam double a, @RequestParam double b) {
        return Math.pow(a, b);
    }
}
