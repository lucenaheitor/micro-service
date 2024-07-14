package lucenaheitor_ms.hr_micro_service.repository;

import lucenaheitor_ms.hr_micro_service.worker.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository  extends JpaRepository<Worker, Long> {
}
