package pageObjects;

import org.junit.jupiter.api.Test;

public class StudentRegistrationFormTests {
    StudentRegistrationFormPage StudentRegistrationFormPage = new StudentRegistrationFormPage();

    @Test

    void successfulFillTest(){
        StudentRegistrationFormPage.openPage();
        StudentRegistrationFormPage.FillForm();
        StudentRegistrationFormPage.CheckData();

    }

}