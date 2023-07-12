import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {
        int km;
        double perKm=2.20, total, startPrice=10, minPrice=20;
        Scanner input =new Scanner(System.in);

        System.out.print("Enter The Distance in KM : ");
        km=input.nextInt();

        total= startPrice + (km*perKm);
        total=(total<minPrice)? minPrice : total;

        System.out.println("Ödenecek tutar : " + total);

    }
}