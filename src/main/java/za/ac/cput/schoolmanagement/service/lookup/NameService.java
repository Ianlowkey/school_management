/* NameService.java
   This is a Name Service Interface
   Author: Vuyisa Nkangana
   Student No: 218192215
   Due Date: 18 June 2022
 */
package za.ac.cput.schoolmanagement.service.lookup;

/*
 @Author: Vuyisa Nkangana
 This is Name Service Interface
 Student number : 218192215
 Due date: 18 June 2022
 */
import za.ac.cput.schoolmanagement.domain.lookup.Name;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;

public interface NameService extends IService<Name, String> {
    List<Name> findAll();
    void delete(String lastName);

}
