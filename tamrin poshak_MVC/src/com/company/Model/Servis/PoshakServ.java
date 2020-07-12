package com.company.Model.Servis;

import com.company.Model.Entity.PoshakEnti;
import com.company.Model.Repository.PoshakRepo;

public class PoshakServ {
    private static PoshakServ ourInstance = new PoshakServ();

    public static PoshakServ getInstance() {
        return ourInstance;
    }

    private PoshakServ() {
    }
    public void save(PoshakEnti poshakEnti){
        try (PoshakRepo poshakRepo=new PoshakRepo()){
            poshakRepo.insert(poshakEnti);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void edit(PoshakEnti poshakEnti){
        try (PoshakRepo poshakRepo=new PoshakRepo()){
            poshakRepo.update(poshakEnti);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void remove(String id)throws Exception{
        try (PoshakRepo poshakRepo=new PoshakRepo()){
            poshakRepo.delete(id);
        }
    }

}
