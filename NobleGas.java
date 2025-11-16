public class NobleGas extends Element {
    private boolean conductsHeat = false;
    private boolean isReactive = false;

    public NobleGas(String name, String atomicSymbol, int atomicNumber, double atomicWeight) {
        super(name, atomicSymbol, atomicNumber, atomicWeight);
    }

    public boolean conductsHeat() {
        return conductsHeat;
    }

    public boolean isReactive() {
        return isReactive;
    }

    public String toString() {
        return "Noble Gas - " + getName() + " (" + getAtomicSymbol() + "), Atomic Number: " + getAtomicNumber() + " , Atomic Mass: " +getAtomicMass() + " , Reactive: " + isReactive() + " , Conducts heat: " + conductsHeat();

    }



    
}
