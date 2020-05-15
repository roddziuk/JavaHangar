
public abstract class Vehicle {
	//attributs	
private String brand;
private int kilometers;

	//constructeurs
 public Vehicle (String brand) {
	 this.brand = brand;
	 this.kilometers = 0;
 }
 	//setters 
 public void setBrand (String brand) {
	 this.brand = brand;
 }
 public void setKilometers (int kilometers) {
	 this.kilometers = kilometers;
 }
 	//getters
 public String getBrand () {
	 return this.brand;
 }
 public int getKilometers() {
	 return this.kilometers;
 }
 	//method
 public abstract String doStuff();
}
