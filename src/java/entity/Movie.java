/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nasifmahmood
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Movie.findAll", query = "SELECT s FROM Movie s"),
    @NamedQuery(name = "Movie.findByMovieID", query = "SELECT s FROM Movie s WHERE s.movieID = :movieID"),
    @NamedQuery(name = "Movie.findByMovieName", query = "SELECT s FROM Movie s WHERE s.movieName = :movieName"),
    @NamedQuery(name = "Movie.findByDescription", query = "SELECT s FROM Movie s WHERE s.description = :description"),
    @NamedQuery(name = "Movie.findTheaters", query = "SELECT c FROM Theater c, MovieTimes e WHERE c.theaterID = e.movieTimesPK.theaterID and e.movieTimesPK.movieID = :movieID")})
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private String movieID;
    private String movieName;
    private String description;
    private String poster;

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieID != null ? movieID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.movieID == null && other.movieID != null) || (this.movieID != null && !this.movieID.equals(other.movieID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movie[ movieID=" + movieID + " ]";
    }

}
