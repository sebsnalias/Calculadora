
package models;

public class CalculatorModel {
    
    double firstValue = 0;
    double secondValue = 0;
    
    public double getFirstValue(){
        return firstValue;
    }
    
    public double getSecondValue(){
        return secondValue;
    }
    
    public void setValues(double firstValue, double secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    
    public double add(){
       return this.firstValue + this.secondValue;
    }
    
    public double subtract(){
        return this.firstValue - this.secondValue;
    }
    
    public double multiplicate(){
        return this.firstValue * this.secondValue;
    }
    
    public double divide(){
        return this.firstValue / this.secondValue;
    }
    
    public double getAdd(){
        return this.add();   
    }
    
    public double getSubtract(){
        return this.subtract();
    }
    
    public double getMultiplicate(){
        return this.multiplicate();
    }
    
    public double getDivide(){
        return this.divide();
    }
}
