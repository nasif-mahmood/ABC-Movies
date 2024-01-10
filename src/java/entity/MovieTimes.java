/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author nasifmahmood
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "MovieTimes.findAll", query = "SELECT e FROM MovieTimes e"),
    @NamedQuery(name = "MovieTimes.findByMovieID", query = "SELECT e FROM MovieTimes e WHERE e.movieTimesPK.movieID = :movieID"),
    @NamedQuery(name = "MovieTimes.findByShowtime", query = "SELECT e FROM MovieTimes e WHERE e.movieTimesPK.showTime = :showTime"),
    @NamedQuery(name = "MovieTimes.findByTheaterID", query = "SELECT e FROM MovieTimes e WHERE e.movieTimesPK.theaterID = :theaterID"),
    @NamedQuery(name = "MovieTimes.findByMovieandTheaterID", query = "SELECT e FROM MovieTimes e WHERE e.movieTimesPK.theaterID = :theaterID and e.movieTimesPK.movieID = :movieID"),
    @NamedQuery(name = "MovieTimes.findByEverything", query = "SELECT e FROM MovieTimes e WHERE e.movieTimesPK.theaterID = :theaterID and e.movieTimesPK.movieID = :movieID and e.movieTimesPK.showTime = :showTime")})

public class MovieTimes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MovieTimesPK movieTimesPK;

    public MovieTimesPK getMovieTimesPK() {
        return movieTimesPK;
    }

    public void setMovieTimesPK(MovieTimesPK movieTimesPK) {
        this.movieTimesPK = movieTimesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieTimesPK != null ? movieTimesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieTimes)) {
            return false;
        }
        MovieTimes other = (MovieTimes) object;
        if ((this.movieTimesPK == null && other.movieTimesPK != null) || (this.movieTimesPK != null && !this.movieTimesPK.equals(other.movieTimesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MovieTimes[ movieTimesPK=" + movieTimesPK + " ]";
    }
    
}
