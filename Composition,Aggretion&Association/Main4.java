class Car{
    private final int id;
    private String model;
    private String color;

    public Car(int id,String model, String color){
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public void carFeatures(){
        System.out.println("---Car Features---");
        System.out.println("ID: " + this.id);
        System.out.println("Color: " + this.color);
        System.out.println("Model: " + this.model);
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }
}


//inheritance: extends Car so toyota IS A car
//composition: has a ToyotaEngine

class Toyota extends Car {
    private final ToyotaEngine engine;

    public Toyota(int id, String model, String color){
        //inheritance
        super(id, model,color);
        this.engine = new ToyotaEngine();
    }

    public void setStart(){
        System.out.println("Toyota car is starting.");
        this.engine.start();
    }



}

class ToyotaEngine{
    public void start(){
        System.out.println("Engine has been started");
    }

    public void stop(){
        System.out.println("Engine has been stopped");
    }
}



public class Main4 {
    public static void main(String[] args){
        Toyota myCorolla = new Toyota(1234, "Corolla", "Silver");

        myCorolla.carFeatures();
        myCorolla.setStart();
        myCorolla.setModel("Camry");
        myCorolla.setColor("Black");
        myCorolla.carFeatures();
    }
    
}
