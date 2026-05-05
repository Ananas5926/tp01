package tpD.tp01;


class UseHighScore{ 

    public static void main(String[] args){

        HighScore hit = new HighScore();
  
        hit.addFirstFreeSlot(new Score("Alice" , 300 , "29/01"));
        hit.addFirstFreeSlot(new Score("Bob" , 800 , "29/01"));

        System.out.println(hit);
    }
}