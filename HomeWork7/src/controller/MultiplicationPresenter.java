package controller;

import data.CalcComplex;
import data.Complex;
import service.MultiplicationComplex;
import service.SumComplex;
import view.View;

public class MultiplicationPresenter extends Presenter {

    private String res;

    public MultiplicationPresenter(Complex c, View v) {
        super(c, v);
        super.complex = c;
        super.view = v;
    }

    ;

    @Override
    public void buttonClick() {
        super.buttonClick();
        res = ((MultiplicationComplex) complex).multiplication((CalcComplex) complex, (CalcComplex) secondNumber);
        view.print(res, "Результат умножения комплексных чисел: ");

    }
}

