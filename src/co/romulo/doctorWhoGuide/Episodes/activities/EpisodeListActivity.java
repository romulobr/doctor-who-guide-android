package co.romulo.doctorWhoGuide.Episodes.activities;

import android.app.ListActivity;
import android.os.Bundle;
import co.romulo.doctorWhoGuide.Episodes.adapters.EpisodeArrayAdapter;
import dagger.ObjectGraph;

import javax.inject.Inject;

public class EpisodeListActivity extends ListActivity {

    @Inject EpisodeArrayAdapter episodeArrayAdapter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        inject();
        setListAdapter(episodeArrayAdapter);
    }

    private void inject() {
        if(episodeArrayAdapter == null) {
            ObjectGraph objectGraph = ObjectGraph.create(new EpisodeArrayAdapterProvider(this, 0));
            objectGraph.inject(this);
        }
    }
}