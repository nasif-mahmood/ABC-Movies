/*
    Movie Database Population Script
*/


/*    drop statements

    drop table Theater;
    drop table Movie;
    drop table MovieTimes;
*/

/*create database MovieDB;*/

create table Theater (
    TheaterID char(4) not null,
    TheaterName varchar(255) not null,
    Zipcode int,
    Address varchar(255) not null,
    constraint pkTheater primary key (TheaterID)
);

create table Movie (
    MovieID char(4) not null,
    MovieName varchar(255),
    Description varchar(1000),
    Poster varchar(255),
    constraint pkMovie primary key (MovieID)
);

create table MovieTimes (
    TheaterID char(4),
    MovieID char(4),
    Showtime varchar(255)
);

create table Inputs (
	InputID int,
	Zipcode int,
	numtickets int,
	price varchar(4)
);

/* at least 3 options for each choice, 9 theaters, 3 per zipcode*/

/* 75044 */
insert into Theater values (
    '0000', 'STRIKE + REEL LUXURY DINE-IN AND XD', 75044, '5902 N President George Bush Hwy, Garland, TX');
insert into Theater values (
    '0001', 'AMC FIREWHEEL 18', 75044, '100 Coneflower Dr, Garland, TX');
insert into Theater values (
    '0002', 'B&B THEATRES WYLIE 12 WITH MARQUEE SUITES & GS', 75044, '711 Woodbridge Pkwy, Wylie, TX');  

/* 75243 */
insert into Theater values (
    '0003', 'STUDIO MOVIE GRILL-DALLAS', 75243, '11170 N Central Expy, Dallas, TX');
insert into Theater values (
    '0004', 'STUDIO MOVIE GRILL SPRING VALLEY', 75243, '13933 N Central Expy, Dallas, TX');
insert into Theater values (
    '0005', 'ALAMO DRAFTHOUSE DALLAS', 75243, '6770 Abrams Rd, Dallas, TX');  

/* 75225 */
insert into Theater values (
    '0006', 'LANDMARK INWOOD THEATRE', 75225, '5458 W Lovers Ln, Dallas, TX');
insert into Theater values (
    '0007', 'AMC NORTHPARK 15', 75225, '8687 N Central Expy #3000, Dallas, TX');
insert into Theater values (
    '0008', 'ANGELIKA FILM CENTER & CAFE', 75225, ' Angelika Dallas, 5321 E Mockingbird Ln #230, Dallas, TX');  


insert into Movie values (
    '0000', 'THOR: LOVE AND THUNDER (2022)', 'Thor embarks on a journey unlike anything he''s ever faced -- a quest for inner peace. However, his retirement gets interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods. To combat the threat, Thor enlists the help of King Valkyrie, Korg and ex-girlfriend Jane Foster, who -- to his surprise -- inexplicably wields his magical hammer. Together, they set out on a harrowing cosmic adventure to uncover the mystery of the God Butcher''s vengeance.', 'Thor.jpg');
insert into Movie values (
    '0001', 'MINIONS: THE RISE OF GRU (2022)', 'Long before he becomes the master of evil, Gru (Oscar® nominee Steve Carell) is just a 12-year-old boy in 1970s suburbia, plotting to take over the world from his basement. It''s not going particularly well. When Gru crosses paths with the Minions, including Kevin, Stuart, Bob, and Otto—a new Minion sporting braces and a desperate need to please—this unexpected family joins forces. Together, they build their first lair, design their first weapons, and strive to execute their first missions.', 'minions.jpg');
insert into Movie values (
    '0002', 'LIGHTYEAR (2022)', 'A sci-fi action adventure and the definitive origin story of Buzz Lightyear, the hero who inspired the toy, “Lightyear” follows the legendary Space Ranger after he''s marooned on a hostile planet 4.2 million light-years from Earth alongside his commander and their crew. As Buzz tries to find a way back home through space and time, he''s joined by a group of ambitious recruits and his charming robot companion cat, Sox. Complicating matters and threatening the mission is the arrival of Zurg, an imposing presence with an army of ruthless robots and a mysterious agenda.', 'lightyear.jpg');
insert into Movie values (
    '0003', 'NOPE (2022)', 'Oscar® winner Jordan Peele disrupted and redefined modern horror with Get Out and then Us. Now, he reimagines the summer movie with a new pop nightmare: the expansive horror epic, Nope.', 'nope.jpg');
insert into Movie values (
    '0004', 'DOCTOR STRANGE IN THE MULTIVERSE OF MADNESS (2022)', 'In Marvel Studios'' “Doctor Strange in the Multiverse of Madness,” the MCU unlocks the Multiverse and pushes its boundaries further than ever before. Journey into the unknown with Doctor Strange, who, with the help of mystical allies both old and new, traverses the mind-bending and dangerous alternate realities of the Multiverse to confront a mysterious new adversary.', 'doctor strange.jpg');
insert into Movie values (
    '0005', 'SONIC THE HEDGEHOG 2 (2022)', 'The world''s favorite blue hedgehog is back for a next-level adventure in SONIC THE HEDGEHOG 2. After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy civilizations. Sonic teams up with his own sidekick, Tails, and together they embark on a globe-trotting journey to find the emerald before it falls into the wrong hands. From the filmmakers behind The Fast and the Furious and Deadpool, SONIC THE HEDGEHOG 2 stars James Marsden, Ben Schwartz as the voice of Sonic, Tika Sumpter, Natasha Rothwell, Adam Pally, Lee Majdoub and Jim Carrey returning, alongside new additions Shemar Moore, with Idris Elba as the voice of Knuckles and Colleen O''Shaughnessey as the voice of Tails.', 'sonic.jpg');

/* STRIKE + REEL LUXURY DINE-IN AND XD */
insert into MovieTimes values (
    '0000', '0000', '5:30pm');
insert into MovieTimes values (
    '0000', '0000', '7:30pm');
insert into MovieTimes values (
    '0000', '0000', '10:30pm');
insert into MovieTimes values (
    '0000', '0002', '10:30am');
insert into MovieTimes values (
    '0000', '0002', '12:30pm');
insert into MovieTimes values (
    '0000', '0002', '2:30pm');
insert into MovieTimes values (
    '0000', '0005', '4:30pm');
insert into MovieTimes values (
    '0000', '0005', '6:30pm');
insert into MovieTimes values (
    '0000', '0005', '8:30pm');

/* AMC FIREWHEEL 18 */
insert into MovieTimes values (
    '0001', '0002', '9:30am');
insert into MovieTimes values (
    '0001', '0002', '11:30am');
insert into MovieTimes values (
    '0001', '0002', '1:30pm');
insert into MovieTimes values (
    '0001', '0003', '8:00am');
insert into MovieTimes values (
    '0001', '0003', '10:00am');
insert into MovieTimes values (
    '0001', '0003', '12:00pm');
insert into MovieTimes values (
    '0001', '0004', '4:00pm,');
insert into MovieTimes values (
    '0001', '0004', '6:00pm');
insert into MovieTimes values (
    '0001', '0004', '8:00pm');

/* B&B THEATRES WYLIE 12 WITH MARQUEE SUITES & GS */
insert into MovieTimes values (
    '0002', '0000', '9:45am');
insert into MovieTimes values (
    '0002', '0000', '10:45am');
insert into MovieTimes values (
    '0002', '0000', '11:45am');
insert into MovieTimes values (
    '0002', '0001', '10:45am');
insert into MovieTimes values (
    '0002', '0001', '12:30pm');
insert into MovieTimes values (
    '0002', '0001', '5:30pm');
insert into MovieTimes values (
    '0002', '0004', '7:30pm');
insert into MovieTimes values (
    '0002', '0004', '8:30pm');
insert into MovieTimes values (
    '0002', '0004', '11:00pm');

/* STUDIO MOVIE GRILL-DALLAS */
insert into MovieTimes values (
    '0003', '0000', '9:15am');
insert into MovieTimes values (
    '0003', '0000', '9:30:am');
insert into MovieTimes values (
    '0003', '0000', '9:45am');
insert into MovieTimes values (
    '0003', '0003', '9:30am');
insert into MovieTimes values (
    '0003', '0003', '9:45am');
insert into MovieTimes values (
    '0003', '0003', '10:00am');
insert into MovieTimes values (
    '0003', '0005', '9:45am');
insert into MovieTimes values (
    '0003', '0005', '10:00am');
insert into MovieTimes values (
    '0003', '0005', '10:15am');

/* STUDIO MOVIE GRILL SPRING VALLEY */
insert into MovieTimes values (
    '0004', '0002', '2:30pm');
insert into MovieTimes values (
    '0004', '0002', '4:00pm');
insert into MovieTimes values (
    '0004', '0002', '5:00pm');
insert into MovieTimes values (
    '0004', '0004', '2:30pm');
insert into MovieTimes values (
    '0004', '0004', '4:00pm');
insert into MovieTimes values (
    '0004', '0004', '5:00pm');
insert into MovieTimes values (
    '0004', '0005', '5:00pm');
insert into MovieTimes values (
    '0004', '0005', '5:15pm');
insert into MovieTimes values (
    '0004', '0005', '5:20pm');

/* ALAMO DRAFTHOUSE DALLAS */
insert into MovieTimes values (
    '0005', '0001', '3:30pm');
insert into MovieTimes values (
    '0005', '0001', '4:30pm');
insert into MovieTimes values (
    '0005', '0001', '8:30pm');
insert into MovieTimes values (
    '0005', '0003', '5:30pm');
insert into MovieTimes values (
    '0005', '0003', '6:30pm');
insert into MovieTimes values (
    '0005', '0003', '6:45pm');
insert into MovieTimes values (
    '0005', '0004', '8:15pm');
insert into MovieTimes values (
    '0005', '0004', '8:30pm');
insert into MovieTimes values (
    '0005', '0004', '8:45pm');

/* LANDMARK INWOOD THEATRE */
insert into MovieTimes values (
    '0006', '0000', '7:00pm');
insert into MovieTimes values (
    '0006', '0000', '7:05pm');
insert into MovieTimes values (
    '0006', '0000', '7:10pm');
insert into MovieTimes values (
    '0006', '0004', '3:05pm');
insert into MovieTimes values (
    '0006', '0004', '4:05pm');
insert into MovieTimes values (
    '0006', '0004', '4:25pm');
insert into MovieTimes values (
    '0006', '0005', '6:00pm');
insert into MovieTimes values (
    '0006', '0005', '6:30pm');
insert into MovieTimes values (
    '0006', '0005', '6:45pm');

/* AMC NORTHPARK 15 */
insert into MovieTimes values (
    '0007', '0001', '9:00am');
insert into MovieTimes values (
    '0007', '0001', '9:15am');
insert into MovieTimes values (
    '0007', '0001', '5:30pm');
insert into MovieTimes values (
    '0007', '0002', '9:00am');
insert into MovieTimes values (
    '0007', '0002', '10:00am');
insert into MovieTimes values (
    '0007', '0002', '6:00pm');
insert into MovieTimes values (
    '0007', '0003', '11:00pm');
insert into MovieTimes values (
    '0007', '0003', '12:00am');
insert into MovieTimes values (
    '0007', '0003', '1:00am');

/* ANGELIKA FILM CENTER & CAFE */
insert into MovieTimes values (
    '0008', '0003', '5:30pm');
insert into MovieTimes values (
    '0008', '0003', '5:45pm');
insert into MovieTimes values (
    '0008', '0003', '6:00pm');
insert into MovieTimes values (
    '0008', '0004', '5:15pm');
insert into MovieTimes values (
    '0008', '0004', '6:15pm');
insert into MovieTimes values (
    '0008', '0004', '7:15pm');
insert into MovieTimes values (
    '0008', '0005', '8:00am');
insert into MovieTimes values (
    '0008', '0005', '8:00pm');
insert into MovieTimes values (
    '0008', '0005', '10:00pm');



/* show movie times for specific movie from theater
select MovieTimes.ShowTime
from MovieTimes, Movie, Theater
where Movie.MovieID = '0000' and Theater.TheaterID = '0000' and Movie.MovieID=MovieTimes.MovieID and Theater.TheaterID=MovieTimes.TheaterID;
*/