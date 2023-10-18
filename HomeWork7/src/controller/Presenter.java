package controller;

import data.CalcComplex;
import data.Complex;
import view.View;

public class Presenter {
    View view;
    Complex complex;
    Complex secondNumber = new CalcComplex();


    public Presenter(Complex c, View v) {
        complex = c;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("Комплексное число 1, значение 1: ");
        int b = view.getValue("Комплексное число 1, значение 2: ");
        System.out.println ("Комплексный число 1: " + a + " + i" + b);
        int a1 = view.getValue("Комплексное число 2, значение 1: ");
        int b1 = view.getValue("Комплексное число 2, значение 2: ");
        System.out.println ("Комплексное число 2: " + a1 + " + i" + b1);

        complex.setReal(a);
        complex.setImaginary(b);

        secondNumber.setReal(a1);
        secondNumber.setImaginary(b1);

    }
}

