public class Dice {
    int numDice;

    public Dice (int numDice){
        numDice = this.numDice;
    }

    public int tossAndSum(){
        int sum =0;
        for(int i = 0; i <= numDice; i++){
            sum += ((int) (Math.random()*6)+1);
        }

        return sum;
    }
}
