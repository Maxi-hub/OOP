package service;

import data.CalcComplex;

public class MultiplicationComplex extends CalcComplex {

    public MultiplicationComplex() {
        super();
    }

    @Override
    public void setReal(int value) {
        super.setReal(value);
    }

    @Override
    public void setImaginary(int value) {
        super.setImaginary(value);
    }

    public String multiplication(CalcComplex C1, CalcComplex C2) {
        MultiplicationComplex temp = new MultiplicationComplex();
        temp.setReal(C1.real * C2.real);
        temp.setImaginary(C1.imaginary * C2.imaginary);
        return temp.result();
    }
}
