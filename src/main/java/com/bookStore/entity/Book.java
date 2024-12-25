package com.bookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  int id;
    private  String name;
    private String author;
    private String price;
    public Book(int id,String name,String author,String price) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(){
        super();
    }
    public int getId(){
        return id;
    }
    public void  setId(int id){
        this.id = id;
    }
    public String getname(){
        return name;
    }
    public void  setname(String name){
        this.name = name;
    }
    public String getauthor(){
        return author;
    }
    public void  setauthor(String author){
        this.author = author;
    }   public String getprice(){
        return price;
    }
    public void  setprice(String price){
        this.price = price;
    }

}
