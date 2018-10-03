/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlversiones;

/**
 *
 * @author David
 */
public class ControlVersiones {
    
    float numero1;
    float numero2;

    public ControlVersiones(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    private float Suma(float num1, float num2){
        return num1 + num2;
    }
    
    private float Resta(float num1, float num2){
        return num1 - num2;
    }
    
    private float Multiplicacion(float num1, float num2){
        return num1 * num2;
    }
    
    
    
}
