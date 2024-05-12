package data;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Locale;

public class TestData {
   private final Faker faker = new Faker(new Locale("en-GB"));
   public String firstName = faker.name().firstName();
   public String lastName = faker.name().lastName();
   public String userEmail = faker.internet().emailAddress();
   public String gender = faker.options().option("Male", "Female", "Other");
   public String number = faker.phoneNumber().subscriberNumber(10);
   public LocalDate date = faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
   public String subjects = faker.options().option("Maths", "Accounting", "Arts",
        "Social Studies", "Biology", "Physics", "Chemistry", "Computer Science", "Commerce", "Economics",
        "Civics", "Hindi", "English", "History");
   public String hobbies = faker.options().option("Sports", "Reading", "Music");
   public String picture = faker.options().option("Test1.png", "Test2.bmp", "Test3.jpg");
   public String address = faker.address().fullAddress();
   public String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
   public String city = getRandomCity();

   public String getRandomCity() {
      if (state.equals("NCR")) city = faker.options().option("Delhi", "Gurgaon", "Noida");
      if (state.equals("Uttar Pradesh")) city = faker.options().option("Agra", "Lucknow", "Merrut");
      if (state.equals("Haryana")) city = faker.options().option("Karnal", "Panipat");
      if (state.equals("Rajasthan")) city = faker.options().option("Jaipur", "Jaiselmer");
      return city;
   }
}
