package za.ac.cput.schoolmanagement.domain.lookup;
/*
 @Author: Vuyisa Nkangana
 This is a Name class
 Student number : 218192215
 Due date: 18 June 2022
 */
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    private Name(){

    }
    private Name(Name.Builder builder){
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public static class Builder{
        private String firstName, middleName, lastName;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Name.Builder copy (Name name) {
            this.firstName = name.firstName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;

            return this;

        }
        public Name build() {

            return new Name (this);
        }
    }
}

