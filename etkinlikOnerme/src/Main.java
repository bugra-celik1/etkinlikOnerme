import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temperature;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz:");
        temperature = inp.nextInt();

        if(temperature < 5 ){
            System.out.println("Kayağa gidebilirsiniz.");
        }

        else if(temperature <= 25){
            if( temperature <= 15 && temperature >= 10){
                System.out.println("Sinema veya pikniğe gidebilirsiniz");
            }else if( temperature >= 15){
                System.out.println("Pikniğe gidebilirsiniz.");
            }else{
                System.out.println("Sinemaya gidebilirsiniz");
            }

        }

        else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}