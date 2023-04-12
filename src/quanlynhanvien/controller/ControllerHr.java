package quanlynhanvien.controller;

import quanlynhanvien.model.HrTimeManagement;
import quanlynhanvien.model.IfManager;
import quanlynhanvien.sevicer.ServiecerHR;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerHr {
    ServiecerHR serviecerHR = new ServiecerHR();
    HrTimeManagement hr=new HrTimeManagement();
    Scanner sc=new Scanner(System.in);

    public void add() {
        System.out.println("Nhập vào tên nhân viên");
        hr.setStaffName(sc.nextLine());
        System.out.println("Nhập vào mã  nhân viên");
        hr.setID(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập vào tiền lương 1 ngày");
        hr.setSalaryByDay(Integer.parseInt(sc.nextLine()));
        serviecerHR.Add(hr);
    }

    public void enterWorkDay() {
        System.out.println("Nhập mã nhân viên");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số ngày đi làm");
        int wk=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số ngày nghỉ làm");
        int dof=Integer.parseInt(sc.nextLine());
        serviecerHR.EnterWorkDay(wk,dof,id);
    }

    public void payroll() {
        System.out.println("Nhập vào mã  nhân viên");
        int id= sc.nextInt();
        int sum = serviecerHR.payRoll(id);
        hr.setMonthySalary(sum);
        System.out.println(sum);
    }
    public void xem(){
        ArrayList<HrTimeManagement> list=serviecerHR.realAll();
        for (int i=0;i< list.size();i++){
            System.out.println(list.toString());
        }
    }
}
