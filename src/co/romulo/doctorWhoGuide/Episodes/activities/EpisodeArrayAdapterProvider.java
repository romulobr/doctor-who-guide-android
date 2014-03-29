package co.romulo.doctorWhoGuide.Episodes.activities;

import android.content.Context;
import co.romulo.doctorWhoGuide.Episodes.Models.Episode;
import co.romulo.doctorWhoGuide.Episodes.adapters.EpisodeArrayAdapter;
import dagger.Module;
import dagger.Provides;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Module(injects = EpisodeListActivity.class)
public class EpisodeArrayAdapterProvider {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Episode[] episodes;
    private Context context;
    private int resource;


    public EpisodeArrayAdapterProvider(Context context, int resource) {
        this.context = context;
        this.resource = resource;
        try {
            episodes = new Episode[]{
                    new Episode(1, 1, 1, "Rose", "Rose Tyler is just an ordinary shop worker living an ordinary life in 21st century Britain. But that life is turned upside down when a strange man calling himself The Doctor drags her into an alien invasion attempt!", sdf.parse("17-03-2006")),
                    new Episode(2, 1, 2, "The End of the World", "Rose goes off on her first adventure with the Doctor who takes her 5 billion years into the future to view a cataclysmic event: the destruction of the Earth. They're on an orbiting space platform with a groups of invited guests who seem to travel from one cataclysmic event to another. There are uninvited guests as well in the form of spider-like mechanical robots that seem to multiply at will and are obviously bent on causing destruction. The spiders soon dispose of the Steward and gain control of the orbiting platform's mainframe. It doesn't take long for the Doctor ...", sdf.parse("17-03-2006")),
                    new Episode(3, 1, 3, "The Unquiet Dead", "The Doctor has great expectations for his latest adventure when he and Rose join forces with Charles Dickens to investigate a mysterious plague of zombies.", sdf.parse("24-03-2006")),
                    new Episode(4, 1, 4, "Aliens of London", "The Doctor returns Rose to her own time - well, sort of - but her family reunion is ruined when a spaceship crashes in the middle of London. What is the origin of the spaceship, and where has the Prime Minister gone in this time of crisis?", sdf.parse("31-03-2006")),
                    new Episode(5, 1, 5, "World War Three", "The fiendish Slitheen have been unmasked as the ones who crashed the spaceship into London as part of a ruse to trigger World War Three. But how can The Doctor save the planet when he's trapped inside a locked room?", sdf.parse("07-04-2006")),
                    new Episode(6, 1, 6, "Dalek", "The Doctor and Rose travel to the year 2012 and land in a museum of extra-terrestrial objects accumulated by the very wealthy Henry van Statten. He's an avid collector - the TARDIS lands on the museum's 53rd floor below ground level - but he's also using alien technology to develop new weapons from which he derives his large income. He's particularly proud of one device he's acquired but has not yet been able to make functional and to the Doctor's horror, it turns out to a very old and very dangerous enemy from the past.", sdf.parse("14-04-2006")),
                    new Episode(7, 1, 7, "The Long Game", "The Doctor and Rose arrive in the year 200,000 to see The Fourth Great and Bountiful Human Empire. But something has gone wrong - someone is holding back the development of mankind. Who could have done this? And why?", sdf.parse("21-04-2006")),
                    new Episode(8, 1, 8, "Father's Day", "All of her life, Rose's mother told how great a man her father Pete was. He was killed by a hit and run driver when Rose was just a baby and among her many regrets was that her father died alone, just lying on the street. Rose asks the Doctor to take her back to that day. Rather than just be with him when he dies, she actually saves him and later admits that this was her plan all along. She soon realizes that her parents' marriage was not exactly the golden relationship she had claimed it to be. Far worse however, is that by saving her father, Rose has created a tear ...", sdf.parse("28-04-2006")),
                    new Episode(9, 1, 9, "The Empty Child", "Rose and the Doctor find themselves in 1941 London when the TARDIS receives an emergency signal from another time-traveling vehicle. While the Doctor tries to determine where the object may have landed, Rose goes off in search of a child she can hear calling for help. When she gets herself into a precarious situation, she's rescued by the rather handsome RAF Captain Jack Harkness, who owns a time machine of his own. The Doctor meanwhile meets Nancy who has an interesting way of arranging meals for homeless children. They are also being chased by the child Rose heard ...", sdf.parse("05-05-2006")),
                    new Episode(10, 1, 10, "The Doctor Dances", "The Doctor, Rose and Captain Jack Harkness are still in the hospital with the gas mask-wearing mutants and are having some trouble finding a way out. The Doctor determines that the ambulance Captain Jack was using in his scam contained nano genes, similar to the one's he used to repair Rose's rope-burned hands. Only in this case, there are enough nano genes on the loose to \"repair\" an entire species and they have no idea what a human looks like in the first place. The future of the human race lies in Nancy accepting her true relationship to the little boy who is ...", sdf.parse("12-05-2006")),
                    new Episode(11, 1, 11, "Boom Town", "Stopping off in present-day Cardiff to recharge the TARDIS, The Doctor, Rose and Jack encounter an old foe in the midst of hatching a scheme that could destroy the entire planet.", sdf.parse("19-05-2006")),
                    new Episode(12, 1, 12, "Bad Wolf", "Jack, The Doctor and Rose have been kidnapped and forced to play terrible and deadly games. But what happens to the bodies of the murdered contestants? And what sinister plot do the games hide?", sdf.parse("02-06-2006")),
                    new Episode(13, 1, 13, "The Parting of the Ways", "The Dalek fleet is poised to destroy the Earth and only The Doctor, Rose, Jack and a band of television producers can stop them.", sdf.parse("09-06-2006")),

                    new Episode(14, 2, 1, "The Christmas Invasion", "It's Christmas Eve, but this is to be a far from silent night - the cruel Sycorax have come to Earth to enslave mankind and, as ever, only The Doctor can stop them. Unfortunately, he's lying in a coma in Jackie's home...", sdf.parse("29-09-2006")),
                    new Episode(15, 2, 2, "New Earth", "As Rose Tyler embarks upon her first big TARDIS adventure with the newly-regenerated Doctor, they discover a sinister hospital run by strange cat people and run in to two old acquaintances, The Face of Boe and Cassandra.", sdf.parse("29-09-2006")),
                    new Episode(16, 2, 3, "Tooth and Claw", "The Doctor and Rose are transported to 19th Century Scotland, where they meet Queen Victoria, and try to protect her from a ravenous werewolf and a band of assassinating warrior-monks", sdf.parse("06-10-2006")),
                    new Episode(17, 2, 4, "School Reunion", "The Krillitanes - aliens with a mix-and-match physiology - are trying to crack the 'God-Maker', a paradigm to give them ultimate power. They are using children as a computer, and only the Doctor and Rose, re-united with Sarah Jane Smith and K9 can prevent them from becoming masters of time and space.", sdf.parse("13-10-2006")),
                    new Episode(18, 2, 5, "The Girl in the Fireplace", "The Doctor, Mickey and Rose land on a spaceship in the 51st century only to find 18th century Versailles on board, the time of Madame De Pompadour! To find out what's going on the Doctor must enter Versailles and save Madame De Popmpadour but it turns into an emotional roller coaster for the Doctor.", sdf.parse("20-10-2006")),
                    new Episode(19, 2, 6, "Rise of the Cybermen", "Upon landing on an alternate version of the Earth, The Doctor, Rose and Mickey learn that Peter Tyler is apparently alive and well. Lurking in the shadows are creatures made to destroy - one of The Doctor's greatest fears have come true...the Cybermen are reborn.", sdf.parse("27-10-2006")),
                    new Episode(20, 2, 7, "The Age of Steel", "Lumic's army of cybermen is on the rise, and with more and more people being converted by the hour, time is of the essence. The gang are reduced to fugitives as they roam the streets of parallel London trying to rid the earth of cybermen.", sdf.parse("03-11-2006")),
                    new Episode(21, 2, 8, "The Idiot's Lantern", "In 1950s London, the police are hunting down strange, mute creatures. The people of Britain gather around their new-fangled \"tele-vision\" sets to celebrate the new Queen's coronation - but is something affecting the signal?", sdf.parse("10-11-2006")),
                    new Episode(22, 2, 9, "The Impossible Planet", "The TARDIS lands on an alien planet shrouded in a darkness that even the Doctor can't figure out. And what is lurking at the bottom of The Satan Pit?", sdf.parse("17-11-2006")),
                    new Episode(23, 2, 10, "The Satan Pit", "As Rose battles the murderous Ood, the Doctor finds his every belief being challenged to the core, as the Pit beckons. With the planet threatening to fall into the black hole, the Doctor must make the ultimate sacrifice.", sdf.parse("01-12-2006")),
                    new Episode(24, 2, 11, "Love & Monsters", "A run in with the Doctor at a young age leads Elton to a group who's studying him, they become friends and have a laugh until Victor Kennedy arrives. Suddenly everything becomes more serious then people start disappearing from the group. Can the Doctor save Elton and explain his past before he's absorbed by the Absorbaloff", sdf.parse("08-12-2006")),
                    new Episode(25, 2, 12, "Fear Her", "The Doctor and Rose travel to London in 2012 to see the Olympics - only to find that children are mysteriously disappearing before peoples very eyes. The answer seems to lie with a young girl named Chloe and her strange drawings - but is there something more sinister behind the disappearances?", sdf.parse("15-12-2006")),
                    new Episode(26, 2, 13, "Army of Ghosts", "As the ghosts of loved ones appear, the whole world celebrates. But as the Doctor investigates he believes that there is a more sinister motive behind their appearence. And deep within the Torchwood tower, a mysterious sphere containing the greatest enemies of the Doctor is opened...", sdf.parse("22-11-2006")),
                    new Episode(27, 2, 14, "Doomsday", "Earth becomes the battlefield for the greatest and deadliest war of all time, as the Daleks and the Cybermen clash with the whole universe at stake. The Doctor and Rose, reunited with old friends and Cybermen experts Mickey and Jake, race to find a way to bring the war to an end before it brings about the destruction of the whole of space and time. But the Doctor soon faces an even bigger dilemma - could ending the war mean the death of Rose?", sdf.parse("22-12-2006")),


            };
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Provides
    EpisodeArrayAdapter provideEpisodeArrayAdapter() {
        return new EpisodeArrayAdapter(context, resource, Arrays.asList(episodes));
    }

    ;
}