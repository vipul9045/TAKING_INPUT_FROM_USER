import java.util.Scanner;
public class PercentageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of first subject");
        int sub_1 = sc.nextInt();
        System.out.println("enter marks of second subject");
        int sub_2 = sc.nextInt();
        System.out.println("enter third subject marks");
        int sub_3 = sc.nextInt();
        int total = sub_1+sub_2+sub_3;
        System.out.println("your total marks" + " " + total);
        int Percentage_Marks = (total*100)/300;
        System.out.println("percentage" + " " + Percentage_Marks);
        
    }
}
