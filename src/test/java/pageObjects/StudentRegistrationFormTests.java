package pageObjects;

import org.junit.jupiter.api.Test;

public class StudentRegistrationFormTests {
    StudentRegistrationFormPage studentRegistrationFormPage = new StudentRegistrationFormPage();

    @Test
    void successfulFillTest() {
        studentRegistrationFormPage.openPage();
        studentRegistrationFormPage.fillForm();
        studentRegistrationFormPage.checkData();

    }

}