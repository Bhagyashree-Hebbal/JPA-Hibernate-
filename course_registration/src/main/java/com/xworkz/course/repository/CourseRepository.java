package com.xworkz.course.repository;

import com.xworkz.course.entity.CourseEntity;

import java.util.List;

public interface CourseRepository {
    boolean save(CourseEntity courseEntity);

    String getNameByEmailAndPassword(String email,String password);

    //List<CourseEntity> getAll(String name);

    CourseEntity findByPassword(String password);
}
