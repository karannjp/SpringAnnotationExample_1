package com.karan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext con=new ClassPathXmlApplicationContext("appliocation-config.xml");
        Student s=con.getBean("student",Student.class);
      //  Student s1=con.getBean("id1",Student.class );
       // CertificateStudent c=con.getBean("certificateStudent",CertificateStudent.class);
      //  c.setCertificatec("Oscar certificate");
      // s.setName("karan");
        //s.display();
       //s.setCertificate(c);
        System.out.println(s.getName());
        System.out.println(s.getEmail());

       // System.out.println(s.getCertificate());


    }

}
