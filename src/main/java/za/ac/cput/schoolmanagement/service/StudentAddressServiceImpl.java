/*
    StudentAddressServiceImpl.java
    StudentAddressServiceImpl for Student
    Student:Hlumelo Mpotulo
    Student Number: 215226348
    Due Date 09 June 2022
 */
package za.ac.cput.schoolmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.Student;
import za.ac.cput.schoolmanagement.repository.StudentAddressRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentAddressServiceImpl implements StudentAddress{

    @Autowired
    private StudentAddressRepository repository;
    private za.ac.cput.schoolmanagement.domain.StudentAddress StudentAddress;

    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        return (za.ac.cput.schoolmanagement.service.StudentAddress) this.repository.save(StudentAddress ,studentAddress);
    }

    @Override
    public Optional<za.ac.cput.schoolmanagement.service.StudentAddress> read(String s) {
        return Optional.empty();
    }

    @Override

    public za.ac.cput.schoolmanagement.domain.StudentAddress update(za.ac.cput.schoolmanagement.domain.StudentAddress studentAddress){
        return repository.save(studentAddress);
    }
    @Override
    public Optional<za.ac.cput.schoolmanagement.service.StudentAddress> read(Student.StudentId studentId) {
        return Optional.empty();
    }

    /**
     * @param studentAddress
     */
    @Override
    public void delete(za.ac.cput.schoolmanagement.service.StudentAddress studentAddress) {

        repository.deleteById(StudentAddress.getStudentId());
    }

     @Override
     public List<za.ac.cput.schoolmanagement.domain.StudentAddress> getAll(){
                     return repository.findAll();
    }
}

