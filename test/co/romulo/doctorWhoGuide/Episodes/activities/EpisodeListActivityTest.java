package co.romulo.doctorWhoGuide.Episodes.activities;

import co.romulo.doctorWhoGuide.Episodes.Models.Episode;
import co.romulo.doctorWhoGuide.Episodes.adapters.EpisodeArrayAdapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import java.util.Arrays;
import java.util.Date;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class EpisodeListActivityTest {

    Episode episodes[] = {new Episode(1, 1, 1, "episode 1", "very nice and long description 1", new Date()),
            new Episode(2, 1, 2, "episode 2", "very nice and long description 2", new Date()),
            new Episode(3, 1, 3, "episode 3", "very nice and long description 3", new Date())
    };

    @Test
    public void loadsListOfEpisodesFromAdapter() throws Exception {
        EpisodeListActivity activity = Robolectric.buildActivity(EpisodeListActivity.class).create().get();
        EpisodeArrayAdapter episodeArrayAdapter = new EpisodeArrayAdapter(activity, 0, Arrays.asList(episodes));
        activity.setListAdapter(episodeArrayAdapter);
        assertThat(activity.getListView().getAdapter().getCount(), equalTo(3));
    }
}
