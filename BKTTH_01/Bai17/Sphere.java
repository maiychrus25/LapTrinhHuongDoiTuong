//Author: MAIY 07!!
package BKTTH_01.Bai17;

public class Sphere extends Circle {
	public Sphere () {}
	
	public Sphere(double radius) {
		super(radius);
	}
	
    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * this.radius; 
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2); 
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3); 
    }
    
    @Override
    public String toString() {
    	return super.toString() + "\nThe tich la: " + this.calculateVolume();
    }
}
