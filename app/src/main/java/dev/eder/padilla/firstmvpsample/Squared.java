package dev.eder.padilla.firstmvpsample;

public interface Squared {
    interface View{
        void showResult(String result);
        void showError(String error);
    }
    interface Presenter{
        void showResult(String result);
        void squared(String data);
        void showError(String error);
    }
    interface Model{
        void squared(String data);
    }
}
