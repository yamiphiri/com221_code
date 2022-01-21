class Vehicle{
    // attributes of car
    private int numberOfTyres;
    private String color;
    Vehicle(){
        this.numberOfTyres =4;
    }    
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
        System.out.println("get numberOfTryes");
        return this.numberOfTyres;
    }
}