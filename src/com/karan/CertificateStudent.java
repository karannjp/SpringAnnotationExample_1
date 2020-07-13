package com.karan;

import org.springframework.stereotype.Component;

@Component
public class CertificateStudent {

    public  String certificate;

    CertificateStudent(){
        System.out.println("Certificatie object created ");

    }
    public void certificate(){
        System.out.println("Oscare certificate");

    }


    /*
    public void setCertificatec(String c){
        this.certificate=c;

    }

    public String getCertificate() {
        return certificate;
    }


 */
}

