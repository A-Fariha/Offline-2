package com.example.mooolicious;

public class Cake {
    private String name;
    private String desc;
    private int imageID;

    public static final Cake[] cakes={

            new Cake("Pancake","this is a it",R.drawable.pancake),
            //new IceCream("VanillaIcecream","this is a logo",R.drawable.vanillaicecream)



    };

    private Cake(String name,String desc,int imageID){
        this.name= name;
        this.desc=desc;
        this.imageID=imageID;
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


