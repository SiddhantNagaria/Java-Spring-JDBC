package com.springcore;

import com.springcore.dao.StudentDAO;
import com.springcore.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("My program started");

//        Spring jdbc -> jdbcTemplate
        ApplicationContext con = new AnnotationConfigApplicationContext(JdbcConfig.class);

        StudentDAO temp = con.getBean("studentDao", StudentDAO.class);

        Student s = new Student();

        //INSERT
//        s.setId(103);
//        s.setName("Rahul Soni");
//        s.setCity("Delhi");
//        int result = temp.insert(s);
//        System.out.println("student added  : " + result);

        //UPDATE
//        s.setId(105);
//        s.setName("rohit kumar");
//        s.setCity("noida");
//        int res= temp.update(s);
//        System.out.println("rows updated : "+ res);

        //DELETE
//        int res= temp.delete(105);
//        System.out.println("student deleted : " + res);

        //SELECT BY ID
        s = temp.getStudent(103);
        System.out.println(s);
    }
}
