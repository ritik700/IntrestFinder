package com.example.ritik.interestfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText p,r,n,res;
    TextView pp, rr, nn;
    Button c,s;
    double ppp, rrr, nnn, a, ci, si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p = (EditText) findViewById(R.id.amountValue);
        r = (EditText) findViewById(R.id.rateValue);
        n = (EditText) findViewById(R.id.yearValue);
        pp = (TextView) findViewById(R.id.amount);
        rr = (TextView) findViewById(R.id.rate);
        nn = (TextView) findViewById(R.id.year);
        c = (Button) findViewById(R.id.compound);
        s = (Button) findViewById(R.id.simple);
        res = (EditText) findViewById(R.id.result);
        c.setOnClickListener(this);
        s.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.compound)
        {
            ppp = Double.parseDouble(p.getText().toString());
            rrr = Double.parseDouble(r.getText().toString());
            nnn = Double.parseDouble(n.getText().toString());
            a = ppp * Math.pow((1+rrr/100),nnn);
            ci = a-ppp;
            res.setText(""+ci);
        }
        if(v.getId()==R.id.simple)
        {
            ppp = Double.parseDouble(p.getText().toString());
            rrr = Double.parseDouble(r.getText().toString());
            nnn = Double.parseDouble(n.getText().toString());
            si = (nnn*ppp*rrr)/100;
            res.setText(""+si);
        }


    }


}
