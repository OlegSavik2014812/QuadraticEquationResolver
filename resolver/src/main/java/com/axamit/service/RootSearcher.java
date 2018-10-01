package com.axamit.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RootSearcher implements EquationAction{
    public String calculate(double factorA, double factorB, double factorC) {
        double discriminant = calculateDiscriminant(factorA, factorB, factorC);
        if (discriminant < 0) {
            return "Can't calculate equation";
        } else if (discriminant == 0) {
            return String.valueOf(calculateOneRoot(factorA, factorB));
        } else {
            return Arrays.toString(calculateTwoRoots(factorA, factorB, discriminant));
        }
    }

    private double calculateDiscriminant(double factorA, double factorB, double factorC) {
        return Math.pow(factorB, 2) - 4 * factorA * factorC;
    }

    private double calculateOneRoot(double factorA, double factorB) {
        return (-factorB) / (2 * factorA);
    }

    private double[] calculateTwoRoots(double factorA, double factorB, double discriminant) {
        double firstRoot = (-factorB + Math.sqrt(discriminant)) / (2 * factorA);
        double secondRoot = (-factorB - Math.sqrt(discriminant)) / (2 * factorA);
        return new double[]{firstRoot, secondRoot};
    }
}
