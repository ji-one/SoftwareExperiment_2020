package com.example.serviceex;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

    ServiceThread thread;

    public IBinder onBind(Intent intent){
        return null;
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        myServiceHandler handler = new myServiceHandler();
        thread = new ServiceThread(handler);
        thread.start();
        return START_STICKY;
    }

    public void onDestroy(){
        thread.stopForever();
        thread = null;
    }

   class myServiceHandler extends Handler {
        public void handleMessage(android.os.Message msg){
            Toast.makeText(MyService.this,"서비스가 실행 중 입니다.",Toast.LENGTH_LONG).show();
        }
   }
}
