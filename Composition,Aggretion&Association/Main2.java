class Vehicle {
   private int id;
   private String model;

   public Vehicle(int id, String model){
      this.id = id;
      this.model = model;
   }

   public void showVehicleDetails(){
      System.out.println("Vehicle ID: " + id);
      System.out.println("Vehicle Model: " + model);
   }
  
}

class Driver {
  private String driverName;
  private Vehicle vobj; //association, a driver HAS a vehicle

  public Driver(String driverName, Vehicle vobj){
   this.driverName = driverName;
   this.vobj = vobj;
  }

  public void showDriverDetails(){
      System.out.println("Driver Name: " + driverName);
      vobj.showVehicleDetails();
  }
}

class Main {
   public static void main(String args[]) {
	    Vehicle vehicle1 = new Vehicle(4452, "Volvo S");
       Driver driver1 = new Driver("John Doe", vehicle1);

       driver1.showDriverDetails();
   }
  
}