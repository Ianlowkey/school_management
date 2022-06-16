package za.ac.cput.schoolmanagement.service.name;

/*
 @Author: Vuyisa Nkangana
 This is Name Service Test case
 Student number : 218192215
 Due date: 18 June 2022
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.schoolmanagement.domain.lookup.Name;
import za.ac.cput.schoolmanagement.service.lookup.NameService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NameServiceImplTest {
    private final Name name = new Name.Builder()
            .setFirstName("Vuyisa")
            .setMiddleName("Olothando")
            .setLastName("Nkangana")
            .build();
    @Autowired
    private NameService service;

    @BeforeEach
    void setUp() {
    }


    @Test
    void save() {
        Name saved = service.save(name);
        assertNotNull(saved);
        System.out.println(saved);
    }

    @Test
    void tearDown() {
        service.delete(name);
    }

    @Test
    void read() {
       Name saved = service.save(name);
        Optional<Name> read = service.read(saved.getLastName());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(name, read.get())
        );
    }
    @Test
    void delete() {

    }


}