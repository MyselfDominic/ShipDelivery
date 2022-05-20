package com.company;

public class CruiseShip extends Ship{

    private int maxPass;

    public CruiseShip(String n, String b,int mp)
    {
        super(n, b);
        maxPass = mp;
    }

    public void setMaxPass(int mp)
    {
        maxPass = mp;
    }

    public int getMaxPass()
    {
        return maxPass;
    }

    public String toString() {

        return "Cruise Ship" + super.toString() + ", Max Passengers :" + this.maxPass + "]";

    }

}
