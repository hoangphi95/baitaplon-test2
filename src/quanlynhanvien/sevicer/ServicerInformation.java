package quanlynhanvien.sevicer;

import quanlynhanvien.model.IfManager;
import quanlynhanvien.myfile.MyFile;

import java.io.Serializable;
import java.util.ArrayList;

public class ServicerInformation implements Serializable {
    MyFile mf=new MyFile();
    private static final String fileName="Infomation.txt";
    private static ArrayList<IfManager>list=new ArrayList<>();
    // Hàm thêm
    public void add(IfManager info){
            list.add(info);
            mf.output(list, fileName);

    }
    // Hàm sửa
    public void update(IfManager info) {
        try {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getID()==info.getID()) {
                    list.add(i,info);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(),e.getCause());

        }
    }
    // Hàm xem
    public ArrayList<IfManager> realAll() {
        list=(ArrayList<IfManager>) mf.input(fileName);
        return list;

    }
    // Hàm Xóa
    public void delete (IfManager info){
       for (int i=0;i< list.size();i++){
           if (list.get(i).getID()==info.getID()){
               list.add(info);
           }
        }
    }
    // Tìm nhân viên lâu năm trong công ty.
    public void longtimeEmpolyee(int a){
        realAll();
        for (int i=0;i< list.size();i++){
            if (list.get(i).getID()== a && list.get(i).getSeniority()>2 && list.get(i).getSeniority()<5){
                System.out.println("NV nhóm 2 (Thời gian làm từ 2-5 năm)");
            }else if (list.get(i).getID()== a && list.get(i).getSeniority()<2){
                System.out.println("NV nhóm 1 (Thời gian làm dưới 2 năm)");
            }else if (list.get(i).getID()== a && list.get(i).getSeniority()>=5 && list.get(i).getSeniority()<10){
                System.out.println("NV nhóm 3(THời gian làm từ 5-10 năm");
            }else {
                System.out.println("NV nhóm 4(THời gian làm trên 10 năm");
            }
        }
    }


}
