package imsunny37.smarthomesecurity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by apple on 19/8/17.
 */

public class Splash_Activity extends Activity {
    @Override
    protected void onCreate(Bundle sunnylove) {
        super.onCreate(sunnylove);
        setContentView(R.layout.layout_splash);

        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(5000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openStartingPoint = new Intent(Splash_Activity.this, Login_Activity.class);
                    startActivity(openStartingPoint);
                    finish();
                }
            }
        };
        timer.start();
    }
    }
