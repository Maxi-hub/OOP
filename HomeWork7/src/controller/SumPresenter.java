package controller;

import data.CalcComplex;
import data.Complex;
import service.SumComplex;
import view.View;

public class SumPresenter extends Presenter{

    private String res;

    public SumPresenter(Complex c, View v) {
        super(c, v);
        super.complex = c;
        super.view = v;
    };

    @Override
    public void buttonClick() {
        super.buttonClick();
        res = ((SumComplex) complex).sum((CalcComplex)complex, (CalcComplex) secondNumber);
        view.print(res, "Сумма комплексных чисел равна: ");
    }


}
