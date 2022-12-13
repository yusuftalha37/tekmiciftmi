import java.util.Scanner;
public class tekmiçiftmi {
    public static void main(String[] args) {
        int sayı;
        System.out.println("Lütfen Sayı Giriniz");
        Scanner input =new Scanner(System.in);
        sayı= input.nextInt();
        if (sayı %2==0){
            System.out.println("Sayı Çift Sayıdır");
        }else{
            System.out.println("Sayı Tek Sayıdır");
        }
    }
}
