package com.company;

public class CargoShip extends Ship{
    private int cargoCap;

    public CargoShip(String n, String b,int cap)
    {
        super(n, b);
        cargoCap = cap;
    }

    public void setCargoCap(int cc)
    {
        cargoCap = cc;
    }

    public int getCargoCap()
    {
        return cargoCap;
    }

    public String toString() {

        return "Cargo Ship" + super.toString() + ", Tonnage: " + this.cargoCap + "]";

    }
}
