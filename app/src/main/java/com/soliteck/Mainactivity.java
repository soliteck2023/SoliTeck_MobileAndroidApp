package com.soliteck;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Mainactivity extends Activity {
    ImageView image_splash;
    Animation animation1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image_splash = (ImageView) findViewById(R.id.image_splash);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.movingroundobject);
        image_splash.startAnimation(animation1);

        new Handler().postDelayed(new Runnable() { // from class: com.uvapay.activities.SplashScreenActivity.1
            @Override
            public void run() {
                Mainactivity.this.startActivity(new Intent(Mainactivity.this,LoginActivity.class));
                Mainactivity.this.finish();
            }
        }, 3000L);

    }

}
