/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author pedro
 */
public class Sala implements Serializable{
    
    private String movie_name;
    private int id_movie;
    private int vagas;
    private float preco;
    
    public String getName_movie(){
        return movie_name;
    }
    
    public void setName_movie(String movie_name){
        this.movie_name = movie_name;
    }
    
    public int getVagas(){
        return vagas;
    }
    
    public void setVagas(int vagas){
        this.vagas = vagas;
    }
    
    public int getID_movie(){
        return id_movie;
    }
    
    public void setID_movie(int id_movie){
        this.id_movie = id_movie;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
