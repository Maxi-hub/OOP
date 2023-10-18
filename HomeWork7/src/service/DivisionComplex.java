package service;

import data.CalcComplex;

public class DivisionComplex extends CalcComplex {

    public DivisionComplex() {
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

    public String division(CalcComplex C1, CalcComplex C2) {
        DivisionComplex temp = new DivisionComplex();
        temp.setReal(C1.real / C2.real);
        temp.setImaginary(C1.imaginary / C2.imaginary);
        return temp.result();
    }
}

