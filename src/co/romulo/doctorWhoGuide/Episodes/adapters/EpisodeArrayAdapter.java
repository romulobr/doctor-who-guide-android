package co.romulo.doctorWhoGuide.Episodes.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import co.romulo.doctorWhoGuide.Episodes.Models.Episode;
import co.romulo.doctorWhoGuide.R;

import javax.inject.Inject;
import java.util.List;

public class EpisodeArrayAdapter extends ArrayAdapter {

    @Inject List<Episode> episodes;

    @Inject public EpisodeArrayAdapter(Context context, int resource, List<Episode> episodes) {
        super(context, resource, episodes);
        this.episodes = episodes;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.episoderow, null);
        }

        Episode episode = episodes.get(position);
        TextView episodeNameView = (TextView) convertView.findViewById(R.id.episodeName);
        TextView episodeNumberView = (TextView) convertView.findViewById(R.id.episodeNumber);

        episodeNameView.setText(episode.getName());
        episodeNumberView.setText(episode.getFormatedSeasonAndNumber());

        return convertView;
    }
}
