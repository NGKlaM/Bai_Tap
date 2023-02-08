package BaiTapDay2Month7;

import java.util.Scanner;

public class ChuoiKyTu {
    public static void main(String[] args) {
        String[] Kytu = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.println("Vui lòng nhập ký tự"+(i+1));
            Kytu[i]=sc.nextLine();
            if (!Kytu[i].matches("00[2-5]L\\d{4}")){
                System.out.println("Sai rồi !");
                return;
            }
        }
        System.out.println("Đúng rồi");
    }
}
