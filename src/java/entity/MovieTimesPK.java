/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author nasifmahmood
 */
@Embeddable
public class MovieTimesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    private String theaterID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    private String movieID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    private String showTime;
    
    public String getTheaterID() {
        return theaterID;
    }

    public void setTheaterID(String theaterID) {
        this.theaterID = theaterID;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterID != null ? theaterID.hashCode() : 0);
        hash += (movieID != null ? movieID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieTimesPK)) {
            return false;
        }
        MovieTimesPK other = (MovieTimesPK) object;
        if ((this.theaterID == null && other.theaterID != null) || (this.theaterID != null && !this.theaterID.equals(other.theaterID))) {
            return false;
        }
        if ((this.movieID == null && other.movieID != null) || (this.movieID != null && !this.movieID.equals(other.movieID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MovieTimesPK[ movieID=" + movieID + ", theaterID=" + theaterID + " ]";
    }
    
}
