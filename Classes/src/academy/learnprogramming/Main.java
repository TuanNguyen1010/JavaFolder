package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car mercedes = new Car();
	    porsche.setModel("Carrera");
		System.out.println("Model is " + porsche.getModel());;
		porsche.setModel("Boxster");
		System.out.println("Model is " + porsche.getModel());
		mercedes.setModel("A class");
		System.out.println("Model is " + mercedes.getModel());
    }
}
