
import java.util.Comparator;

public class SymbolFrequency {

    String symbol;
    int frequency;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public SymbolFrequency(String symbol, int frequency) {
        this.symbol = symbol;
        this.frequency = frequency;
    }
}
