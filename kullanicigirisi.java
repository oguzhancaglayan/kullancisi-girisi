import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {
        String userName,password,select;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("oguz") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");

        }else {
            System.out.println("yanlış şifre girdiniz şifrenizi sıfırlamk ister misiniz");
            select = input.nextLine();
            if (select.equals("evet")){
                System.out.print("Yeni şifre giriniz");
                password =input.nextLine();
                if(password.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                }else{
                    System.out.println("Şifre oluşturuldu");
                }

            }else {
                System.out.println("giriş başarısz olmuştur daha sonra tekrar deneyin");
            }


        }

    }
}
