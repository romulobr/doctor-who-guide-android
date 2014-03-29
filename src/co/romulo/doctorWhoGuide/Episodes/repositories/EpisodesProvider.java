package co.romulo.doctorWhoGuide.Episodes.repositories;

import co.romulo.doctorWhoGuide.Episodes.Models.Episode;
import co.romulo.doctorWhoGuide.persistence.InMemoryRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class EpisodesProvider {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
    Episode[] episodes;

    public EpisodesProvider() {
        try {
            episodes = new Episode[]{
                    new Episode(0, 1, 0, "Rose", "Rose Tyler is just an ordinary shop worker living an ordinary life in 21st century Britain. But that life is turned upside down when a strange man calling himself The Doctor drags her into an alien invasion attempt!", sdf.parse("17-03-2006")),
                    new Episode(1, 1, 1, "The End of the World", "Rose goes off on her first adventure with the Doctor who takes her 5 billion years into the future to view a cataclysmic event: the destruction of the Earth. They're on an orbiting space platform with a groups of invited guests who seem to travel from one cataclysmic event to another. There are uninvited guests as well in the form of spider-like mechanical robots that seem to multiply at will and are obviously bent on causing destruction. The spiders soon dispose of the Steward and gain control of the orbiting platform's mainframe. It doesn't take long for the Doctor ...", sdf.parse("17-03-2006")),
                    new Episode(2, 1, 2, "The Unquiet Dead", "The Doctor has great expectations for his latest adventure when he and Rose join forces with Charles Dickens to investigate a mysterious plague of zombies.", sdf.parse("24-03-2006")),
                    new Episode(3, 1, 3, "Aliens of London", "The Doctor returns Rose to her own time - well, sort of - but her family reunion is ruined when a spaceship crashes in the middle of London. What is the origin of the spaceship, and where has the Prime Minister gone in this time of crisis?", sdf.parse("31-03-2006")),
                    new Episode(4, 1, 4, "World War Three", "The fiendish Slitheen have been unmasked as the ones who crashed the spaceship into London as part of a ruse to trigger World War Three. But how can The Doctor save the planet when he's trapped inside a locked room?", sdf.parse("07-04-2006")),
                    new Episode(5, 1, 5, "Dalek", "The Doctor and Rose travel to the year 2012 and land in a museum of extra-terrestrial objects accumulated by the very wealthy Henry van Statten. He's an avid collector - the TARDIS lands on the museum's 53rd floor below ground level - but he's also using alien technology to develop new weapons from which he derives his large income. He's particularly proud of one device he's acquired but has not yet been able to make functional and to the Doctor's horror, it turns out to a very old and very dangerous enemy from the past.", sdf.parse("14-04-2006")),
                    new Episode(6, 1, 6, "The Long Game", "The Doctor and Rose arrive in the year 200,000 to see The Fourth Great and Bountiful Human Empire. But something has gone wrong - someone is holding back the development of mankind. Who could have done this? And why?", sdf.parse("21-04-2006")),
                    new Episode(7, 1, 7, "Father's Day", "All of her life, Rose's mother told how great a man her father Pete was. He was killed by a hit and run driver when Rose was just a baby and among her many regrets was that her father died alone, just lying on the street. Rose asks the Doctor to take her back to that day. Rather than just be with him when he dies, she actually saves him and later admits that this was her plan all along. She soon realizes that her parents' marriage was not exactly the golden relationship she had claimed it to be. Far worse however, is that by saving her father, Rose has created a tear ...", sdf.parse("28-04-2006")),
                    new Episode(8, 1, 8, "The Empty Child", "Rose and the Doctor find themselves in 1941 London when the TARDIS receives an emergency signal from another time-traveling vehicle. While the Doctor tries to determine where the object may have landed, Rose goes off in search of a child she can hear calling for help. When she gets herself into a precarious situation, she's rescued by the rather handsome RAF Captain Jack Harkness, who owns a time machine of his own. The Doctor meanwhile meets Nancy who has an interesting way of arranging meals for homeless children. They are also being chased by the child Rose heard ...", sdf.parse("05-05-2006")),
                    new Episode(9, 1, 9, "The Doctor Dances", "The Doctor, Rose and Captain Jack Harkness are still in the hospital with the gas mask-wearing mutants and are having some trouble finding a way out. The Doctor determines that the ambulance Captain Jack was using in his scam contained nano genes, similar to the one's he used to repair Rose's rope-burned hands. Only in this case, there are enough nano genes on the loose to \"repair\" an entire species and they have no idea what a human looks like in the first place. The future of the human race lies in Nancy accepting her true relationship to the little boy who is ...", sdf.parse("12-05-2006")),
                    new Episode(10, 1, 10, "Boom Town", "Stopping off in present-day Cardiff to recharge the TARDIS, The Doctor, Rose and Jack encounter an old foe in the midst of hatching a scheme that could destroy the entire planet.", sdf.parse("19-05-2006")),
                    new Episode(11, 1, 11, "Bad Wolf", "Jack, The Doctor and Rose have been kidnapped and forced to play terrible and deadly games. But what happens to the bodies of the murdered contestants? And what sinister plot do the games hide?", sdf.parse("02-06-2006")),
                    new Episode(12, 1, 12, "The Parting of the Ways", "The Dalek fleet is poised to destroy the Earth and only The Doctor, Rose, Jack and a band of television producers can stop them.", sdf.parse("09-06-2006")),
            };
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    List<Episode> getEpisodes() {
        return new InMemoryRepository<Episode>(Arrays.asList(episodes)).getAll();
    }
}