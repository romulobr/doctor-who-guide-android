package co.romulo.doctorWhoGuide.Episodes.activities;

import android.content.Intent;
import android.widget.TextView;
import co.romulo.doctorWhoGuide.Episodes.Models.Episode;
import co.romulo.doctorWhoGuide.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class EpisodeDetailsActivityTest {

    @Test
    public void loadsEpisode() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Episode episode = new Episode(3, 1, 3, "The Unquiet Dead", "The Doctor has great expectations for his latest adventure when he and Rose join forces with Charles Dickens to investigate a mysterious plague of zombies.", sdf.parse("24-03-2006"));

        Intent intent = new Intent(Robolectric.getShadowApplication().getApplicationContext(), EpisodeDetailsActivity.class);
        intent.putExtra("episode", episode);
        EpisodeDetailsActivity activity = Robolectric.buildActivity(EpisodeDetailsActivity.class).withIntent(intent).create().get();

        DateFormat systemDateFormat = android.text.format.DateFormat.getDateFormat(Robolectric.getShadowApplication().getApplicationContext());

        TextView episodeDateTextView = (TextView) activity.findViewById(R.id.episodeDetailReleaseDate);
        TextView episodeSynopsysTextView = (TextView) activity.findViewById(R.id.episodeDetailSynopsys);
        TextView episodeSeasonAndNumberTextView = (TextView) activity.findViewById(R.id.episodeDetailSeasonAndNumber);

        String episodeDateInView = String.valueOf(episodeDateTextView.getText());
        String episodeSynopsysInView = String.valueOf(episodeSynopsysTextView.getText());
        String episodeSeasonAndNumberInView = String.valueOf(episodeSeasonAndNumberTextView.getText());

        assertThat(episodeDateInView, is(systemDateFormat.format(episode.getFirstAired())));
        assertThat(episodeSynopsysInView, is(episode.getSynopsys()));
        assertThat(episodeSeasonAndNumberInView, is(episode.getFormatedSeasonAndNumberLongVersion()));

    }
}
