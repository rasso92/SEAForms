package cr.co.sea.seaforms.Controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

import cr.co.sea.seaforms.R;

public class SplashActivity extends Activity{

    /** Tiempo de espera **/
    private final int SPLASH_DISPLAY_LENGTH = 1300;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        /* El nuevo Handler Inicia el loginActivity
         * y cierra el Splash despues de unos segundos.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this,LoginActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }


}
