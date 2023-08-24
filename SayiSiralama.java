import java.util.Scanner;
public class SayiSiralama {
    public  static void main(String[] args){
        int n1,n2,n3;

        Scanner input=new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1=input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2=input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        n3=input.nextInt();

        if(n1<n2) {
            if (n1 < n3) {
                if (n2 < n3) {
                    System.out.println("Küçükten büyüğe doğru sıralama: a<b<c");

                } else {
                    System.out.println("Küçükten büyüğe doğru sıralama: a<c<b");
                }
            } else if (n3 < n2) {
                System.out.println("Küçükten büyüğe doğru sıralama: c<a<b");
            }
        }else if(n2<n3){
            if(n1<n3){
                System.out.println("Küçükten büyüğe doğru sıralama: b<a<c");
            }else {
                System.out.println("Küçükten büyüğe doğru sıralama: b<c<a");
            }
        }else if(n3 < n1 ){
            System.out.println("Küçükten büyüğe doğru sıralama: c<b<a");
        }else{
            System.out.println("Sayıların hepsi eşittir:a=b=c");
        }

    }
}
