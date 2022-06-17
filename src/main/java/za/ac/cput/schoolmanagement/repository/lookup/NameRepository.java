package za.ac.cput.schoolmanagement.repository.lookup;

/*
 @Author: Vuyisa Nkangana
 This is Name Repository interface
 Student number : 218192215
 Due date: 18 June 2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.lookup.Name;
import java.util.List;

@Repository
public interface NameRepository extends JpaRepository <Name, String> {
    List<Name> findAll();
}
