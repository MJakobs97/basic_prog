package com.company;

public class Bekannte {
    public String name, vorname, wohnort;
    public Double coX;
    public Double coY;

    public Bekannte(String name, String vorname, String wohnort, Double coX, Double coY, Double distance2me) {
        this.name = name;
        this.vorname = vorname;
        this.wohnort = wohnort;
        this.coX = coX;
        this.coY = coY;
        this.distance2me = distance2me;
    }

    public Bekannte() {
    }

    /**
     *
     * @param ich
     * @return distanz dieser Person zu meinem Wohnort
     */
    public double calcDistance(Bekannte ich){
        this.distance2me = Math.sqrt(Math.pow(ich.coX-this.coX, 2)+Math.pow(ich.coY-this.coY,2));

        return this.distance2me;
    }

    public void printInfo(){
        System.out.println(this.vorname+", "+this.name+", "+this.wohnort+", "+this.distance2me);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public Double getCoX() {
        return coX;
    }

    public void setCoX(Double coX) {
        this.coX = coX;
    }

    public Double getCoY() {
        return coY;
    }

    public void setCoY(Double coY) {
        this.coY = coY;
    }

    public Double getDistance2me() {
        return distance2me;
    }

    public void setDistance2me(Double distance2me) {
        this.distance2me = distance2me;
    }

    public Double distance2me;

}
