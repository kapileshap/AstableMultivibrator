package com.example.user.astablemultivibrator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText Vcc,Ic,F;
    TextView R0,Rc,C;
    Button generate;



    double vol,cur,f,r0,ca,rc,b;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.user.astablemultivibrator.R.layout.activity_main);
        Vcc=(EditText)findViewById(com.example.user.astablemultivibrator.R.id.editText2);
        Ic=(EditText)findViewById(com.example.user.astablemultivibrator.R.id.editText3);
        F=(EditText)findViewById(com.example.user.astablemultivibrator.R.id.editText3);
        R0=(TextView)findViewById(R.id.editR);
        Rc=(TextView)findViewById(R.id.editRc);
        C=(TextView)findViewById(R.id.editC);
        generate=(Button)findViewById(R.id.buttonPanel);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vol= Double.parseDouble(Vcc.getText().toString());
                cur=Double.parseDouble(Ic.getText().toString());
                f=Double.parseDouble(F.getText().toString());
                rc=(vol-0.2)/cur;
                r0=200*rc;
                ca=1/(1.38*r0*f);
                Rc.setText(Double.toString(rc));
                R0.setText(Double.toString(r0));
                C.setText(Double.toString(ca));


            }
        });
    }


    }
