package co.romulo.doctorWhoGuide;

import android.app.Activity;
import android.os.Bundle;

import static co.romulo.doctorWhoGuide.R.*;

public class Hello extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.main);
    }
}
