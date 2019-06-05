
public class Bins {
    int[] bins;

    public Bins(int numDice, int maxBins){
        this.bins = new int[maxBins + 1];
        for(int i = 0; i < maxBins; i++){
            bins[i] = 0;
        }
    }

    public int getBins(int bin) {
        return this.bins[bin];
    }

    public void incrementBins(int bin){
        this.bins[bin]++;
    }
}
