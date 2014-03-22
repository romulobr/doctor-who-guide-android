package co.romulo.doctorWhoGuide.domain;

import co.romulo.doctorWhoGuide.persistence.InMemoryRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class InMemoryEpisodesTest {
    Collection<Episode> episodes = new ArrayList<Episode>();
    InMemoryRepository<Episode> episodeRepository = new InMemoryRepository<Episode>(episodes);

    @Before
    public void setUp() throws Exception {
        episodes.add(new Episode(1, "episode 1", "very nice and long description 1", new Date()));
        episodes.add(new Episode(2, "episode 2", "very nice and long description 2", new Date()));
        episodes.add(new Episode(3, "episode 3", "very nice and long description 3", new Date()));
        episodes.add(new Episode(4, "episode 4", "very nice and long description 4", new Date()));
    }

    @Test
    public void getsEpisodesById() throws Exception {
        Episode episode = episodeRepository.get(2);
        assertThat("episode 2", is(episode.getName()));
    }

    @Test
    public void getsAllEpisodes() throws Exception {
        Collection<Episode> all = episodeRepository.getAll();
        assertThat(all.containsAll(episodes), is(true));
    }
}
