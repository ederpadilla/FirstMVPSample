package dev.eder.padilla.firstmvpsample.login.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dev.eder.padilla.firstmvpsample.R;
import dev.eder.padilla.firstmvpsample.login.model.PresenterImpl;
import dev.eder.padilla.firstmvpsample.login.presenter.LoginPresenter;
import dev.eder.padilla.firstmvpsample.login.view.LogInView;

public class LoginActivity extends Activity implements LogInView{

    @BindView(R.id.et_mail) EditText editTextMail;

    @BindView(R.id.et_pass) EditText editTextPass;

    LoginPresenter lmLoginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        lmLoginPresenter = new PresenterImpl(LoginActivity.this);
    }

    @OnClick(R.id.btn_login)public void login(){
        String email = editTextMail.getText().toString();
        String pass = editTextPass.getText().toString();
        lmLoginPresenter.performLogin(email,pass);
    }

    @Override
    public void logInValidation() {
        Toast.makeText(getApplicationContext(),"campos vacios 👹", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccesss() {
        Toast.makeText(getApplicationContext(),"🌮 SucessLogin 🌮",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(getApplicationContext(),"Wrong mail or pass 😬 ",Toast.LENGTH_SHORT).show();
    }
}
