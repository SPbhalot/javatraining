package Basic;

import java.util.Scanner;

enum VehicleType{
    SUV,SEDAN,EV
}
    public class Vehicle {

 
        private String vehicleNumber;
      private   short numberOfSeats;
       private  VehicleType Type;

    public Vehicle(VehicleType Type) {
        this.Type = Type;
    }

    public Vehicle(String vehicleNumber, VehicleType Type) {
          this(Type);
        this.vehicleNumber = vehicleNumber;
    }

 

    public Vehicle(String vehicleNumber, short numberOfSeats, VehicleType Type) {
        this(vehicleNumber,Type);
        this.numberOfSeats = numberOfSeats;
    
    }

public Vehicle(Vehicle obj){
    this.numberOfSeats=obj.numberOfSeats;
    this.Type=obj.Type;
    System.out.println("plz enter vehicle no.");
    Scanner sc=new Scanner(System.in);
    this.vehicleNumber = sc.nextLine();
    sc.close();
  }

public static void main(String[] args) {
    Vehicle v1 = new Vehicle("MH55432", VehicleType.SEDAN);
    Vehicle v2 = new Vehicle("MH55492",(short) 4, VehicleType.SUV);
    Vehicle v3 = new Vehicle (VehicleType.EV);
    System.out.println(v1);
}

    @Override
    public String toString() {
        return "{" +
            " vehicleNumber='" + getVehicleNumber() + "'" +
            ", numberOfSeats='" + getNumberOfSeats() + "'" +
            ", Type='" + getType() + "'" +
            "}";
    }


    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public short getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(short numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public VehicleType getType() {
        return this.Type;
    }

    public void setType(VehicleType Type) {
        this.Type = Type;
    }




}


