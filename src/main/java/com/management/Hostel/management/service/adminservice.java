package com.management.Hostel.management.service;

import com.management.Hostel.management.Entity.Admin;
import com.management.Hostel.management.Repository.adminrepo;
import com.management.Hostel.management.model.Admindto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class adminservice {

    @Autowired
    adminrepo repo;
    @Autowired
            roomservice roomservice;
    List<Admin> user=new ArrayList<>();

    public String stored(){
        user.add(new Admin("Ravitha","A101",true,"stud"));
        user.add(new Admin("anitha","A101",true,"stud"));
        user.add(new Admin("swatha","A101",true,"stud"));
        repo.saveAll(user);
        return "it's created";
    }
    public Admindto add(Admindto model){
            Admin admin=new Admin();
            admin.setName(model.getName());
            admin.setRoomno(model.getRoomno());
            admin.setRole(model.getRole());
            admin.setIs_active(model.getIs_active());
            Admin val=repo.save(admin);
             roomservice.increase(val.getRoomno());
            Admindto adminmodel= new Admindto();
            adminmodel.setName(val.getName());
            adminmodel.setRoomno(val.getRoomno());
            adminmodel.setRole(val.getRole());
            adminmodel.setIs_active(val.getIs_active());
            return adminmodel;
    }

        public long count(String roomno){
        return repo.findAll()
                .stream()
                .filter(h->h.getRoomno().equals(roomno))
                .count();

        }
        public String deleted(Integer id){
        roomservice.deleted(id);
           repo.deleteById(id);

            return "successfully deleted";
        }
        public List<Admindto> getall(){
        List<Admin> val=repo.findAll();
        List<Admindto> dto=new ArrayList<>();
        for(Admin admin:val){
            Admindto admindto=new Admindto();
            admindto.setId(admin.getId());
            admindto.setRole(admin.getRole());
            admindto.setName(admin.getName());
            admindto.setRoomno(admindto.getRoomno());
            admindto.setIs_active(admindto.getIs_active());
            dto.add(admindto);
        }
            return dto;
        }
    }


