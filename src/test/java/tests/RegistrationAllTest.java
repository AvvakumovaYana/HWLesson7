package tests;

import data.TestData;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationAllTest extends TestBase {

    private final RegistrationPage registrationPage = new RegistrationPage();
    private final TestData testData = new TestData();

    @Test
    void allFormFieldsTest() {
        registrationPage.openPage()
                .removeBanners()
                .setFistNameInput(testData.firstName)
                .setLastNameInput(testData.lastName)
                .setUserEmailInput(testData.userEmail)
                .setGenderInput(testData.gender)
                .setNumberInput(testData.number)
                .setBirthday(testData.date)
                .setSubjects(testData.subjects)
                .setHobbies(testData.hobbies)
                .setPicture(testData.picture)
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .clickSubmit()
                .checkTable(testData.firstName + " " + testData.lastName, testData.userEmail,
                        testData.gender, testData.number,
                        testData.date, testData.subjects,
                        testData.hobbies, testData.picture,
                        testData.address, testData.state + " " + testData.city);
    }

    @Test
    void mainFormFieldsTest() {
        registrationPage.openPage()
                .removeBanners()
                .setFistNameInput(testData.firstName)
                .setLastNameInput(testData.lastName)
                .setGenderInput(testData.gender)
                .setNumberInput(testData.number)
                .setBirthday(testData.date)
                .clickSubmit()
                .checkTable(testData.firstName + " " + testData.lastName, " ",
                        testData.gender, testData.number,
                        testData.date, " ",
                        " ", " ",
                        " ", " ");
    }

    @Test
    void negativeFormFieldsTest() {
        registrationPage.openPage()
                .removeBanners()
                .setLastNameInput(testData.lastName)
                .setGenderInput(testData.gender)
                .setNumberInput(testData.number)
                .setBirthday(testData.date)
                .clickSubmit()
                .checkTableNotVisible();
    }
}