package com.example.marci.calculadora;

abstract class CalculadoraFactory {

    private float valor1;
    private float valor2;

    float getValor1() {
        return valor1;
    }

    void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    float getValor2() {
        return valor2;
    }

    void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public abstract double somar();

    public abstract double subtrair();

    public abstract double multiplicar();

    public abstract double dividir();
}
