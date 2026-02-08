public class Score {
    String name; 
    int score ;
    String timestamp;  

    public Score(String name, int score, String timestamp ){
        this.name = name; 
        this.score = score;
        this.timestamp = timestamp;   
    }

    public String toString(){
        return ("( " + this.timestamp + " ) " + this.name + " = " + this.score );
    }

    boolean isSamePlayer(Score other){
        if( this.name.equals(other.name)){
            return true;
        }
         return false ; 
    }

    boolean isHigher(Score other){
        if(this.score > other.score){
            return true ; 
        }
        return false ;
    }
}