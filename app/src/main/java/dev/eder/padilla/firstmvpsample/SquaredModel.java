package dev.eder.padilla.firstmvpsample;

public class SquaredModel implements Squared.Model{

    private Squared.Presenter squaredPresenter;
    private double result;

    public SquaredModel(Squared.Presenter squaredPresenter) {
        this.squaredPresenter = squaredPresenter;
    }

    @Override
    public void squared(String data) {
        if (!data.equals("")) {
            result = Double.valueOf(data) * Double.valueOf(data);
            squaredPresenter.showResult(String.valueOf(result)+"🌮");
        }else{
            squaredPresenter.showError("Error campo vacio👹");
        }
    }
}
