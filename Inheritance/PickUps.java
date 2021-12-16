class PickUps extends Vehicle {
    double minimumCarryingCapacityInKg =250;
    PickUps(){

    }
    public void setMinimumCarryingCapacityInKg(double minimumCarryingCapacityInKg){
        this.minimumCarryingCapacityInKg = minimumCarryingCapacityInKg;
    }
    public double getMinimumCarryingCapacityInKg() {
        return this.minimumCarryingCapacityInKg;
    }

}