package tpD.tp01;


public class HighScore {
    Score[] top; 


    public HighScore(){
        this.top = new Score[100];
    }

    public HighScore(int val){
        this.top = new Score[val];

    }

    int getNbFreeSlot(){
        int rep = 0; 
        for(int taille = 0 ; taille < this.top.length ; taille++){
            if(this.top[taille] == null){
                rep++ ; 
            }
        }
        return rep ;
    }

    public String toString(){
        String rep = "TOP SCORE : " + "\n" ;
        for(int i = 0 ; i < (this.top.length - this.getNbFreeSlot()) ; i++){
            rep = rep + this.top[i].toString() + "\n";
        } 
        rep = rep + "** " + this.getNbFreeSlot() + " free slots **";
        return rep;
    }
    

       public boolean addFirstFreeSlot(Score newScore) {
        for (int i = 0; i < top.length; i++) {
            if (top[i] == null) {
                top[i] = newScore;
                return true;
            }
        }
        return false;
    }

    void shifting(int idx){
        Score valeureInitiale = this.top[idx]; 
        
        for( int t = idx ; t < this.top.length ; t++){
            if( t == idx ){
                this.top[idx] = null;
            }

            if(idx > this.top.length ){
            this.top[idx + 1 ] = valeureInitiale ; 
            valeureInitiale = this.top[idx];
            }
        }
    }
        
    boolean addHighestFirst(Score newScore){
        int idx = 0;
        while (idx < top.length && top[idx].score > newScore.score) {
            idx++;
        }
        if(this.addOneSlotPerPlayer(newScore) == true){
            this.shifting(idx);
            return true;
        }
        return false ;
    }
   
   
    boolean addOneSlotPerPlayer(Score newScore){ 
        for(int idx = 0; idx < top.length; idx++){

            if(top[idx].isSamePlayer(newScore)== true && top[idx].isHigher(newScore) == true){
                top[idx].score = newScore.score ; 
                return true ; 
            }

            if(this.getNbFreeSlot() >= 1){
                top[idx] = newScore ; 
                return true ;
            }   
        }
        return false;
    }
 
} 

/*public boolean addOneSlotPerPlayer(Score newScore) {
        for (int i = 0; i < top.length; i++) {
            if (top[i] == null) {
                top[i] = newScore;
                return true;
            } else if (top[i].isSamePlayer(newScore)) {
                if (top[i].score < newScore.score) {
                    shifting(i);
                    top[i] = newScore;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }*/
       