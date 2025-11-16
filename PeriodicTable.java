import java.util.*;
import java.io.*;

public class PeriodicTable {
    private List<Element> elements;

    public PeriodicTable() {
        elements = new ArrayList<>();
    }

    public void readPeriodicInfo(String PeriodicInfo) {
        try (BufferedReader br = new BufferedReader(new FileReader(PeriodicInfo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                String symbol = data[1].trim();
                int atomicNumber = Integer.parseInt(data[2].trim());
                double atomicWeight = Double.parseDouble(data[3].trim());
                String type = data[4].trim();

                switch (type) {
                    case "AlkaliMetals":
                        elements.add(new AlkaliMetals(name, symbol, atomicNumber, atomicWeight));
                        break;
                    case "AlkalineEarthMetals":
                        elements.add(new AlkalineEarthMetals(name, symbol, atomicNumber, atomicWeight));
                        break;
                    case "Metalloid":
                        elements.add(new Metalloid(name, symbol, atomicNumber, atomicWeight));
                        break;
                    case "OtherNonMetal":
                        elements.add(new OtherNonMetal(name, symbol, atomicNumber, atomicWeight));
                        break;
                    case "Halogen":
                        elements.add(new Halogen(name, symbol, atomicNumber, atomicWeight));
                        break;
                    case "NobleGas":
                        elements.add(new NobleGas(name, symbol, atomicNumber, atomicWeight));
                        break;
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString(String atomicSymbol) {
        for (Element element : elements) {
            if (element != null && element.getAtomicSymbol().equalsIgnoreCase(atomicSymbol)) {
                return element.toString();
            }
        }
        return "Element not found.";
    }
}
