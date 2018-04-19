package dev.eder.padilla.firstmvpsample;

public class SquaredPresenter implements Squared.Presenter {
    private Squared.View view;
    private Squared.Model model;

    public SquaredPresenter(Squared.View view) {
        this.view = view;
        model = new SquaredModel(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null){
            view.showResult(result);
        }
    }

    @Override
    public void squared(String data) {
        if (view!=null){
            model.squared(data);
        }
    }

    @Override
    public void showError(String error) {
        if (view!=null){
            view.showError(error);
        }
    }
}
