/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author Dell
 */
public class Numberal extends Expression{
    int value;

    public Numberal() {
        this.value=0;
    }

    public Numberal(int value) {
        this.value = value;
    }
    
    @Override
    public int evaluate() {
        
        return value;
    }

    @Override
    public String toString() {
        return ""+value;
    }
    
}
