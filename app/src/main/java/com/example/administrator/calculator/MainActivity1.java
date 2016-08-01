package com.example.administrator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.*;

public class MainActivity1 extends AppCompatActivity {
    EditText e1,e2;
    Button add,sub,div,pro,root,pow;
    int n1,n2;
    double n3,n4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        showp();
    }

    public void showp()
    {
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        add=(Button)findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(String.valueOf(e1.getText()));
                n2=Integer.parseInt(String.valueOf(e2.getText()));
                int sum = n1+n2;
                Toast.makeText(MainActivity1.this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
            }
        });

        sub=(Button)findViewById(R.id.button2);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(String.valueOf(e1.getText()));
                n2=Integer.parseInt(String.valueOf(e2.getText()));
                int sub=n1-n2;
                Toast.makeText(MainActivity1.this, String.valueOf(sub), Toast.LENGTH_SHORT).show();
            }
        });

        div=(Button)findViewById(R.id.button3);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n3 = Double.parseDouble(String.valueOf(e1.getText()));
                n4 = Double.parseDouble(String.valueOf(e2.getText()));
                if (n4 == 0)
                    Toast.makeText(MainActivity1.this, "Divide by zero error", Toast.LENGTH_SHORT).show();
                else {
                    double div = n3/n4;
                    Toast.makeText(MainActivity1.this, String.valueOf(div), Toast.LENGTH_SHORT).show();
                }
            }
        });
        pro=(Button)findViewById(R.id.button4);
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(String.valueOf(e1.getText()));
                n2=Integer.parseInt(String.valueOf(e2.getText()));
                int pro = n1*n2;
                Toast.makeText(MainActivity1.this,String.valueOf(pro), Toast.LENGTH_SHORT).show();
            }
        });

        pow = (Button)findViewById(R.id.button6);
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double n1=Double.parseDouble(String.valueOf(e1.getText()));
                double n2=Double.parseDouble(String.valueOf(e2.getText()));
                double pow = Math.pow(n1, n2);
                Toast.makeText(MainActivity1.this, String.valueOf(pow), Toast.LENGTH_SHORT).show();
            }
        });

        root=(Button)findViewById(R.id.button5);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1=Double.parseDouble(String.valueOf(e1.getText()));
                double n2=Double.parseDouble(String.valueOf(e2.getText()));
                double root1 = Math.sqrt(n1);
                double root2 = Math.sqrt(n2);
                StringBuffer buffer = new StringBuffer();
                buffer.append("Root of No1 "+ root1+"\n");
                buffer.append("Root of No2 "+ root2);
                Toast.makeText(MainActivity1.this,buffer.toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }

}
