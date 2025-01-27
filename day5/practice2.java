class Vehicle{

    int maxSpeed ;
    String fuelType ; 

    
    Vehicle(int speed,String fuel){

        this.maxSpeed=speed;
        this.fuelType=fuel;
    }

    public Vehicle() {
    }
    

    public int getmaxspeed()
    {
        return maxSpeed;
    } 
    public int fueltype()
    {
        return maxSpeed;
    }

    public void displayInfo(){

        System.out.println("This vehicle's maxSpeed is "+ maxSpeed + " and fueltype is " + fuelType);
    }
}
 class Car extends Vehicle{
        
    int seatCapacity;
    
    public Car(int speed,String fuel,int seat){

      //  super(speed, fuel);

        this.seatCapacity=seat;
    }

    public void displayInfo(){

        System.out.println("This vehicle's maxSpeed is "+ maxSpeed + " and fueltype is " + fuelType);
    }
} 
 class Truck extends Vehicle{
    
    int tyre;
    Truck(int speed,String fuel,int tyre){

        super(speed, fuel);
        this.tyre=tyre;
    } 
    public void displayInfo(){

        System.out.println("This vehicle's maxSpeed is "+ maxSpeed + " , fueltype -> " + fuelType + " and number of tyre is " + tyre);
    }
} 
 class Motorcycle extends Vehicle{

    int milege;
    Motorcycle(int speed,String fuel,int milege){

        super(speed, fuel);
        this.milege=milege;
    }

    public void displayInfo(){

        System.out.println("This vehicle's maxSpeed is "+ maxSpeed + " , fueltype -> " + fuelType + " and milege is " + milege );
    }
} 
class practice2{
    public static void main(String[] args) {
        
        Vehicle Dzire = new Car(120,"Diesel",8);
        Vehicle Tata = new Truck(35,"Diesel",12);
        Vehicle Bullet = new Motorcycle(60,"petrol",40);

        Dzire.displayInfo();
        Tata.displayInfo();
        Bullet.displayInfo();

    }
}