import java.util.Scanner;
class Kalkulator{
    static Scanner san = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("|       PROGRAM KALKULATOR      |");
        System.out.println("---------------------------------");
        System.out.println("Operator\nx = Kali\n/ = Bagi\n+ = Tambah\n- = Kurang\n% = Modulo\na = akar\n^ = pangkat\ns = 1/x" );
        System.out.print("---------------------------------\nex: \n4 x 4 (enter)\n> 16\n");
        System.out.println("---------------------------------");
        while(true){   
            try{
                System.out.print("| ");
                double num1 = san.nextDouble();
                String opr = san.next();
                double num2 = !opr.equals("a")&&!opr.equals("s")?san.nextDouble():0;
                switch (opr){
                    case "x":
                        num1 = num1*num2;
                        break;
                    case "/":
                        num1 = num1/num2;
                        break;
                    case "+":
                        num1 = num1+num2;
                        break;
                    case "-":
                        num1 = num1-num2;
                        break;
                    case "a":
                        num1 = Math.sqrt(num1);
                        break;
                    case "^":
                        num1 = Math.pow(num1, num2);
                        break;
                    case "%":
                        num1 = num1%num2;
                        break;
                    case "s":
                        num1 = 1.0/num1;
                        break;
                    default:
                        System.out.println("input not valid");
                        break;
                }  
                System.out.printf("| %.3f \n",num1);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
                    
        }
    }
}