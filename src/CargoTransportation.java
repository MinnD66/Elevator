public final class CargoTransportation {

    private final int dimensions;
    private final int weight;
    private final String address;
    private final boolean isTurns;
    private final String registrationNumber;
    private final boolean isFragile;

    public static boolean isCopied = false;

    public CargoTransportation(int dimensions, int weight, String address, boolean isTurns, String registrationNumber, boolean isFragile) {
        this.dimensions = new Dimensions().сalculation();
        this.address = address;
        this.weight = weight;
        this.isTurns = isTurns;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }

    public CargoTransportation changeDimensions(int newDimensions) {
        this.isCopied = true;
        return new CargoTransportation(newDimensions,this.weight, this.address, this.isTurns, this.registrationNumber, this.isFragile);
    }

    public CargoTransportation changeWeight(int newWeight) {
        this.isCopied = true;
        return new CargoTransportation(this.dimensions,newWeight, this.address, this.isTurns, this.registrationNumber, this.isFragile);
    }

    public CargoTransportation changeAddress(String newAddress) {
        this.isCopied = true;
        return new CargoTransportation(this.dimensions,this.weight, newAddress, this.isTurns, this.registrationNumber, this.isFragile);
    }

    public CargoTransportation changeIsTurns(boolean newIsTurns) {
        this.isCopied = true;
        return new CargoTransportation(this.dimensions,this.weight, this.address, newIsTurns, this.registrationNumber, this.isFragile);
    }

    public CargoTransportation changeRegistrationNumber(String newRegistrationNumber) {
        this.isCopied = true;
        return new CargoTransportation(this.dimensions,this.weight, this.address, this.isTurns, newRegistrationNumber, this.isFragile);
    }

    public CargoTransportation changeIsFragile(boolean IsFragile) {
        this.isCopied = true;
        return new CargoTransportation(this.dimensions,this.weight, this.address, this.isTurns, this.registrationNumber, IsFragile);
    }

    @Override
    public String toString() {
        return "CargoTransportation( dimensions " + dimensions + ", weight " + weight + ", address " + address + ", isTurns " + isTurns + ", registrationNumber " + registrationNumber + ", isFragile " + isFragile;
    }
}



