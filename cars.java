class car implements vehicle{

    private int wheels = 4;


    public void cleanVehicle(){

        System.out.println("the car is clean!");

    }

    public int getNumberOfWheels(){
        return this.wheels;
    }

    public car(int w){
        wheels = w;
    }

    public void printWheels(){
        System.out.println("the number of wheels is: " +getNumberOfWheels());
    }
}
class cars{

    public static void main(String[] args){
        car c1 = new car(4);
        c1.getNumberOfWheels();
        c1.cleanVehicle();
        c1.printWheels();
 }
}