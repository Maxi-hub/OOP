package service;

import data.CalcComplex;

public class SumComplex extends CalcComplex {

    public SumComplex() {
        super();
    }

    @Override
    public void setReal(int value) {
        super.real = value;
    }

    @Override
    public void setImaginary(int value) {
        super.imaginary = value;
    }

    public String sum(CalcComplex C1, CalcComplex C2) {
        SumComplex temp = new SumComplex();
        temp.setReal(C1.real + C2.real);
        temp.setImaginary(C1.imaginary +C2.imaginary);
        return temp.result();
    }

}
