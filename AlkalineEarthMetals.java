public class AlkalineEarthMetals extends Element {
    private boolean Metallic = true;
    private boolean conductsElectricity = true;

    public AlkalineEarthMetals(String name, String atomicSymbol, int atomicNumber, double atomicWeight) {
        super(name, atomicSymbol, atomicNumber, atomicWeight);
    }
    public boolean isMetallic() {
        return Metallic;
    }
    public boolean conductsElectricity() {
        return conductsElectricity;
    }

    public String toString() {
        return "Alkaline Earth Metal - " + getName() + " (" + getAtomicSymbol() + "), Atomic Number: " +  getAtomicNumber() + " , Atomic Mass:  " + getAtomicMass() + " , Metallic: " + isMetallic() + " , Conducts electricity: " + conductsElectricity();
    }
    
}
