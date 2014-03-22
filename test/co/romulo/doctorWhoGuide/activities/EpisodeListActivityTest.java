package co.romulo.doctorWhoGuide.activities;

import android.app.Activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class EpisodeListActivityTest {

    @Test
    public void loadsListOfEpisodes() throws Exception {
        Activity activity = Robolectric.buildActivity(EpisodeListActivity.class).create().get();
    }

}
