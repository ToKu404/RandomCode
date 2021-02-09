import java.util.Scanner;
class AreaOfaCircle{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        Double R = san.nextDouble();
        Double end = R*R*3.14159;
        System.out.println(String.format("A=%.4f", end));
    }
}