package fibonacci.prueba;

public class Fibonacci_2 {
    // Atributos
    private int n;
    private int a1;
    private int a2;

    // Constructores
    public Fibonacci_2() {
        n = 6;
        a1 = 1;
        a2 = 2;
    }
    
    // Métodos Set
    public void setN(int valor) {
        n = valor;
    }

    public void setA1(int valor) {
        a1 = valor;
    }

    public void setA2(int valor) {
        a2 = valor;
    }

    // Métodos Get
    public int getN() {
        return n;
    }

    public int getA1() {
        return a1;
    }

    public int getA2() {
        return a2;
    }

    // Método para calcular e imprimir la serie
    public void imprimirSerie() {
        
        System.out.println("El valor de a1 es: " + a1);
        System.out.println("El valor de a2 es: " + a2);
        System.out.println("El valor de n es: " + n);

        System.out.print(a1 + " - " + a2 + " - ");
        
        for (int i = 2; i < n; i++) {
            int siguiente = a1 + a2;
            a1 = a2;
            a2 = siguiente;
            System.out.print(siguiente + " - ");
        }
    }
}