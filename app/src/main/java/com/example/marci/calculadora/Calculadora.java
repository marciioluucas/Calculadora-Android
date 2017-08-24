package com.example.marci.calculadora;


 class Calculadora extends CalculadoraFactory {


    Calculadora(float v1, float v2) {
        this.setValor1(v1);
        this.setValor2(v2);
    }

    @Override
    public double somar() {
        return this.getValor1() + this.getValor2();
    }

    @Override
    public double subtrair() {
        return this.getValor1() - this.getValor2();
    }

    @Override
    public double multiplicar() {
        return this.getValor1() * this.getValor2();
    }

    @Override
    public double dividir() {
        return this.getValor1() / this.getValor2();
    }
}
