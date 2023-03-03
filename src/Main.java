import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the form : 1 - Parallelepiped\n" +
                "                             2 - Cylinder");
        int choose = scanner.nextInt();
        try {
            if (choose == 1) {
                System.out.println("Please enter length, height, width of parallelepiped ");
                double length = scanner.nextDouble();
                double height = scanner.nextDouble();
                double width = scanner.nextDouble();
                if (length <= 0 || width <= 0 || height <= 0) {
                    throw new Exception("Wrong sizes. Length, height,width must be positive");
                }
                Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                System.out.println("Parallelepiped's area: " + parallelepiped.getArea());
                System.out.println("Parallelepiped's volume: " + parallelepiped.getVolume());
            } else if (choose == 2) {
                System.out.println("Please enter radius and height of cylinder");
                double radius = scanner.nextDouble();
                double height = scanner.nextDouble();

                if (radius <= 0 || height <= 0) {
                    throw new Exception("Wrong sizes.Radius and height must be positive.");
                }
                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("Cylinder's area: " + cylinder.getArea());
                System.out.println("Cylinder's volume: " + cylinder.getVolume());
            } else {
                throw new Exception("Wrang choice. You can choose only: 1 or 2");
            }
        } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
