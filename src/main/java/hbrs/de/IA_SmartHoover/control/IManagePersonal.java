package hbrs.de.IA_SmartHoover.control;

import hbrs.de.IA_SmartHoover.model.IEvaluationRecord;
import hbrs.de.IA_SmartHoover.model.ISalesMan;

import java.util.List;

public interface IManagePersonal {

    public void createSalesMan( ISalesMan record );

    public void addPerformanceReord(IEvaluationRecord record , int sid );

    public ISalesMan readSalesMan( int sid );

    public List<ISalesMan> querySalesMan(String attribute , String key );

    public IEvaluationRecord readEvaluationRecords( int sid );

}
