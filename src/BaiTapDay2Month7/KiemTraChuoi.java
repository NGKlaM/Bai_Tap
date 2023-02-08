package BaiTapDay2Month7;

import java.util.Scanner;

public class KiemTraChuoi {
    public static void main(String[] args) {
        String chuoi;
        char kiTu;
        boolean tonTai = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào một chuỗi: ");
        chuoi = sc.nextLine();
        System.out.println("Mời bạn nhập vào ký tự muốn kiểm tra:");
        kiTu = sc.nextLine().charAt(0);

        char KiTu[] = chuoi.toCharArray();
        for (int i = 0; i < KiTu.length; i++)
        {
            if (kiTu == KiTu[i])
            {
                System.out.println((i+1));
                tonTai = true;
            }
        }
        if(tonTai == false)
            System.out.println("chuỗi ko tồn tại: ");
    }
}
