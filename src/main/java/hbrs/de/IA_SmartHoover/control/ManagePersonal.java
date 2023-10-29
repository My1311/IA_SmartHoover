package hbrs.de.IA_SmartHoover.control;

import hbrs.de.IA_SmartHoover.model.IEvaluationRecord;
import hbrs.de.IA_SmartHoover.model.ISalesMan;
import hbrs.de.IA_SmartHoover.model.SalesMan;

import java.io.InputStream;
import java.util.List;

import org.jline.reader.LineReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.shell.standard.ShellMethod;

public class ManagePersonal implements IManagePersonal {

    @Lazy
    @Autowired
    private LineReader lineReader;

    @Override
    @ShellMethod(key = "create", value = "Create a new Salesman")
    public void createSalesMan(ISalesMan record) {
        SalesMan salesMan = new SalesMan();
        String firstName = this.lineReader.readLine("firstName:");
        String lastName = this.lineReader.readLine("lastName:");
        String jobTitle = this.lineReader.readLine("jobTitle");
        String subUnit = this.lineReader.readLine("subUnit");

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
