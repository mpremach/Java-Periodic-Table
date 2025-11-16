public class Halogen extends Element {
    private boolean Reactive = true;
    private boolean Volatile = true;

    public Halogen(String name, String atomicSymbol, int atomicNumber, double atomicWeight) {
        super(name, atomicSymbol, atomicNumber, atomicWeight);
    }

    public boolean isReactive() {
        return Reactive;
    }
    public boolean isVolatile() {
        return Volatile;
    }

    public String toString() {
        return "Halogen - " + getName() + " (" + getAtomicSymbol() + "), Atomic Number: " +  getAtomicNumber() + ", Atomic Mass: " +getAtomicMass() + ", Reactive: " + isReactive() + ", Volatile: " + isVolatile();

    }

}
