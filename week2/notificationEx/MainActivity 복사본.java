package com.example.notificationex;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                NotificationSomethings();
            }
        });
    }
    public void NotificationSomethings()
    {
        Bitmap mLargeIconForNoti =
                BitmapFactory.decodeResource(getResources(),R.drawable.ic_stat_name);

        PendingIntent contentIntent = PendingIntent.getActivity(MainActivity.this,0,
                new Intent(getApplicationContext(),MainActivity.class),PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder
                = new NotificationCompat.Builder(MainActivity.this);
        builder.setSmallIcon(R.drawable.ic_stat_name);
        builder.setContentTitle("상태바 드래그시 보이는 타이틀");
        builder.setContentText("상태바 드래그시 보이는 서브타이틀");
        builder.setTicker("상태바 한줄 메시지");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setLargeIcon(mLargeIconForNoti);
        builder.setAutoCancel(true);
        builder.setDefaults(Notification.DEFAULT_ALL);
        builder.setContentIntent(contentIntent);


        NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(1234,builder.build());
    }


}
