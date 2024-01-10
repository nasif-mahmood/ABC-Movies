/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Movie;
import entity.MovieTimes;
import entity.Theater;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nasifmahmood
 */
@Stateless
public class movieEJB {

    @PersistenceContext(unitName = "MovieTicketsPU") 
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public List<Theater> findAllTheaters() {
        return em.createNamedQuery("Theater.findAll", Theater.class).getResultList();
    }

    public List<Theater> findTheatersByZip(int zipcode) {
        return em.createNamedQuery("Theater.findByZipcode", Theater.class)
                .setParameter("zipcode", zipcode)
                .getResultList();
    }

    public Theater getTheater(String theaterID) {
        return em.createNamedQuery("Theater.findByTheaterID", Theater.class)
                .setParameter("theaterID", theaterID)
                .getSingleResult();
    }

    public Movie getMovie(String movieID) {
        return em.createNamedQuery("Movie.findByMovieID", Movie.class)
                .setParameter("movieID", movieID)
                .getSingleResult();
    }

    public MovieTimes getMovieTime(String movieID, String theaterID, String showTime) {
        return em.createNamedQuery("MovieTimes.findByEverything", MovieTimes.class)
                .setParameter("movieID", movieID)
                .setParameter("theaterID", theaterID)
                .setParameter("showTime", showTime)
                .getSingleResult();
    }

    // Gets all movies and has duplicates
    public List<Movie> getMoviesForTheater(String theaterID) {
        return em.createNamedQuery("Theater.findMovies", Movie.class)
                .setParameter("theaterID", theaterID)
                .getResultList();
    }

    public List<Movie> getUniqueMoviesForTheater(String theaterID) {
        return em.createNamedQuery("Theater.findUniqueMovies", Movie.class)
                .setParameter("theaterID", theaterID)
                .getResultList();
    }

    public List<MovieTimes> getMovieTimes(String movieID, String theaterID) {
        return em.createNamedQuery("MovieTimes.findByMovieandTheaterID", MovieTimes.class)
                .setParameter("movieID", movieID)
                .setParameter("theaterID", theaterID)
                .getResultList();

    }
}
