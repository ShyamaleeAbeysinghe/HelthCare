package edu.icet.servise.impl;

import edu.icet.entity.AppoinmentEntity;
import edu.icet.model.Appoinment;
import edu.icet.reporsitory.AppoinmentReporsitory;
import edu.icet.servise.AppoinmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppoinmentServiceImpl implements AppoinmentService {
    final AppoinmentReporsitory reporsitory;
    final ModelMapper mapper;

    @Override
    public void addAppoinment(Appoinment appoinment) {
        reporsitory.save(mapper.map(appoinment, AppoinmentEntity.class));
    }
    @Override
    public Boolean deleteById(Integer id) {
        reporsitory.deleteById(id);
        return true;
    }
    @Override
    public List<Appoinment> getAll() {
        List<Appoinment> appoinmentList=new ArrayList<>();
       reporsitory.findAll().forEach(appoinmentEntity -> {
           appoinmentList.add(mapper.map(appoinmentEntity,Appoinment.class));
       });
       return appoinmentList;
    }
    @Override
    public Appoinment getAppoinmentById(Integer id) {
        return mapper.map(reporsitory.findById(id), Appoinment.class);
    }
    @Override
    public List<Appoinment> getAppoinmentByAdminId(Integer adminId) {
        List<Appoinment> appoinmentList=new ArrayList<>();
         reporsitory.findByAdminId(adminId).forEach(entity -> {
             appoinmentList.add(mapper.map(entity,Appoinment.class));
         });
         return appoinmentList;
    }
    @Override
    public List<Appoinment> getAppoinmentByPatientId(Integer patientId) {
        List<Appoinment> appoinmentList=new ArrayList<>();
        reporsitory.findByPatientId(patientId).forEach(appoinmentEntity -> {
            appoinmentList.add(mapper.map(appoinmentEntity,Appoinment.class));
        });
        return appoinmentList;
    }
    @Override
    public List<Appoinment> getAppoinmentByType(String type) {
        List<Appoinment> appoinmentList=new ArrayList<>();
        reporsitory.findByType(type).forEach(appoinmentEntity -> {
            appoinmentList.add(mapper.map(appoinmentEntity, Appoinment.class));
        });
        return appoinmentList;
    }
}
