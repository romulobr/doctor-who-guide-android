package co.romulo.doctorWhoGuide.Episodes.repositories;

import co.romulo.doctorWhoGuide.Episodes.Models.Episode;
import co.romulo.doctorWhoGuide.persistence.InMemoryRepository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class EpisodesProvider {
    Episode episodes[] = {new Episode(1, 1, 1, "episode 1", "very nice and long description 1", new Date() ),
            new Episode(2, 1, 2, "episode 2", "very nice and long description 2", new Date()),
            new Episode(3, 1, 3, "episode 3", "very nice and long description 3", new Date()),
            new Episode(4, 1, 4, "episode 4", "very nice and long description 4", new Date()),
            new Episode(5, 1, 5, "episode 5", "very nice and long description 5", new Date()),
            new Episode(6, 1, 6, "episode 2", "very nice and long description 2", new Date()),
            new Episode(7, 1, 7, "episode 3", "very nice and long description 3", new Date()),
            new Episode(8, 1, 8, "episode 4", "very nice and long description 4", new Date()),
            new Episode(9, 1, 9, "episode 5", "very nice and long description 5", new Date()),
            new Episode(10, 1, 10, "episode 2", "very nice and long description 2", new Date()),
    };

    List<Episode> getEpisodes() {
        return new InMemoryRepository<Episode>(Arrays.asList(episodes)).getAll();
    }
}