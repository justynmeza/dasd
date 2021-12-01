package Cuc.edu.objeto;

public class NumerosMixtos {
    
    private int numerador;
    private int denominador;
    private int entero;

    public NumerosMixtos(int numerador, int denominador, int entero) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.entero = entero;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    @Override
    public String toString() {
        return "NumerosMixtos{" + "numerador=" + numerador + ", denominador=" + denominador + ", entero=" + entero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.numerador;
        hash = 23 * hash + this.denominador;
        hash = 23 * hash + this.entero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NumerosMixtos other = (NumerosMixtos) obj;
        if (this.numerador != other.numerador) {
            return false;
        }
        if (this.denominador != other.denominador) {
            return false;
        }
        if (this.entero != other.entero) {
            return false;
        }
        return true;
    }
    
    public double valor(){
        
        return (((this.entero*this.denominador)+this.numerador)/this.denominador);
        
    }
    
    
}
