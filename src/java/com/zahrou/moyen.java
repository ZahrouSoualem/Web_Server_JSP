/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zahrou;

/**
 *
 * @author Zahreddine Soualem
 */
import java.io.Serializable;
public class moyen implements Serializable {
    private double num1;
    private double num2;
    private double num3;
    
    double moy=(getNum1()+getNum2()+getNum3())/3;
    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }
    

    public double getMoy() {
        return (getNum1()+getNum2()+getNum3())/3;
    }
    public moyen(){
        
    }
    public moyen(double num1,double num2,double num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }
}


