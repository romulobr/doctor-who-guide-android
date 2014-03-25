package co.romulo.doctorWhoGuide.Episodes.activities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class EpisodeListActivityTest {

    @Test
    public void loadsListOfEpisodes() throws Exception {
        EpisodeListActivity activity = Robolectric.buildActivity(EpisodeListActivity.class).create().get();
        assertThat(activity.getListView().getAdapter().getCount(), greaterThan(0));
    }
}
