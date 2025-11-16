public class AlkaliMetals extends Element {
    private boolean Reactive = true;
    private boolean Malleable = true;


    public AlkaliMetals(String name, String atomicSymbol, int atomicNumber, double atomicWeight) {
        super(name, atomicSymbol, atomicNumber, atomicWeight);
    }

    public boolean isReactive() {
        return Reactive;
    }
    public boolean isMalleable() {
        return Malleable;
    }

    public String toString() {
        return "Alkali Metal - " + getName() + " (" + getAtomicSymbol() + "), Atomic Number: " + getAtomicNumber() + " , Atomic Mass:  " +getAtomicMass() + " , Reactive: " + isReactive() + " , Malleable: " + isMalleable();
    }





}
