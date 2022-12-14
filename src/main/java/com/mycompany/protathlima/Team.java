/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protathlima;

/**
 *
 * @author User
 */
public class Team {
    
    private String teamName;
    
    private String teamColor;

    public Team() {
        this.teamColor = "yellow";
    }
    
    
    

    /**
     * Get the value of teamColor
     *
     * @return the value of teamColor
     */
    public String getTeamColor() {
        return teamColor;
    }

    /**
     * Set the value of teamColor
     *
     * @param teamColor new value of teamColor
     */
    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }


    /**
     * Get the value of teamName
     *
     * @return the value of teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Set the value of teamName
     *
     * @param teamName new value of teamName
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
 public void printinfo() {
     System.out.println("To xrwma tis omadas einai:" + this.getTeamColor());
     System.out.println("To onoma tis omadas einai:" + this.getTeamName());
 }
}
