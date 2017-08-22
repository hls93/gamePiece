package com.theironyard.installparty;

public class GamePiece {
     int positionX;
     int positionY;
     boolean frozen;
     String name;
     String color;

    public GamePiece(){
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    public int getPositionX(){
        return this.positionX;
    }

    public int getPositionY(){
        return this.positionY;
    }

    public boolean getFrozen(){
        return this.frozen;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void move(int newPositionX, int newPositionY){
        if(!this.frozen) {
            this.positionX = newPositionX;
            this.positionY = newPositionY;
            System.out.println("Your position is: " + newPositionX + " " + newPositionY);

        } else {
                System.out.println("You can't move you are frozen! Loser!");
            }
    }

    public void freeze(){
        this.frozen = true;
        System.out.println("Your piece is frozen! HAHA!");
    }

    public void unfreeze(){
        this.frozen = false;
        System.out.println("Your piece is no longer frozen. Good for you.");
    }

//    public int nextInt(int bound) {
//        if (bound <= 0)
//            throw new IllegalArgumentException("bound must be positive");
//
//        if ((bound & -bound) == bound)  // i.e., bound is a power of 2
//            return (int)((bound * (long)next(31)) >> 31);
//
//        int bits, val;
//        do {
//            bits = next(31);
//            val = bits % bound;
//        } while (bits - val + (bound-1) < 0);
//        return val;
//    }
}
