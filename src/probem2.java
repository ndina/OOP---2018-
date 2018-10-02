public class probem2 {
    public static void main(String[] args){
        Shapes cube = new Cube(3);
        System.out.println("Volume of the cube is "  + cube.volume());
        System.out.println("Surface Area of the cube is "  + cube.surfaceArea());

        Shapes sphere = new Sphere(2);
        System.out.println("Volume of the sphere is "  + sphere.volume());
        System.out.println("Surface Area of the sphere is "  + sphere.surfaceArea());

        Shapes c = new Cylinder(3, 5);
        System.out.println("Volume of the cylinder is "  + c.volume());
        System.out.println("Surface Area of the cylinder is "  + c.surfaceArea());
    }
}
