package adam.dam2.iesebre.com.helloworldnotify;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by adam on 29/01/16.
 */
public class Notify extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this).init();
    }
}
