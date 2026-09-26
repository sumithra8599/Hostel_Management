package com.management.Hostel.management.service;

import com.management.Hostel.management.Entity.Attendance;
import com.management.Hostel.management.Entity.Login;
import com.management.Hostel.management.Repository.attendancerepo;
import com.management.Hostel.management.Repository.loginrepo;
import com.management.Hostel.management.config.securityconfig;
import com.management.Hostel.management.model.attendacedto;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class attendanceservice
{
    final PasswordEncoder passwordEncoder;
    final attendancerepo attendancerepo;
    final loginrepo loginrepo;

    public attendanceservice(PasswordEncoder passwordEncoder, attendancerepo attendancerepo, loginrepo loginrepo) {
        this.passwordEncoder = passwordEncoder;
        this.attendancerepo = attendancerepo;
        this.loginrepo = loginrepo;
    }
    @Scheduled(cron ="0 59 23 * * *")
    public void deleteattendancerecord(){
        attendancerepo.deletebydate(LocalDate.now());
    }

    public Attendance attendanceprocess(Integer id,String username,String roomno , String password) throws Exception {


        LocalTime now=LocalTime.now();
        LocalDate date=LocalDate.now();
        LocalTime deadline=LocalTime.of(10,30);
        Attendance attend=new Attendance();
        attend.setUsername(username);
        attend.setRoomno(roomno);
        attend.setId(id);
        attend.setTime(now);
        attend.setDate(date);
        if(now.isAfter(deadline)){
            attend.setStatus("false");
        }else{
            attend.setStatus("present");
        }

return attendancerepo.save(attend);

    }
    public List<attendacedto> getattendace(){
        List<Attendance> att=attendancerepo.findAll();
        List<attendacedto> attendancedtos= att.stream()
                .map(dto->{
                    attendacedto attendacedto=new attendacedto();
                    attendacedto.setId(dto.getId());
                    attendacedto.setUsername(dto.getUsername());
                    attendacedto.setRoomno(dto.getRoomno());
                        return attendacedto;
                })
                .toList();
        return attendancedtos;
    }
}
