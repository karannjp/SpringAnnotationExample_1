package com.karan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("student")
public class Student {
private  String name;
//@Autowired
private CertificateStudent certificate;
private  String email;
Student(){

}


public  Student(CertificateStudent c){
    System.out.println("No-args Constractor  call");
   certificate=c;
    
}


//@Autowired
@Value("${name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
@Autowired
    public void setCertificate(CertificateStudent certificate) {
    System.out.println("Stter method will be call for Certificate");
     //certificate.certificate();
   // certificate=certificate;

    }
@Value("${email}")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    /*
    public CertificateStudent getCertificate() {
        return certificate;
    }
 */

public  void display(){
    certificate.certificate();
}

}
