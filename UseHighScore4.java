package tpD.tp01;


class UseHighScore4 { 
    public static void main(String[] args) {

        HighScore hit = new HighScore(3);

        hit.addHighestFirst(new Score("Alice", 300, "29/01"));
        hit.addHighestFirst(new Score("Bob", 800, "29/01"));
        hit.addHighestFirst(new Score("Carl", 750, "30/01"));
        hit.addHighestFirst(new Score("Alice", 650, "31/01"));
        hit.addHighestFirst(new Score("Bob", 430, "31/01"));

        System.out.println(hit);
    }
}
