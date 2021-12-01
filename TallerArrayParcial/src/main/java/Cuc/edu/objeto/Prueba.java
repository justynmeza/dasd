package Cuc.edu.objeto;

public class Prueba {

    public static void main(String[] args) {
        
        Gestor numeros = new Gestor();
        
        numeros.adicionarNumero(4, 3, 4);
        numeros.adicionarNumero(2, 3, 4);
        numeros.adicionarNumero(3, 5, 7);
        numeros.adicionarNumero(3, 4, 6);
        
        System.out.println("Busqueda 1: "+ numeros.buscarNumero(4, 3, 4));
        System.out.println("Busqueda 2: "+ numeros.buscarNumero(2, 3, 4));
        
        System.out.println("Eliminacion 1: "+ numeros.eliminarNumero(2, 3, 4));
        
        System.out.println("Numeros mixtos con numero entero indicado: "+ numeros.enteroIndicado(3));
        
        System.out.println("Numeros mixtos con valor mayor que: "+ numeros.valorMayorQue(3));
        
        System.out.println("Cantidad de numeros mixtos con componentes pares: "+ numeros.componentes());
        
    }
    
}
