module greatlearning {package com.greatlearning.Service;

import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService  {

    public char[] generatePassword(){
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "123456789";
        String specialCharacters = "!@#$%^&*_=+-?/.<>)";
        String values = capitalLetters + smallLetters + numbers + specialCharacters;
        Random random = new Random();
        char[] password = new char[8];
        for (int i = 0; i < 8; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));

        }
        return password;
    }

    public String generateEmailAddress(String firstName, String lastName, String department){

        return firstName + lastName + "@" + department + ".abc.com";


    }

    void showCredential ( Employee employee,String email, char [] generatedPassword) {
        System.out.println("Dear " + employee.getLastName() + " your generated credentials are as follows" );
        System.out.println( "Email--> " + email);
        System.out.println("password is " + generatedPassword);


    }
}