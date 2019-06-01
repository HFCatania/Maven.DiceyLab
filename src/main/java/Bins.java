
public class Bins {
    int[] bins;

    public Bins(int numDice, int maxBins){
        this.bins = new int[maxBins + 1];
        for(int i = numDice; i <= maxBins; i++){
            bins[1] = 0;
        }
    }

    public Integer getBins(Integer bin) {
        return this.bins[bin];
    }

    public void incrementBins(Integer bin){
        this.bins[bin]++;
    }
}
