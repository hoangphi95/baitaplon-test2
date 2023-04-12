package quanlynhanvien;

import quanlynhanvien.controller.Controller;
import quanlynhanvien.controller.ControllerHr;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ControllerHr cthr=new ControllerHr();
        Controller ct = new Controller();
        Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Nhập 1 để thêm thông tin nhân viên");
                System.out.println("Nhập 2 để xem thông tin nhân viên");
                System.out.println("Nhập 3 để sửa thông tin nhân viên");
                System.out.println("Nhập 4 để xóa thông tin nhân viên");
                System.out.println("Nhập 5 để tìm nhân viên lâu năm");
                System.out.println("Nhập 6 để thêm tt bảng lương");
                System.out.println("Nhập 7 để nhập ngày làm và ngày nghỉ");
                System.out.println("Nhập 8 để tính bảng lương");
                System.out.println("Nhập 9 để xem bảng lương");
                int chon = sc.nextInt();
                switch(chon) {
                    case 1:
                        ct.add();
                        break;
                    case 2:
                        ct.xem();
                        break;
                    case 3:
                        ct.UpDate();
                        break;
                    case 4:
                        ct.delete();
                        break;
                    case 5:
                        ct.longtimeEmpolyee();
                        break;
                    case 6:
                        cthr.add();
                        break;
                    case 7:
                        cthr.enterWorkDay();
                        break;
                    case 8:
                        cthr.payroll();
                        break;
                    case 9:
                        cthr.xem();
                        break;
                }
            }while (true);

    }
}
