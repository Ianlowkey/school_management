package za.ac.cput.schoolmanagement.controller;
/*
 @Author: Lihle Njobe
 Student number : 218193882
 Country controller class
 Due date: 18 June 2022
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.domain.lookup.Country;
import za.ac.cput.schoolmanagement.service.lookup.CountryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/country")
@Slf4j

public class CountryController {

    private final CountryService countryService;

    @Autowired public CountryController(CountryService countryService) {

        this.countryService = countryService;
    }
    @PostMapping("save")
    public ResponseEntity<Country> save(@RequestBody Country country) {
        System.out.println(String.format("Save request: %s ", country));
        Country save = countryService.save(country);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<Country> read (@PathVariable String id) {
        System.out.println(String.format("Read request: %s ", id));
        Country country = this.countryService.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(country);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable String id) {
        System.out.println(String.format("Delete request: %s ", id));
        this.countryService.deleteById(id);
        return ResponseEntity.noContent().build();

    }
    @GetMapping("all")
    public ResponseEntity<List<Country>> getAll(String id) {
        List<Country> country = this.countryService.getAll(id);
        return ResponseEntity.ok(country);

    }

}
