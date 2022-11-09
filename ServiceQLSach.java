/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import Entity.Sach;

/**
 *
 * @author lananh
 */
public class ServiceQLSach {
   ArrayList<Sach> listSach = new ArrayList<>();

     public ServiceQLSach() {
        listSach.add(new Sach("Doremon", "Tác Giả 1", 1, 2003));
        listSach.add(new Sach("yeu em tu cai nhin dau tien ", "Tác Giả 2", 2, 2002));
        listSach.add(new Sach("Doremon2", "Tác Giả 3", 1, 2021));

    }

    public ArrayList<Sach> getList() {
        return listSach;
    }

    public Boolean addSach(Sach sach) {
        if (sach == null) {
            return false;
        } else {
            listSach.add(sach);
            return true;
        }
    }
    }

