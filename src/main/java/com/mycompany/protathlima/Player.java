/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protathlima;

import java.util.Date;

/**
 *
 * @author User
 */
public class Player {
    
        private String firstName;
        private String lastName;
        private Date birthDate;
        
    private int Points;

    /**
     * Get the value of Points
     *
     * @return the value of Points
     */
    public int getPoints() {
        return Points;
    }

    /**
     * Set the value of Points
     *
     * @param Points new value of Points
     */
    public void setPoints(int Points) {
        this.Points = Points;
    }


    public Player(String firstName) {
        this.firstName = firstName;
    }

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Player(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
        
        
        

    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

     public String getlasttName() {
        return lastName;
    }
     
     

    /**
     * Set the value of firstName
     *
     * @param lastName new value of firstName
     */
    public void setlastName(String firstName) {
        this.lastName = lastName;
    }

      public Date getbirthDate() {
        return birthDate;
    }

    /**
     * Set the value of firstName
     *
     * @param lastName new value of firstName
     */
    public void setbirthDate(String firstName) {
        this.birthDate = birthDate;
    }
    public void printStats(){
        System.out.println("To onoma tou player einai" + this.getFirstName());
        System.out.println("To epitheto tou player einai" + this.getlasttName());
        System.out.println("H hmerominia gennisis einai:" + this.getbirthDate());
        System.out.println("Oi pontoi tou paikti einai:" + this.getPoints());
    }
}
