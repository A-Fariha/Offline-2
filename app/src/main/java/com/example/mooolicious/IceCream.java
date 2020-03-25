package com.example.mooolicious;

public class IceCream {
    private String name;
    private String desc;
    private int imageID;

    public static final IceCream[] icecream={

            new IceCream("CupckeIcecream","this is a logo",R.drawable.cupcakeicecream),
            //new IceCream("VanillaIcecream","this is a logo",R.drawable.vanillaicecream)



    };

    private IceCream(String name,String desc,int imageID){
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
