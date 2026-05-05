package tpD.tp01;


class UseHighScore2{

    public static void main(String[] args){
    
        int param = Integer.parseInt("10");
        HighScore hit = new HighScore(param);
  
        hit.addFirstFreeSlot(new Score("Alice" , 300 , "29/01"));
        hit.addFirstFreeSlot(new Score("Bob" , 800 , "29/01"));
        hit.addFirstFreeSlot(new Score("Alice" , 42 , "30/01"));
        hit.addFirstFreeSlot(new Score("Alice" , 650 , "31/01"));


        System.out.println(hit);

    }
}