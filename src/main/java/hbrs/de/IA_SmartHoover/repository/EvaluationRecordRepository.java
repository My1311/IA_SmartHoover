package hbrs.de.IA_SmartHoover.repository;

import com.mongodb.client.MongoDatabase;
import hbrs.de.IA_SmartHoover.model.EvaluationRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EvaluationRecordRepository extends MongoRepository<EvaluationRecord, Long> {
}
