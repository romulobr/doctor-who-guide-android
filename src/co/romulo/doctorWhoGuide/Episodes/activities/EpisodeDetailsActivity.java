package co.romulo.doctorWhoGuide.Episodes.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import co.romulo.doctorWhoGuide.Episodes.Models.Episode;
import co.romulo.doctorWhoGuide.R;

import java.text.DateFormat;

public class EpisodeDetailsActivity extends Activity {

    private DateFormat systemLocaleDateFormat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episode);
        Episode episode = (Episode) getIntent().getSerializableExtra("episode");
        systemLocaleDateFormat = android.text.format.DateFormat.getDateFormat(this);
        setEpisode(episode);
    }

    public void setEpisode(Episode episode) {
        TextView episodeNameView = (TextView) this.findViewById(R.id.episodeDetailName);
        TextView episodeDateTextView = (TextView) this.findViewById(R.id.episodeDetailReleaseDate);
        TextView episodeSynopsysTextView = (TextView) this.findViewById(R.id.episodeDetailSynopsys);
        TextView episodeSeasonAndNumberTextView = (TextView) this.findViewById(R.id.episodeDetailSeasonAndNumber);

        episodeNameView.setText(episode.getName());
        episodeDateTextView.setText(systemLocaleDateFormat.format(episode.getFirstAired()));
        episodeSynopsysTextView.setText(episode.getSynopsys());
        episodeSeasonAndNumberTextView.setText(episode.getFormatedSeasonAndNumberLongVersion());
    }
}
