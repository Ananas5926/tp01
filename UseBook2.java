package tpD.tp01;


class UseBook2{

    public static void main(String[] args){

        Book biblio[] = new Book[5];
            biblio[0] = new Book("tom", "1420", 2025);
            biblio[1] = new Book("yann", "renardeau", 2100);
            biblio[2] = new Book("Trystan" , "la vie de papy", 1591);
            biblio[3] = new Book("sacha", "leJeux", 2020);
            biblio[4] = new Book("amour", "AY" ,2025);


        for(int ligne = 0 ; ligne <biblio.length; ligne++){
            System.out.println(biblio[ligne]);
        }

        int max = 0 ;
        int idx = 0;
        for(int l = 0 ; l < biblio.length; l++){
             
            if(biblio[l].year > max){
                max = biblio[l].year;
                idx = l;
            } 
        }
        System.out.println(biblio[idx]);

        
    }

}