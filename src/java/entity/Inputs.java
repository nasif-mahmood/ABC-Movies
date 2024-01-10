/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author nasifmahmood
 */
@Entity
public class Inputs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int inputid;
    private int zipcode;
    private String creditcard;
    private int numtickets;
    private String price;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }

    public int getNumtickets() {
        return numtickets;
    }

    public void setNumtickets(int numtickets) {
        this.numtickets = numtickets;
        setPriceOnTickets(numtickets);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getInputid() {
        return inputid;
    }

    public void setInputid(int inputid) {
        this.inputid = inputid;
    }
    
    public void setPriceOnTickets(int numtickets){
        int newPrice = numtickets * 10;
        String cost = "$" + newPrice;
        this.price = cost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inputs)) {
            return false;
        }
        Inputs other = (Inputs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Inputs[ id=" + id + " ]";
    }
    
}
