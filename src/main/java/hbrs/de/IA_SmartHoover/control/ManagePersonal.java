package hbrs.de.IA_SmartHoover.control;

import hbrs.de.IA_SmartHoover.model.IEvaluationRecord;
import hbrs.de.IA_SmartHoover.model.ISalesMan;
import hbrs.de.IA_SmartHoover.model.SalesMan;

import java.io.InputStream;
import java.util.List;

import org.jline.reader.LineReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Controller;

@Controller
public class ManagePersonal implements IManagePersonal {


    @Autowired
    private LineReader lineReader;

    @Override
    @ShellMethod(key = "create", value = "Create a new Salesman")
    public void createSalesMan(ISalesMan record) {

        String firstName = this.lineReader.readLine("firstName:");
        String lastName = this.lineReader.readLine("lastName:");
        Integer id = Integer.valueOf(this.lineReader.readLine("Id"));
        SalesMan salesMan = new SalesMan(firstName, lastName, id);
        System.out.println(salesMan.toDocument());

    }

    @Override
    public void addPerformanceReord(IEvaluationRecord record, int sid) {

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
