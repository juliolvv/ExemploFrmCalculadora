package modelo;

public class Calculadora {
    
    private double valorA;
    private double valorB;
    
    public Calculadora() {
        this(0.0,0.0);
    }
    
    public Calculadora(double valorA, double valorB) {
        
        this.valorA= valorA;
        this.valorB= valorB;
    }

    public double getvalorA() {
        return valorA;
    }

    public void setvalorA(double valorA) {
        this.valorA = valorA;
    }
    
    public double getvalorB() {
        return valorB;
    }

    public void setvalorB(double valorB) {
        this.valorB = valorB;
    }
    
     public double getSoma() {
         return (getvalorA() + getvalorB());
     }  
     public double getDiferenca() {
        return (getvalorA() - getvalorB());
    } 
     public double getProduto() {
        return (getvalorA() * getvalorB());
     } 
     public double getQuociente() {
        return (getvalorA() / getvalorB());
    }
}
