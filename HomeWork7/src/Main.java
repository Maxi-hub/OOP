import controller.DivisionPresenter;
import controller.MultiplicationPresenter;
import controller.Presenter;
import controller.SumPresenter;
import service.SumComplex;
import service.DivisionComplex;
import service.MultiplicationComplex;
import view.View;

public class Main {
    public static void main(String[] args) {

        Presenter p = new SumPresenter(new SumComplex(), new view.View());
        p.buttonClick();
        System.out.println("-------------------");
        Presenter m = new MultiplicationPresenter(new MultiplicationComplex(), new View());
        m.buttonClick();
        System.out.println("-------------------");
        Presenter d = new DivisionPresenter(new DivisionComplex(), new View());
        d.buttonClick();

    }
}
