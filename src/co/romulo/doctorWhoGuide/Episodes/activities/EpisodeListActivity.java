package co.romulo.doctorWhoGuide.Episodes.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import co.romulo.doctorWhoGuide.Episodes.Models.Episode;
import co.romulo.doctorWhoGuide.Episodes.adapters.EpisodeArrayAdapter;
import co.romulo.doctorWhoGuide.R;
import dagger.ObjectGraph;

import javax.inject.Inject;

public class EpisodeListActivity extends ListActivity {

    @Inject EpisodeArrayAdapter episodeArrayAdapter;
    private Intent showEpisodeDetailsIntent;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        inject();
        setListAdapter(episodeArrayAdapter);
        setTitle("Episode List");
        showEpisodeDetailsIntent = new Intent(this, EpisodeDetailsActivity.class);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Episode episode = (Episode) episodeArrayAdapter.getItem(position);
        showEpisodeDetailsIntent.putExtra("episode", episode);
        View episodeNumberView = v.findViewById(R.id.episodeNumber);
        showEpisodeDetailsIntent.putExtra("background-color", episodeNumberView.getDrawingCacheBackgroundColor());
        startActivity(showEpisodeDetailsIntent);
    }

    private void inject() {
        if(episodeArrayAdapter == null) {
            ObjectGraph objectGraph = ObjectGraph.create(new EpisodeArrayAdapterProvider(this, 0));
            objectGraph.inject(this);
        }
    }
}