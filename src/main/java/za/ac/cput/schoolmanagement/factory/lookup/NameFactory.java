package za.ac.cput.schoolmanagement.factory.lookup;

/*
 @Author: Vuyisa Nkangana
 This is Name Factory
 Student number: 218192215
 Due date: 18 June 2022
 */

import za.ac.cput.schoolmanagement.domain.lookup.Name;
import za.ac.cput.schoolmanagement.helper.Helper;

public class NameFactory {
    public static Name createName(String firstName, String middleName, String lastName) {
        if (Helper.isNullOrEmpty(lastName))
            return null;

        Name name = new Name.Builder()
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
        return name;
    }
}
