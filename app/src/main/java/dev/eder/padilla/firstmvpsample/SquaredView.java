package dev.eder.padilla.firstmvpsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SquaredView extends AppCompatActivity implements Squared.View{

    @BindView(R.id.et_input_number) EditText mEtinputNumber;
    @BindView(R.id.tv_squared_result) TextView mTvResult;

    private Squared.Presenter squaredPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        squaredPresenter = new SquaredPresenter(this);
    }

    public void calcular(View view){
        squaredPresenter.squared(mEtinputNumber.getText().toString());
    }

    @Override
    public void showResult(String result) {
        mTvResult.setText(result);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getApplicationContext(),error,Toast.LENGTH_SHORT).show();
    }
}
