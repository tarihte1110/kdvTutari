import java.util.Scanner;

public class pratik2 {
    public static void main(String[] args) {
        double fiyat, kdvOran = 0.18, kdvoran = 0.08;

        Scanner input = new Scanner(System.in);

        System.out.println("fiyat giriniz:");
        fiyat = input.nextDouble();
        {
            if (fiyat <= 1000) {
                double kdvTutar = fiyat * kdvOran;
                System.out.println("kdv tutarınız:");
                System.out.println(kdvTutar);

                double kdvliTutar = fiyat + kdvTutar;
                System.out.println("kdvli tutarınız:");
                System.out.println(kdvliTutar);
            } else  {
            double kdvTutar = fiyat * kdvoran;
            System.out.println("kdv tutarınız:");
            System.out.println(kdvTutar);

            double kdvliTutar = fiyat + kdvTutar;
            System.out.println("kdvli tutarınız:");
            System.out.println(kdvliTutar);
        }

        }


    }
}
