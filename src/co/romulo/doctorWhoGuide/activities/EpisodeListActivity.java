package co.romulo.doctorWhoGuide.activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.*;
import co.romulo.doctorWhoGuide.domain.Episode;
import co.romulo.doctorWhoGuide.domain.Episodes;
import co.romulo.doctorWhoGuide.persistence.InMemoryRepository;
import dagger.ObjectGraph;

import javax.inject.Inject;
import java.util.Collection;

public class EpisodeListActivity extends ListActivity {

    @Inject Collection<Episode> episodes;

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        ObjectGraph objectGraph = ObjectGraph.create(Episodes.class);
        objectGraph.inject(this);

        Collection<Episode> all = episodes;
        Episode array[] = (Episode[]) all.toArray();
        ArrayAdapter<Episode> adapter = new ArrayAdapter<Episode>(this,
                android.R.layout.simple_list_item_1, array);
        setListAdapter(adapter);
    }
}