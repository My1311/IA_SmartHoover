package hbrs.de.IA_SmartHoover.control;

import hbrs.de.IA_SmartHoover.model.EvaluationRecord;
import hbrs.de.IA_SmartHoover.model.IEvaluationRecord;
import hbrs.de.IA_SmartHoover.model.ISalesMan;
import hbrs.de.IA_SmartHoover.model.SalesMan;
import hbrs.de.IA_SmartHoover.repository.EvaluationRecordRepository;
import hbrs.de.IA_SmartHoover.repository.SalesManRepository;
import org.jline.reader.LineReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ManagePersonal implements IManagePersonal {


    @Autowired
    private LineReader lineReader;
    @Autowired
    private SalesManRepository salesManRepository;
    @Autowired
    private EvaluationRecordRepository evaluationRecordRepository;
    @Override
    @ShellMethod(key = "create", value = "Create a new Salesman")
    public void createSalesMan(ISalesMan record) {

        String firstName = this.lineReader.readLine("firstName:");
        String lastName = this.lineReader.readLine("lastName:");
        Integer id = Integer.valueOf(this.lineReader.readLine("Id"));
        SalesMan salesMan = new SalesMan(firstName, lastName, id);
        try {
            if (this.salesManRepository.insert(salesMan) != null) {
                System.out.println(salesMan.toDocument());
            } else {
                throw new IllegalArgumentException("Falsche eingabe!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void addPerformanceReord(IEvaluationRecord record, int sid) {
        EvaluationRecord evaluationRecord = new EvaluationRecord();
        evaluationRecord.setCommentForRecord(this.lineReader.readLine("comment:"));
        try {
            if (this.evaluationRecordRepository.insert(evaluationRecord) != null) {
                System.out.println(evaluationRecord.toString());
            } else {
                throw new IllegalArgumentException("Falsche eingabe!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ISalesMan readSalesMan(int sid) {
        return null;
    }

    @Override
    public List<ISalesMan> querySalesMan(String attribute, String key) {
        return null;
    }

    @Override
    public IEvaluationRecord readEvaluationRecords(int sid) {
        return null;
    }
}
