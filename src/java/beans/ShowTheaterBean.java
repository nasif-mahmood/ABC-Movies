/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.movieEJB;
import entity.Movie;
import entity.MovieTimes;
import entity.Theater;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

/**
 *
 * @author nasifmahmood
 */
@Named(value = "showTheaterBean")
@SessionScoped
public class ShowTheaterBean implements Serializable {

    @EJB
    private movieEJB movieEJB;
    private Theater theater;
    private Movie movie;
    private MovieTimes movietimes;

    /**
     * Creates a new instance of ShowMovieBean
     */
    public ShowTheaterBean() {
    }

    public movieEJB getMovieEJB() {
        return movieEJB;
    }

    public void setMovieEJB(movieEJB movieEJB) {
        this.movieEJB = movieEJB;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieTimes getMovietimes() {
        return movietimes;
    }

    public void setMovietimes(MovieTimes movietimes) {
        this.movietimes = movietimes;
    }

    public String showTheater(Theater theater) {
        this.theater = theater;
        return "ShowTheater.xhtml";
    }

    public String backToTheater() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params
                = fc.getExternalContext().getRequestParameterMap();
        String theaterID = params.get("theaterID");
        theater = movieEJB.getTheater(theaterID);
        return "ShowTheater.xhtml";
    }

    public String showMovies() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params
                = fc.getExternalContext().getRequestParameterMap();
        String theaterID = params.get("theaterID");
        theater = movieEJB.getTheater(theaterID);
        return "Movies.xhtml";
    }

    public String showMovieTimes(Movie movie) {
        this.movie = movie;
        return "MoviesTimes.xhtml";
    }

    public String showPurchasePage() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params
                = fc.getExternalContext().getRequestParameterMap();
        String theaterID = params.get("theaterID");
        theater = movieEJB.getTheater(theaterID);
        String movieID = params.get("movieID");
        movie = movieEJB.getMovie(movieID);
        String showTime = params.get("showTime");
        movietimes = movieEJB.getMovieTime(movieID, theaterID, showTime);
        return "PurchaseP1.xhtml";
    }

    public List<Movie> getMovieList() {
        if (theater != null) {
            return movieEJB.getMoviesForTheater(theater.getTheaterID());
        } else {
            return null;
        }
    }

    public List<Movie> getUniqueMovieList() {
        if (theater != null) {
            return movieEJB.getUniqueMoviesForTheater(theater.getTheaterID());
        } else {
            return null;
        }
    }

    public List<MovieTimes> getTimeList() {
        if (movie != null) {
            return movieEJB.getMovieTimes(movie.getMovieID(), theater.getTheaterID());
        } else {
            return null;
        }
    }

    public void validateZipcode(FacesContext context, UIComponent comp,
            Object value) {

        System.out.println("inside validate method");

        String inputZip = String.valueOf((int) value);

        // zip code must be 5 digits
        if (inputZip.length() != 5 || (movieEJB.findTheatersByZip(Integer.parseInt(inputZip)).size() < 1)) {
            ((UIInput) comp).setValid(false);

            FacesMessage message = new FacesMessage(
                    "There are no theaters for that zipcode");
            context.addMessage(comp.getClientId(context), message);
        }
    }

    public void validateCard(FacesContext context, UIComponent comp,
            Object value) {

        System.out.println("inside validate method");

        String cardNumber = (String) value;
        boolean valid = true;
        for (int i = 0; i < cardNumber.length(); i++) {
            if (!Character.isDigit(cardNumber.charAt(i))){
                valid = false; 
            }
        }
        
        if (cardNumber.length() != 16 || valid == false) {
            ((UIInput) comp).setValid(false);

            FacesMessage message = new FacesMessage(
                    "Please enter a valid credit card number");
            context.addMessage(comp.getClientId(context), message);

        }

    }

    public void validateTickets(FacesContext context, UIComponent comp,
            Object value) {

        System.out.println("inside validate method");

        int tickets = (int) value;

        if (tickets < 1) {
            ((UIInput) comp).setValid(false);

            FacesMessage message = new FacesMessage(
                    "Invalid number of tickets");
            context.addMessage(comp.getClientId(context), message);

        }

    }

}
