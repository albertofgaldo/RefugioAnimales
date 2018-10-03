package com.animal.refugio.refugioanimales.domain;

import android.graphics.Bitmap;
import android.media.Image;

import java.util.Date;

public class Animal {

    private int id;
    private String name;
    private int age;
    private boolean hasChip;
    private String type;
    private Date date;
    private Image picture;
    private static int counter=1;

    public Animal(String name, int age, boolean hasChip, String type, Date date, Image picture ){
        this.id= counter;
        this.name = name;
        this.age = age;
        this.hasChip = hasChip;
        this.type = type;
        this.date = date;
        this.picture = picture;
        this.counter++;
    }

    public int getId(){ return this.id; }

    public String getName(){ return this.name; }

    public void setName(String name){ this.name = name; }

    public int getAge(){ return this.age; }

    public void setAge(int age){this.age = age;}

    public boolean getHasChip(){ return this.hasChip; }

    public void setHasChip(boolean hasChip){ this.hasChip=hasChip; }

    public String getKindAnimal(){ return this.type; }

    public void setKindAnimal(String type){this.type = type; }

    public Date getDate (){return date;}

    public void setDate (Date date){this.date=date;}

    public Image getPicture(){ return this.picture;}

    public void setPicture(Image picture){this.picture=picture;}


}
