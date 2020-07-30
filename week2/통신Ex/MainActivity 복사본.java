package com.example.week3_sample01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static int ACT_EDIT = 0;
    public Button btn;
    public TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView)findViewById(R.id.text);
        btn = (Button)findViewById(R.id.edit);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                intent.putExtra("TextIn",mText.getText().toString());
                startActivityForResult(intent,ACT_EDIT);
            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode, data);
        if(requestCode == ACT_EDIT && resultCode ==RESULT_OK){
            mText.setText(data.getStringExtra("TextOut"));
        }
    }

}
