/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.protathlima;

/**
 *
 * @author User
 */
public class Protathlima {

    public static void main(String[] args) {
        System.out.println("Kalhmera Kalhspera!");
        
        Player p1 = new Player("Leonidas");
        Player p2 = new Player("Dhmhtris","Kefalas");
       
        Team team1 = new Team();
        
        team1.setTeamName("Omada1");
        team1.printinfo();
        p1.printStats();
    }
    
    
    
}
