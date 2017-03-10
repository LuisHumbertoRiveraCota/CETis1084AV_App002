package mx.edu.cetis108.cetis1084av_app002;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtxt1, edtxt2;
    Button btns, btnr, btnm, btnd;
    TextView tvres;
    Integer num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxt1 = (EditText) findViewById(R.id.etxt1);
        edtxt2 = (EditText) findViewById(R.id.etxt2);

        btns = (Button) findViewById(R.id.btnSuma);
        btnr = (Button) findViewById(R.id.btnResta);
        btnm = (Button) findViewById(R.id.btnMultiplicacion);
        btnd = (Button) findViewById(R.id.btnDivicion);
        tvres=(TextView) findViewById(R.id.textView2);

        btns.setOnClickListener(this);
        btnr.setOnClickListener(this);
        btnm.setOnClickListener(this);
        btnd.setOnClickListener(this);
    }


    public void onClick(View view) {

        num1 = Integer.valueOf((edtxt1.getText().toString()));
        num2 = Integer.valueOf((edtxt2.getText().toString()));

        switch (view.getId()) {
            case R.id.btnSuma:
                res=num1+num2;
                tvres.setText(res.toString());
                break;
            case R.id.btnResta:
                res = num1 - num2;
                tvres.setText(res.toString());
                break;
            case R.id.btnMultiplicacion:
                res = num1 * num2;
                tvres.setText(res.toString());
                break;
            case R.id.btnDivicion:
                res = num1 / num2;
                tvres.setText(res.toString());
                break;

        }
    }

}


