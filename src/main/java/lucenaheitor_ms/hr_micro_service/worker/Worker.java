package lucenaheitor_ms.hr_micro_service.worker;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
@Entity(name = "Worker")
@Table(name = "worker")
@EqualsAndHashCode(of = "id")
public class Worker  implements Serializable {
    private  static  final long  serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double dailyIncome;

    public Worker() {
    }

    public Worker(Long id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }
}
