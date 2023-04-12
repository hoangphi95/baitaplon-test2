package quanlynhanvien.controller;

import quanlynhanvien.model.IfManager;
import quanlynhanvien.sevicer.ServicerInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ServicerInformation siv=new ServicerInformation();
    IfManager ifm=new IfManager();
    Scanner sc=new Scanner(System.in);
    public void xem(){
        ArrayList <IfManager> list=siv.realAll();
        for (int i=0;i< list.size();i++){
            System.out.println(list.toString());
        }
    }
    public void add(){
        try {
            System.out.println("Nhập Căn cước cống dân");
            ifm.setID(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập tên");
            ifm.setStaffName(sc.nextLine());
            System.out.println("Ngày sinh");
            ifm.setDateOfBirth(sc.nextLine());
            System.out.println("Học vấn");
            ifm.setAcademicLevel(sc.nextLine());
            System.out.println("tình trạng hôn nhân");
            ifm.setMaritalStatus(sc.nextLine());
            System.out.println("Nhập thâm niên");
            ifm.setSeniority(sc.nextInt());
            siv.add(ifm);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(),e.getCause());
        }
    }
    public void UpDate() {
        System.out.println("Nhập tên");
        ifm.setStaffName(sc.nextLine());
        System.out.println("Nhập mã nhân viên");
        int c = Integer.parseInt(sc.nextLine());
        ifm.setID(c);
        System.out.println("Ngày sinh");
        ifm.setDateOfBirth(sc.nextLine());
        System.out.println("Học vấn");
        ifm.setAcademicLevel(sc.nextLine());
        System.out.println("tình trạng hôn nhân");
        ifm.setMaritalStatus(sc.nextLine());
        System.out.println("Nhập thâm niên");
        ifm.setSeniority(sc.nextInt());
        siv.update(ifm);
    }

    public void delete() {
        System.out.println("Nhập mã nhân viên");
        ifm.setID(Integer.parseInt(sc.nextLine()));
        siv.delete(ifm);
    }

    public void longtimeEmpolyee() {
        System.out.println("Nhập mã nhân viên");
        int kt = sc.nextInt();
       siv.longtimeEmpolyee(kt);
    }
}
