package controller;

import data.CalcComplex;
import data.Complex;
import service.DivisionComplex;
import view.View;

public class DivisionPresenter extends Presenter {

    private String res;

    public DivisionPresenter(Complex c, View v) {
        super(c, v);
        super.complex = c;
        super.view = v;
    }


    @Override
    public void buttonClick() {
        super.buttonClick();
        res = ((DivisionComplex) complex).division((CalcComplex) complex, (CalcComplex) secondNumber);
        view.print(res, "Результат деления комплексных чисел: ");

    }
}
