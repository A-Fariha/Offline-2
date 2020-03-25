package com.example.mooolicious;

public class Doughnut {
    private String name;
    private String desc;
    private int imageID;

    public static final Doughnut[] doughnuts={
            new Doughnut("Colorfuldoughnut","this is it",R.drawable.vanillacakedoughnut ),


    };
    private Doughnut(String name,String desc,int imageID) {
        this.name = name;
        this.desc = desc;
        this.imageID = imageID;


    }
    public String getDesc(){
        return desc;
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }
    public String toString(){
        return this.name;
    }
}

