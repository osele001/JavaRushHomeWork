package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Сергей on 21.04.2015.
 */
public class SubSolution extends Solution {
    public SubSolution() {
    }

    public SubSolution(int n) {
        super(n);
    }

    public SubSolution(String s) {
        super(s);
    }

    protected SubSolution(float s, int n) {
        super(s, n);
    }

    protected SubSolution(int n, float s) {
        super(n, s);
    }

    protected SubSolution(Double n, int s) {
        super(n, s);
    }

     SubSolution(Integer s, String m) {
        super(s, m);
    }

     SubSolution(String m, Integer s) {
        super(m, s);
    }

     SubSolution(float n, String m) {
        super(n, m);
    }
    private SubSolution(Double n) {
    }
    private SubSolution(Integer n) {
    }
    private SubSolution(Short n) {
    }
}
