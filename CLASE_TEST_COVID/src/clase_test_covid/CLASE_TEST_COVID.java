/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_test_covid;

/**
 *
 * @author ihdzg
 */
public class CLASE_TEST_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestCovid persona = new TestCovid();
        persona.getEdad();
        persona.getEstatura();
        persona.getPeso();
        persona.getTieneEnfermedadCronica();

        System.out.println("Resultado del test: " + persona.calcularPersonaRiesgo());
        
    }
    
}
