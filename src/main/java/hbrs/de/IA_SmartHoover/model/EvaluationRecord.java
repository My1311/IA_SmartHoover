package hbrs.de.IA_SmartHoover.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class EvaluationRecord implements IEvaluationRecord{

    @Id
    @GeneratedValue
    private Long id;
    private String commentForRecord;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
