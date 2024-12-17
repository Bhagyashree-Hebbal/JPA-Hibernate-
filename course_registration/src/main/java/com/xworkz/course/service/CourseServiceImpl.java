package com.xworkz.course.service;

import com.xworkz.course.dto.CourseDTO;
import com.xworkz.course.entity.CourseEntity;
import com.xworkz.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String save(CourseDTO dto) {

        System.out.println("data in serviceImpl===="+dto);

        boolean valid=true;
        if(dto!=null){
            String name=dto.getName();
            String email= dto.getEmail();
            int age= dto.getAge();
            String password=dto.getPassword();
            String confirmPassword=dto.getConfirmPassword();
            long phoneNumber=dto.getPhoneNo();
            String phone=String.valueOf(phoneNumber);

            if(name!=null && name.length()>=10){
                System.out.println("name is valid");

                if(email!=null && email.contains("@") && email.contains("gmail.com")){
                    System.out.println("email is valid");

                    if (age>18){
                        System.out.println("age is valid");
                        int specialCharCount=0;
                        for (char c : password.toCharArray()) {
                            if (!Character.isLetterOrDigit(c)) {
                                specialCharCount++;
                            }
                        }

                        if(password!=null && password.length()==9 && specialCharCount==2) {
                            System.out.println("password is valid");

                            if(confirmPassword.equals(password)){
                                System.out.println("confirm password is same as password");

                                if(phone.length()==10 && phone.startsWith("9")){
                                    System.out.println("valid phoneNumber");

                                    //String passwordEncoder = BCrypt.hashpw(rawPassword,BCrypt.gensalt());
                                    CourseEntity entity = new CourseEntity();
                                    entity.setName(dto.getName());
                                    entity.setAge(dto.getAge());
                                    entity.setEmail(dto.getEmail());
                                    entity.setPassword(passwordEncoder.encode(dto.getPassword()));
                                    System.out.println("password:"+passwordEncoder.encode(dto.getPassword()));
                                    //entity.setConfirmPassword(dto.getConfirmPassword());
                                    entity.setPhoneNo(dto.getPhoneNo());
                                    this.courseRepository.save(entity);
                                }
                                else {
                                    return "phone number must starts with 9";
                                }
                            }
                            else {
                                return "confirm password is not matching to password";
                            }
                        }
                        else{
                            return "password must contains 9 letters";
                        }
                    }
                    else {
                        return "age must be greater than 18";
                    }
                }
                else {
                    return "email must contains @Gmail.com";
                }
            }
            else{
                return "Name length must be greater than 10";
            }
        }
        return "SignUp is successfull";
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {
        String name=courseRepository.getNameByEmailAndPassword(email,password);
        return name;
    }

    @Override
    public String validateAndLogin(String email, String password) {
        CourseEntity courseEntity=courseRepository.findByPassword(password);
        if(courseEntity !=null){
            if(passwordEncoder.matches(password, courseEntity.getPassword())){
                return courseEntity.getName();
            }else{
                return "Invalid email or password";
            }
        }
        return "Invalid email or password";
    }

//    @Override
//    public List<CourseEntity> getAll(String name) {
//        List<CourseEntity> list= courseRepository.getAll(name);
//        return list;
//    }


}