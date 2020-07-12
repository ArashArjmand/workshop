package com.company.Controller;

import com.company.Model.Entity.PoshakEnti;
import com.company.Model.Servis.PoshakServ;

public class PoshakViewController {
    public String Name,Color,Id,Gheimat;
    public String Nameup,Colorup,Idup,Gheimatup;
    public String iddele;
    public void saveData(){
        try {

            PoshakServ.getInstance().save(new PoshakEnti().setName(Name).setColor(Color).setId(Id).setGheimat(Gheimat));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateData(){
        try {

            PoshakServ.getInstance().edit(new PoshakEnti().setName(Nameup).setColor(Colorup).setId(Idup).setGheimat(Gheimatup));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void DeleteData(){
        try {
            PoshakServ.getInstance().remove(iddele);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
