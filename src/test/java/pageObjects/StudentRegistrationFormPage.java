
package pageObjects;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegistrationFormPage {


    String firstName = "Vasya",
            lastName = "Vasya",
            gender = "Male",
            email = "1@1.com",
            phone = "9119119119",
            birthDay = "5",
            birthMonth = "December",
            birthYear = "1900",
            birthСheck = "5 December,1900",
            subjects = "Arts",
            address = "Vasya",
            state = "NCR",
            city = "Delhi";


    public void openPage() {
        open("https://demoqa.com/automation-practice-form");

    }

    public void FillForm() {

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#userNumber").setValue(phone);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(birthMonth);
        $(".react-datepicker__year-select").selectOption(birthYear);
        $(String.format("[aria-label='Choose Wednesday, %s %sth, %s']", birthMonth, birthDay, birthYear)).click();
        $(byText(gender)).click();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#currentAddress").setValue(address);
        $("#subjectsInput").setValue("a");
        $(byText(subjects)).click();
        $("#uploadPicture").uploadFromClasspath("docs/test.txt");
        $("#react-select-3-input").setValue("n");
        $(byText(state)).click();
        $("#react-select-4-input").setValue("d");
        $(byText(city)).click();
        $("#submit").click();



    }

    public void CheckData() {

        $(".table-responsive").shouldHave(text("Vasya Vasya"),
                text(email),
                text(gender),
                text(phone),
                text(birthСheck),
                text(subjects),
                text("Sports, Reading, Music"),
                text("test.txt"),
                text(address),
                text(state + " " + city));

    }
}