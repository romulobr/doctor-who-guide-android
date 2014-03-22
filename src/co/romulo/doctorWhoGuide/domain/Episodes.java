package co.romulo.doctorWhoGuide.domain;

import co.romulo.doctorWhoGuide.activities.EpisodeListActivity;
import co.romulo.doctorWhoGuide.persistence.InMemoryRepository;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
import java.util.Arrays;
import java.util.Date;

@Module(
        injects = EpisodeListActivity.class
)
public class Episodes {
    Episode episodes[] = {new Episode(1, "episode 1", "very nice and long description 1", new Date()),
            new Episode(2, "episode 2", "very nice and long description 2", new Date()),
            new Episode(3, "episode 3", "very nice and long description 3", new Date()),
            new Episode(4, "episode 4", "very nice and long description 4", new Date()),
            new Episode(5, "episode 5", "very nice and long description 5", new Date()),
            new Episode(6, "episode 2", "very nice and long description 2", new Date()),
            new Episode(7, "episode 3", "very nice and long description 3", new Date()),
            new Episode(8, "episode 4", "very nice and long description 4", new Date()),
            new Episode(9, "episode 5", "very nice and long description 5", new Date()),
            new Episode(10, "episode 2", "very nice and long description 2", new Date()),
    };

    @Provides java.util.Collection<Episode> getEpisodes() {
        return new InMemoryRepository<Episode>(Arrays.asList(episodes)).getAll();
    }
}
