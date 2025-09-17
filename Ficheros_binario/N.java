/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros_binario;

import java.io.Serializable;

/**
 *
 * @author ixche
 */
public class N implements Serializable{
    private boolean b = true;
    private char c = 'a';
    private int n = 0101;
    private double d = 1.81;
    private String s = "hola";

    public N() {
    }
    public N(boolean b, char c, int n, double d) {
        this();
    }
    
    public N(boolean b, char c, int n, double d, String s) {
        this.b = b;
        this.c = c;
        this.n = n;
        this.d = d;
        this.s = s;
    }

    public boolean isB() {
        return b;
    }

    public char getC() {
        return c;
    }

    public int getN() {
        return n;
    }

    public double getD() {
        return d;
    }

    public String getS() {
        return s;
    }
    

    @Override
    public String toString() {
        return "N{" + "b: " + b + ", c: " + c + ", n: " + n + ", s: " + s + '}';
    }
    
    
}
