package hbrs.de.IA_SmartHoover.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import hbrs.de.IA_SmartHoover.model.SalesMan;
import java.util.List;

public interface SalesManRepository extends MongoRepository<SalesMan, String> {
    
    List<SalesMan> findByidToList(String id);

    List<SalesMan> findByfirstNameToList(String firstName);

    List<SalesMan> findBylastNameToList(String lastName);

    List<SalesMan> findByjobTitleToList(String jobTitel);

    List<SalesMan> findBysubUnitToList(String subUnit);

    List<SalesMan> findBysupervisorToList(String supervisor);

}
