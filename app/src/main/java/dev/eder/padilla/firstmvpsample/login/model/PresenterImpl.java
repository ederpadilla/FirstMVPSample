package dev.eder.padilla.firstmvpsample.login.model;

import android.text.TextUtils;

import dev.eder.padilla.firstmvpsample.login.presenter.LoginPresenter;
import dev.eder.padilla.firstmvpsample.login.view.LogInView;

public class PresenterImpl implements LoginPresenter {
    LogInView mLogInView;

    public PresenterImpl(LogInView mLogInView) {
        this.mLogInView = mLogInView;
    }

    @Override
    public void performLogin(String mail, String pass) {
        if (TextUtils.isEmpty(mail) || TextUtils.isEmpty(pass)){
            mLogInView.logInValidation();
        }else{
            if (mail.equals("eder@uble.mx") && pass.equals("12345678")){
                mLogInView.loginSuccesss();
            }else{
                mLogInView.loginError();
            }
        }
    }
}
