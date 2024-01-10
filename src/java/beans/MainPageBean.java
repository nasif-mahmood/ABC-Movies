/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.movieEJB;
import entity.Movie;
import entity.Theater;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author nasifmahmood
 */
@Named(value = "mainPageBean")
@RequestScoped
public class MainPageBean {

    @EJB
    private movieEJB movieEJB;

    /**
     * Creates a new instance of MainPageBean
     */
    public MainPageBean() {
    }

    public List<Theater> getTheaterList() {
        return movieEJB.findAllTheaters();
    }
    
    public List<Theater> getTheaterListZip(int zipcode) {
        return movieEJB.findTheatersByZip(zipcode);
    }
}
