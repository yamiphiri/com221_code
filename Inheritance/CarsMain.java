public class CarsMain{
    public static void main(String[] args){
        PickUps hilux = new PickUps();
        System.out.println(hilux.getNumberOfTryes());
        hilux.setColor("red");
        System.out.println(hilux.getColor());
    }
}