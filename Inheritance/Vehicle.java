class Vehicle{
    // attributes of car
    private int numberOfTyres =4;
    private String color;
    // set color of the car
    public void setColor(String color) {
        this.color = color;
    }
    //get color of the car
    public String getColor(){
        return this.color;
    }
    public void setNumberOfTryes(int numberOfTryes){
        this.numberOfTyres = numberOfTryes;
    }
    public int getNumberOfTryes(){
        return this.numberOfTyres;
    }
}