package com.example.week3_sample01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {
    public EditText eText;
    public Button submitBtn;
    public Button cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        eText = (EditText)findViewById(R.id.editText);
        submitBtn = (Button)findViewById(R.id.submitBtn);
        cancelBtn = (Button)findViewById(R.id.cancelBtn);

        Intent intent = getIntent();
        eText.setText(intent.getStringExtra("TextIn"));

        submitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent outIntent = getIntent();
                outIntent.putExtra("TextOut",eText.getText().toString());
                setResult(RESULT_OK,outIntent);
                finish();
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outIntent = getIntent();
                setResult(RESULT_CANCELED,outIntent);
                finish();
            }
        });
    }
}
