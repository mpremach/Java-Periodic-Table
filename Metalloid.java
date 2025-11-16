public class Metalloid extends Element {
    private boolean isBrittle = true;

    public Metalloid(String name, String atomicSymbol, int atomicNumber, double atomicWeight) {
        super(name, atomicSymbol, atomicNumber, atomicWeight);
    }
    public boolean isBrittle() {
        return isBrittle;
    }
    
    public String toString() {
        return "Metalloid - " + getName() + " (" + getAtomicSymbol() + "), Atomic Number:  " +  getAtomicNumber() + " , Atomic Mass: " +getAtomicMass() + " , Brittle: " + isBrittle();

    }
}
