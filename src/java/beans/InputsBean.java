/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.movieEJB;
import entity.Inputs;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author nasifmahmood
 */
@Named(value = "inputsBean")
@SessionScoped
public class InputsBean implements Serializable{

    @EJB
    private movieEJB movieEJB;
    private Inputs inputs = new Inputs();

    /**
     * Creates a new instance of SurveyBean
     */
    public InputsBean() {
    }

    public movieEJB getMovieEJB() {
        return movieEJB;
    }

    public void setInputsEJB(movieEJB movieEJB) {
        this.movieEJB = movieEJB;
    }

    public Inputs getInputs() {
        return inputs;
    }

    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }

    // add survey to database
    public String addInputs() {
        movieEJB.persist(inputs);
        return "result";
    }
    
}
