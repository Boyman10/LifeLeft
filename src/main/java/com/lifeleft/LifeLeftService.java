package main.java.com.lifeleft;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.Year;

@WebService(serviceName = "LifeLeft")
public class LifeLeftService {

    private static final Integer LIFE_EXPECTED_MALE = 79;
    private static final Integer LIFE_EXPECTED_FEMALE = 85;

    String male = "MALE";
    String female = "FEMALE";

    Integer referenceLifeLeft = 0;

    @WebMethod
    public String yearsRemaining(String firstname, String sex, Integer yearOfBirth) {

        if (sex.equals(male))
            referenceLifeLeft = LIFE_EXPECTED_MALE;
        else referenceLifeLeft = LIFE_EXPECTED_FEMALE;

        Integer yearsRemaining = referenceLifeLeft - (Year.now().getValue()) + yearOfBirth;

        return "Hello " + firstname + " Only " + yearsRemaining + " years remaining in your life...";
    }
}
