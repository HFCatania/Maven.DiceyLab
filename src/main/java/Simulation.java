import java.sql.SQLOutput;

public class Simulation {
    public static void main(String[] args){
    int numDice = 2;
    int numToss = 10000;

        Dice instDice = new Dice(numToss);
        Bins instBins = new Bins(numDice, (numDice * 6));

        for(int i = 0; i < numToss; i++){
            instBins.incrementBins(instDice.tossAndSum());
        }


            System.out.println("***");
            System.out.println("Simulation: " + numDice + " dice rolled " + numToss + " times.");
            System.out.println("***\n");
            for(int i = 1; i<= (numDice * 6) + 1; i++){
                Integer count = instBins.getBins(i);
                Double prob = (double) count/(double)numToss;
                Integer stars = (int) (prob*100);
                StringBuilder sb = new StringBuilder("");
                for(int x=0; x < stars; x ++)sb.append("*");
                System.out.println(String.format("%2d:%9d: %1.2f ", i, count, prob) + sb.toString());
            }
    }

}
