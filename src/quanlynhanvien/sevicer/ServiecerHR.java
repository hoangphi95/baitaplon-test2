package quanlynhanvien.sevicer;

import quanlynhanvien.model.HrTimeManagement;
import quanlynhanvien.myfile.MyFile;
import quanlynhanvien.myfile.MyFileHr;

import java.io.Serializable;
import java.util.ArrayList;

public class ServiecerHR implements Serializable {
    HrTimeManagement hrT=new HrTimeManagement();
    private static ArrayList<HrTimeManagement>list=new ArrayList<>();
    private static String fileName="HR.txt";
    MyFileHr mfhr=new MyFileHr();
    public void Add(HrTimeManagement hrT){
        list.add(hrT);
        mfhr.output(list,fileName);
    }
    public ArrayList<HrTimeManagement> realAll(){
        list=(ArrayList<HrTimeManagement>) mfhr.input(fileName);
        return list;
    }
    public void EnterWorkDay(int wk,int Do,int id) {
        for(int i = 0; i < list.size(); ++i) {
            if (list.get(i).getID() == id) {
                list.get(i).setWorkDay(wk);
                list.get(i).setDayOff(Do);
            System.out.println(list.get(i).toString());
                break;
            }
        }

    }

    public int payRoll(int id) {
        realAll();
        int sum = 0;
        for(int i = 0; i < list.size(); ++i) {
            if (list.get(i).getID() == id && list.get(i).getWorkDay() == 24) {
                sum = list.get(i).getSalaryByDay() * list.get(i).getWorkDay() + list.get(i).getSalaryByDay();
            } else if (list.get(i).getID() == id && list.get(i).getWorkDay() < 24 && list.get(i).getWorkDay() > 18) {
                sum = list.get(i).getSalaryByDay() * list.get(i).getWorkDay();
            } else if (list.get(i).getID() == id && list.get(i).getWorkDay() < 18) {
                sum = list.get(i).getSalaryByDay() * list.get(i).getWorkDay() - list.get(i).getSalaryByDay();
            }
        }

        return sum;
    }

    public void EnterPayRoll(HrTimeManagement hrT) {
        for(int i = 0; i < list.size(); ++i) {
            if (((HrTimeManagement)list.get(i)).getID() == hrT.getID()) {
                list.add(hrT);
                break;
            }
        }

    }
}
