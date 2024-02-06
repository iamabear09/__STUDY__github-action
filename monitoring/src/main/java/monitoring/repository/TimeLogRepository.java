package monitoring.repository;

import monitoring.domain.TimeLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TimeLogRepository extends JpaRepository<TimeLog, Long> {

    List<TimeLog> findByRecordId(Long recordId);

    List<TimeLog> findByDate(LocalDate date);

}
