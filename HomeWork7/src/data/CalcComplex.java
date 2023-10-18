package data;

import data.Complex;

public class CalcComplex implements Complex {
    public int real;
    public int imaginary;


    public CalcComplex() {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String result() {
        return real + " + i" + imaginary;
    }

    @Override
    public void setReal(int value) {
        this.real = value;

    }

    @Override
    public void setImaginary(int value) {
        this.imaginary = value;
    }
}
