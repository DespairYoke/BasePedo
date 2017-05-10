package com.base.basepedo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.base.basepedo.R;

/**
 * Created by Administrator on 2017/5/9 0009.
 */

public class Step extends AppCompatActivity {
    private EditText edt;
    private Button btn;
    private int step;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step);
        edt= (EditText) findViewById(R.id.edt);
        btn= (Button) findViewById(R.id.bt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                step=Integer.parseInt(edt.getText().toString());
                Intent in=new Intent(Step.this,MainActivity.class);
                in.putExtra("step",step);
                startActivity(in);
                finish();
            }
        });
    }
}
