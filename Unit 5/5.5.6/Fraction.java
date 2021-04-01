public class Fraction
{
    // Create your instance variables and constructor here
    int n;
    int d;
    
    public Fraction(int n, int d)
    {
        this.n = n;
        this.d = d;
    }
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return n;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return d;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD\
        this.n = x;
        
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD\
        this.d = x;
        
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.n = n*other.getDenominator() + d*other.getNumerator();
        this.d = d*other.getDenominator();
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.n = n*other.getDenominator() - d*other.getNumerator();
        this.d = d*other.getDenominator();
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.n *= other.getNumerator();
        this.d *= other.getDenominator();
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return n + " / " + d;
    }
}
