# ABC Movies
 Web application to simulate buying tickets at a movie theater

## Build info
### Java Files
 #### beans package
 These are the JSF CDI beans that are used in the project
		InputsBean.java
		This bean is session scoped and is used to store the inputs from the user into the database

  MainPageBean.java
		This bean is request scoped and is used to display the list of theaters

  ShowTheaterBean.java
		This bean is session scoped and is the main bean that is used throughout the project. It shows the theaters' and movies' information and it validates the inputs

 #### ejb package
 This package contains the Enterprise JavaBeans for the project
		movieEJB.java
		This is the Stateless ejb that calls an EntityManager for retrieving information about the project database

 #### entity package
 This package contains the entity classes for using JPA
		Inputs.java
		This entity is used for the persisting the user's inputs into the database
 
  Movie.java
		This entity is used for persisting the movie information into the database

  Theater.java
		This entity is used for persisting the theater information into the database

  MovieTimes.java and MovieTimesPK.java
		These entity classes are used in conjunction to persist the table that connects Movies and Theaters to each other


### Web Files
#### index.xhtml
 This is the main/home page. The posters of current movies are shown at the bottom with a label. A search bar is given at the top right for users to input zip code. Pressing "Find zipcode" will take them to the next page.

#### ShowTheater.xhtml
 This is the next page after index.xhtml. This displays a list of theaters that share the zipcode given by the user on the previous page. The user will click "Show" for one of the theaters and press "Show Movies" to go to the next page.

#### Movies.xhtml
 Page after ShowTheater.xhtml. Displays movie title and description, along with a button to show movie times. Clicking this button will take the user to the next page.

#### MovieTimes.xhtml
 Page after Movies.xhtml. Displays show times for the movie at the theater and zipcode the user selected earlier. Clicking select will take the user to the next page.

#### PurchaseP1.xhtml
 Page after MovieTimes.xhtml. Asks user to input number of tickets to purchase. Click confirm tickets to go to the next page.

#### PurchaseP2.xhtml
 Page after PurchaseP1.xhtml. Asks user to input credit card number. Also displays price of tickets.Click confirm purchase to go to the next page. 

#### Confirmation.xhtml
 Page after PurchaseP2.xhtml. Displays movie name, theater, time, and price to the user. Gives options to go back to main page or theater selection.

## Screenshots

### Landing Page
![image](https://github.com/nasif-mahmood/ABC-Movies/blob/main/part%201.png)

### Selecting a theater after entering a zip code
![image](https://github.com/nasif-mahmood/ABC-Movies/blob/main/part%202.1.png)
![image](https://github.com/nasif-mahmood/ABC-Movies/blob/main/part%202.2.png)

### Showcasing movies at specific theater
![image](https://github.com/nasif-mahmood/ABC-Movies/blob/main/part%203.png)

### Showtimes for chosen movie
![image](https://github.com/nasif-mahmood/ABC-Movies/blob/main/part%204.png)

### Purchasing tickets
![image](https://github.com/nasif-mahmood/ABC-Movies/blob/main/part%205.png)
![image](https://github.com/nasif-mahmood/ABC-Movies/blob/main/part%206.png)
![image](https://github.com/nasif-mahmood/ABC-Movies/blob/main/part%206.png)
