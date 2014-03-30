package co.romulo.doctorWhoGuide.Episodes.Models;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EpisodeTest {
    @Test
    public void formatsEpisodeNumber() throws Exception {
        Episode episode = new Episode(1,1,1,null,null,null);
        assertThat(episode.getFormatedSeasonAndNumber(),is("1.1"));
    }
}
