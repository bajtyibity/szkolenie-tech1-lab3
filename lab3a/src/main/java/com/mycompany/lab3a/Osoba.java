/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3a;
/**
 *
 * @author lg
 */
public class Osoba {
    private String imie = null;
    private String nazwisko = null;
    private int id = 0;
    private static int licznik=0;

    public Osoba() {
        licznik++;
        this.id = licznik;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        licznik++;
        this.id = licznik;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }    
    
    public String getNazwisko(){
        return nazwisko;
    }
    
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    
      public String getId(){
        return Integer.toString(id) ;
    }
    
    public void setID(int id){
        this.id=id;
    }
    
    
}
