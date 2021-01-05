package com.codecool.oopws3;

abstract class Animal {
    private final String NAME;
    public boolean isMale;

    public Animal(String name, boolean isMale){
        NAME = name;
        this.isMale = isMale;
    }

    public String getNAME() {
        return NAME;
    }

    public boolean getIsMale(){
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void feed(){
        System.out.println("niam niam");
        speak();
    }

    protected abstract void speak();
}
