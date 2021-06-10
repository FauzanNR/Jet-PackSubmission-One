package com.app.jetpacksubmissionone.data

import com.app.jetpacksubmissionone.model.Film
import java.util.*


object Data {
    private var dataMovie = arrayOf(
        arrayOf(
            "0",
            "Avengers: Infinity War",
            "2018",
            "8.3",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aB5X0TvSbuLew3HheiueMFYsdnx.jpg"
        ),
        arrayOf(
            "1",
            "Spider-Man: Into the Spider-Verse",
            "2018",
            "8.4 ",
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension. ",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg"
        ),
        arrayOf(
            "2",
            "Venom",
            "2018",
            "6.6",
            "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg"
        ),
        arrayOf(
            "3",
            "Deadpool 2",
            "2018",
            "7.5",
            "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg"
        ),
        arrayOf(
            "4",
            "Bohemian Rhapsody",
            "2018",
            "8.0",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "https://image.tmdb.org/t/p/w1280/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg"
        ),
        arrayOf(
            "5",
            "Black Panther",
            "2018",
            "7.4",
            "King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war.",
            "https://image.tmdb.org/t/p/w1280/uxzzxijgPIY7slzFvMotPv8wjKA.jpg"
        ),
        arrayOf(
            "6",
            "Forest Gump",
            "1994",
            "8.4",
            "A man with a low IQ has accomplished great things in his life and been present during significant historic events—in each case, far exceeding what anyone imagined he could do. But despite all he has achieved, his one true love eludes him.",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/kbHlxmkVKDQrBXrKkh0nuIr4rSZ.jpg"
        ),
        arrayOf(
            "7",
            "Catch Me if You Can",
            "2002",
            "7.9",
            "A true story about Frank Abagnale Jr. who, before his 19th birthday, successfully conned millions of dollars worth of checks as a Pan Am pilot, doctor, and legal prosecutor. An FBI agent makes it his mission to put him behind bars. But Frank not only eludes capture, he revels in the pursuit.",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ctjEj2xM32OvBXCq8zAdK3ZrsAj.jpg"
        ),
        arrayOf(
            "8",
            "Jurassic World: Fallen Kingdom",
            "2018",
            "6.5",
            "Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7dAh80ydoWvUaBE8uFYkp9WsoSC.jpg"
        ),
        arrayOf(
            "9",
            "Spider-Man: Far from Home",
            "2019",
            "7.6",
            "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lcq8dVxeeOqHvvgcte707K0KVx5.jpg"
        ),
        arrayOf(
            "10",
            "One Piece: Stampede",
            "2019",
            "7.3",
            "One Piece: Stampede is a stand-alone film that celebrates the anime's 20th Anniversary and takes place outside the canon of the \"One Piece\" TV series. Monkey D. Luffy and his Straw Hat pirate crew are invited to a massive Pirate Festival that brings many of the most iconic characters from throughout the franchise to participate in competition with the Straw Hats to find Roger's treasure. It also pits the Straw Hats against a new enemy named Bullet, a former member of Roger's crew.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4E2lyUGLEr3yH4q6kJxPkQUhX7n.jpg"
        )
    )

    private var dataTv = arrayOf(
        arrayOf(
            "0",
            "Rick and Morty",
            "2018",
            "8.6",
            "Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/nsM4tkAG1LoClPmA8Rprgxe4546.jpg"
        ),
        arrayOf(
            "1",
            "The Mandalorian",
            "2019",
            "7.7",
            "Set after the fall of the Empire and before the emergence of the First Order, we follow the travails of a lone gunfighter in the outer reaches of the galaxy far from the authority of the New Republic.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lMCG9M9wxBSK7iHMvm1VfdCbWJC.jpg"
        ),
        arrayOf(
            "2",
            "The Simpsons ",
            "1989",
            "7.2",
            "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg"
        ),
        arrayOf(
            "3",
            "Marvel's Agents of S.H.I.E.L.D.",
            "2013",
            "6.8",
            "Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/cXiETfFK1BTLest5fhTLfDLRdL6.jpg"
        ),
        arrayOf(
            "4",
            "Breaking Bad ",
            "2008",
            "8.4",
            "When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime.",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ggFHVNu6YYI5L9pCfOacjizRGt.jpg"
        ),
        arrayOf(
            "5",
            "Hunter x Hunter",
            "2011",
            "8.2",
            "Twelve-year-old Gon Freecss one day discovers that the father he had always been told was dead was alive and well. His Father, Ging, is a Hunter—a member of society's elite with a license to go anywhere or do almost anything. Gon, determined to follow in his father's footsteps, decides to take the Hunter Examination and eventually find his father to prove himself as a Hunter in his own right. But on the way, he learns that there is more to becoming a Hunter than previously thought, and the challenges that he must face are considered the toughest in the world.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/yWBcBIO9OrF3E85C5Arols6QNnG.jpg"
        ),
        arrayOf(
            "6",
            "Naruto Shippūden",
            "2007",
            "7.6",
            "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/y600umqCiIlfPo4kJM6gnzbD3EE.jpg"
        ),
        arrayOf(
            "7",
            "Mr. Robot",
            "2015",
            "7.9",
            "A contemporary and culturally resonant drama about a young programmer, Elliot, who suffers from a debilitating anti-social disorder and decides that he can only connect to people by hacking them. He wields his skills as a weapon to protect the people that he cares about. Elliot will find himself in the intersection between a cybersecurity firm he works for and the underworld organizations that are recruiting him to bring down corporate America.",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oKIBhzZzDX07SoE2bOLhq2EE8rf.jpg"
        ),
        arrayOf(
            "8",
            "JoJo's Bizarre Adventure",
            "2012",
            "7.4",
            "Beginning its tale in 19th century England, young aristocrat Jonathan Joestar finds himself locked in bitter rivalry with Dio Brando, a low-born boy who Jonathan’s father took under his wing after the death of Dio’s father. Discontent with his station in life, Dio’s fathomless drive to reign over all eventually leads him to seek the supernatural powers of an ancient Aztec stone mask in the Joestars' possession – an artifact that will forever change the destiny of Dio and Jonathan for generations to come. Fifty years later, in 1938 New York City, Jonathan’s grandson Joseph Joestar must take up his grandfather’s mission and master the abilities necessary to destroy the stone mask and its immensely powerful creators, the Pillar men, who threaten humanity's very existence.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ogAWwbh3frWtiTyyXrZaVFtqCgp.jpg"
        ),
        arrayOf(
            "9",
            "For All Mankind",
            "2019",
            "7.4",
            "Explore an aspirational world where NASA and the space program remained a priority and a focal point of our hopes and dreams as told through the lives of NASA astronauts, engineers, and their families.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/8RH9nc4UHQIRSIrTnyEqAVGdpvk.jpg"
        ),
        arrayOf(
            "10",
            "Adventure Time",
            "2010",
            "7.5",
            "They’re not righteous, they’re wrongteous! Hook up with Finn and Jake as they travel the Land of Ooo searching for adventure. But remember, adventure isn’t always easy. Sometimes you’ve got to battle fire gnomes that torture old ladies, save a smelly hot dog princess from the Ice King, and thaw out a bunch of frozen businessmen. What the cabbage?!",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qk3eQ8jW4opJ48gFWYUXWaMT4l.jpg"
        )
    )

    fun getDataMovie(): ArrayList<Film> {
        val list: ArrayList<Film> = ArrayList<Film>()
        for (data in dataMovie) {
            val movie = Film(
                data[0],
                data[1],
                data[2],
                data[3],
                data[4],
                data[5]
            )
            list.add(movie)
        }
        return list
    }

    fun getDataTv(): ArrayList<Film> {
        val list: ArrayList<Film> = ArrayList<Film>()
        for (data in dataTv) {
            val tv = Film(
                data[0],
                data[1],
                data[2],
                data[3],
                data[4],
                data[5]
            )
            list.add(tv)
        }
        return list
    }
}
