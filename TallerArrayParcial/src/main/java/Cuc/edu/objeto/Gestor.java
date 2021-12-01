package Cuc.edu.objeto;

import java.util.ArrayList;
import java.util.Objects;

public class Gestor {
    
    private ArrayList<NumerosMixtos> numeros = new  ArrayList();

    public Gestor() {
    }

    public ArrayList<NumerosMixtos> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<NumerosMixtos> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Gestor{" + "numeros=" + numeros + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.numeros);
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
        final Gestor other = (Gestor) obj;
        if (!Objects.equals(this.numeros, other.numeros)) {
            return false;
        }
        return true;
    }
    
    public boolean adicionarNumero(int entero,int numerador, int denominador){
        
        NumerosMixtos numerosMixtos = new NumerosMixtos(numerador, denominador, entero);
        return numeros.add(numerosMixtos);
        
    }
    
    public boolean buscarNumero(int entero,int numerador, int denominador){
        
        NumerosMixtos numerosMixtos = new NumerosMixtos(numerador, denominador, entero);
        return numeros.contains(numerosMixtos);
        
    }
    
    public boolean eliminarNumero(int entero,int numerador, int denominador){
        
        NumerosMixtos numerosMixtos = new NumerosMixtos(numerador, denominador, entero);
        return numeros.remove(numerosMixtos);
        
    }
    
    
    public ArrayList<NumerosMixtos> enteroIndicado(int numero){
        
        ArrayList<NumerosMixtos> enteros = new ArrayList();
        
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i).getEntero() == numero) {
                enteros.add(numeros.get(i));
            }
        }
        return enteros;
    }
    
    public ArrayList<NumerosMixtos> valorMayorQue(int numero){
    
        ArrayList<NumerosMixtos> valor = new ArrayList();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i).valor() > numero) {
                valor.add(numeros.get(i));
            }
        }
        
        return valor;
        
    }
    
    public String componentes(){
        
        ArrayList<NumerosMixtos> pares = new ArrayList();
        for (int i = 0; i < numeros.size(); i++) {
            if ((numeros.get(i).getNumerador()%2) == 0) {
                pares.add(numeros.get(i));
            }else if ((numeros.get(i).getDenominador()%2) == 0) {
                pares.add(numeros.get(i));
            }
        }
        
        return "La cantidad de numeros mixtos con componentes pares es: "+pares.size();
        
    }
    
}
