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
import javax.validation.constraints.Size;

/**
 *
 * @author nasifmahmood
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Theater.findAll", query = "SELECT c FROM Theater c"),
    @NamedQuery(name = "Theater.findByTheaterID", query = "SELECT c FROM Theater c WHERE c.theaterID = :theaterID"),
    @NamedQuery(name = "Theater.findByTheaterName", query = "SELECT c FROM Theater c WHERE c.theaterName = :theaterName"),
    @NamedQuery(name = "Theater.findByZipcode", query = "SELECT c FROM Theater c WHERE c.zipcode = :zipcode"),
    @NamedQuery(name = "Theater.findMovies", query = "SELECT c FROM Movie c, MovieTimes e WHERE c.movieID = e.movieTimesPK.movieID and e.movieTimesPK.theaterID = :theaterID"),
    @NamedQuery(name = "Theater.findUniqueMovies", query = "SELECT DISTINCT c FROM Movie c, MovieTimes e WHERE c.movieID = e.movieTimesPK.movieID and e.movieTimesPK.theaterID = :theaterID")})
public class Theater implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    private String theaterID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String theaterName;
    private Integer zipcode;
    private String address;

    public String getTheaterID() {
        return theaterID;
    }

    public void setTheaterID(String theaterID) {
        this.theaterID = theaterID;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterID != null ? theaterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theater)) {
            return false;
        }
        Theater other = (Theater) object;
        if ((this.theaterID == null && other.theaterID != null) || (this.theaterID != null && !this.theaterID.equals(other.theaterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Theater[ theaterID=" + theaterID + " ]";
    }
    
}
