package Tp4.Thymeleaf.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import Tp4.Thymeleaf.Staff;
public interface StaffRepo extends JpaRepository<Staff,
        Integer> {
}
