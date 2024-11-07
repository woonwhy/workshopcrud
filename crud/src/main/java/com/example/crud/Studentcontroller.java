package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class Studentcontroller {

    @Autowired
    private StudentRespository StudentRespository;  // ใช้ StudentRepository แทน StudentRespository

    // ดึงข้อมูลทั้งหมดของ student
    @GetMapping
    public List<Student> getAllStudents() {
        return StudentRespository.findAll();  // เรียกใช้งาน findAll() จาก StudentRepository
    }

    // สร้าง student ใหม่
    @PostMapping("/add")
    public Student createStudent(@RequestBody Student student) {
        return StudentRespository.save(student);  // ใช้ save() เพื่อบันทึก student ใหม่
    }
}