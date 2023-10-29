package hbrs.de.IA_SmartHoover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stringtemplate.v4.compiler.CodeGenerator.region_return;

import java.util.List;
import java.util.Optional;

import hbrs.de.IA_SmartHoover.model.SalesMan;
import hbrs.de.IA_SmartHoover.repository.SalesManRepository;

@Service
public class SalesManService {

    private SalesManRepository salesManRepository;

    @Autowired
    public SalesManService(SalesManRepository salesManRepository){
        this.salesManRepository = salesManRepository;
    }

    public List<SalesMan> findAll(){
        return this.salesManRepository.findAll();
    }

    List<SalesMan> findByidToList(String id){

        return this.salesManRepository.findByidToList(id);
    }

    List<SalesMan> findByfirstNameToList(String firstName){
        return this.salesManRepository.findByfirstNameToList(firstName);
    }

    List<SalesMan> findBylastNameToList(String lastName){
        return this.salesManRepository.findBylastNameToList(lastName);
    }

    List<SalesMan> findByjobTitleToList(String jobTitel){
        return this.salesManRepository.findByjobTitleToList(jobTitel);
    }

    List<SalesMan> findBysubUnitToList(String subUnit){
        return this.salesManRepository.findBysubUnitToList(subUnit);
    }

    List<SalesMan> findBysupervisorToList(String supervisor){
        return this.salesManRepository.findBysupervisorToList(supervisor);
    }

    public void delete(String id) throws IllegalArgumentException { 
        this.salesManRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("SalesMan with Id: " + id + " not found!"));
        this.salesManRepository.deleteById(id);        
    }

    public SalesMan update(SalesMan salesMan, String id) throws IllegalArgumentException {
        SalesMan salesManToUpdate = this.salesManRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("SalesMan with Id: " + id + " not found!"));
        return null;
    }
}
