package co.romulo.doctorWhoGuide.Episodes.adapters;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import co.romulo.doctorWhoGuide.Episodes.Models.Episode;
import co.romulo.doctorWhoGuide.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class EpisodeArrayAdapterTest {

    public static final int ID = 1;
    public static final int SEASON = 2;
    public static final int NUMBER = 3;
    public static final String NAME = "name";
    public static final String SINOPSYS = "sinopsys";

    @Test
    public void setsEpisodeDataOnGeneratedView() throws Exception {

        Context context = Robolectric.application;
        int resource = 0;
        List<Episode> episodes = new ArrayList<Episode>();
        Episode episode = new Episode(ID, SEASON, NUMBER, NAME, SINOPSYS, new Date());
        episodes.add(episode);

        EpisodeArrayAdapter episodeArrayAdapter = new EpisodeArrayAdapter(context, resource, episodes);
        View generatedView = episodeArrayAdapter.getView(0, null, null);
        TextView episodeNameView = (TextView) generatedView.findViewById(R.id.episodeName);
        TextView numberTextView = (TextView) generatedView.findViewById(R.id.episodeNumber);
        assertThat(episodeNameView.getText().toString(), is(episode.getName()));
        assertThat(numberTextView .getText().toString(), is(episode.getFormatedSeasonAndNumber()));
    }
}
