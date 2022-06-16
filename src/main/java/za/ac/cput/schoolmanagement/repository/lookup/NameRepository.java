package za.ac.cput.schoolmanagement.repository.lookup;

/*
 @Author: Vuyisa Nkangana
 This is Name Repository interface
 Student number : 218193882
 Due date: 18 June 2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.schoolmanagement.domain.Name;
import java.util.List;

public interface NameRepository extends JpaRepository <Name, String> {
    List<Name> findAll();
}
