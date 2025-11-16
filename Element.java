public abstract class Element {
    public String name;
    public String atomicSymbol;
    public int atomicNumber;
    public double atomicMass;
    
    
    public Element(String name, String atomicSymbol, int atomicNumber, double atomicMass) {
        this.name = name;
        this.atomicSymbol = atomicSymbol;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
    }

    public String getName() {
        return name;
    }

    public String getAtomicSymbol() {
        return atomicSymbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicMass() {
        return atomicMass;
    }


    public abstract String toString();



    



    
}
