package Tp4.Thymeleaf.Service;
import java.util.List;
import Tp4.Thymeleaf.Entity.Staff;
public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}