public class OtherNonMetal extends Element {
    private boolean conductsElectricity = false;
    private boolean conductsHeat = false;
    
    public OtherNonMetal(String name, String atomicSymbol, int atomicNumber, double atomicWeight) {
        super(name, atomicSymbol, atomicNumber, atomicWeight);
    }

    public boolean conductsElectricity() {
        return conductsElectricity;
    }

    public boolean conductsHeat() {
        return conductsHeat;
    }

    public String toString() {
        return "OtherNonMetal - " + getName() + " (" + getAtomicSymbol() + "), Atomic Number: " + getAtomicNumber() + " , Atomic Mass: " +getAtomicMass() + " , Conducts electricity: " + conductsElectricity() + " , Conducts heat: " + conductsHeat();

    }


}
