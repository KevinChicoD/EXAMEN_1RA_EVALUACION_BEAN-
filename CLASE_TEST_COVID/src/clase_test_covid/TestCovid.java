/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_test_covid;

/**
 *
 * @author ihdzg
 */
public class TestCovid {
    private int edad = 60;
    private boolean tieneEnfermedadCronica = false;
    private double peso = 110;
    private double estatura = 1.75;

    public void setEdad(int valor) {
        valor = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTieneEnfermedadCronica(boolean tieneEnfermedadCronica) {
        tieneEnfermedadCronica = tieneEnfermedadCronica;
    }

    public boolean getTieneEnfermedadCronica() {
        return tieneEnfermedadCronica;
    }

    public void setPeso(double valor) {
        valor = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setEstatura(double valor) {
        estatura = valor;
    }

    public double getEstatura() {
        return estatura;
    }

    private double calcularIMC() {
        return peso / (estatura * estatura);
    }

    public String calcularPersonaRiesgo() {
        if ((edad >= 65) || (tieneEnfermedadCronica) || (calcularIMC() > 30) ) {
            return "PERSONA DE RIESGO";
        } else {
            return "PERSONA SIN RIESGO";
        }
    }
}
