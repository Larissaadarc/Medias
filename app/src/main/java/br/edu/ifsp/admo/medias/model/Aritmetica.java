package br.edu.ifsp.admo.medias.model;

public class Aritmetica {
    public Double[] aritmetica = new Double[5];

    public void calcularMedia(){
        double resultado = 0;

        for(int i = 0; i < aritmetica.length; i++){
            resultado += aritmetica[i];
        }

        resultado = resultado/5;
    }
}

