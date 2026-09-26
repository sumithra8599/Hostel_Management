package com.management.Hostel.management.service;

import com.management.Hostel.management.Entity.counting;
import com.management.Hostel.management.Repository.countrepo;
import com.management.Hostel.management.model.Admindto;
import com.management.Hostel.management.model.attendacedto;

import com.management.Hostel.management.model.countdto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class countservice {
    final adminservice adminservice;
    final attendanceservice service;
    final countrepo countrepo;
    public countservice(adminservice adminservice, attendanceservice service,countrepo countrepo) {
        this.adminservice = adminservice;
        this.service = service;
        this.countrepo=countrepo;
    }

    public List<counting> findit(){
         List<attendacedto> val=service.getattendace();
         List<Admindto> admins=adminservice.getall();

         List<counting> count=val.stream()
                 .filter(attent-> admins.stream()
                         .anyMatch(admin ->attent.getUsername().equals(admin.getName()
                                 )&& (attent.getId().equals(admin.getId()))

                         ))
                 .map(attent->{
                     counting counts=new counting();
                     counts.setRoomno(attent.getRoomno());
                     counts.setId(attent.getId());
                     counts.setName(attent.getUsername());
                     return counts;
                 })

                 .toList();

        return countrepo.saveAll(count);
    }
    public List<counting> absentpersons(){
        List<attendacedto> val=service.getattendace();
        List<Admindto> admins=adminservice.getall();

        List<counting> count=val.stream()
                .filter(absent-> admins.stream()
                        .noneMatch(admin ->absent.getUsername().equals(admin.getName()
                                )&& (absent.getId().equals(admin.getId()))

                        ))
                .map(absent->{
                    counting counting=new counting();
                    counting.setRoomno(absent.getRoomno());
                    counting.setId(absent.getId());
                    counting.setName(absent.getUsername());
                    return counting;
                })

                .toList();
            return count;
    }
}
