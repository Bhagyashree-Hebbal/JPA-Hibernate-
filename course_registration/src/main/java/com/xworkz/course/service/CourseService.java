package com.xworkz.course.service;

import com.xworkz.course.dto.CourseDTO;
import com.xworkz.course.entity.CourseEntity;

import java.util.List;

public interface CourseService {
      String save(CourseDTO courseDTO);

      String getNameByEmailAndPassword(String email,String password);

//    List<CourseEntity> getAll(String name);

    String validateAndLogin(String email, String password);

}
