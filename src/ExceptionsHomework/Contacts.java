package ExceptionsHomework;

import java.io.Serializable;

public class Contacts implements Serializable {
    private String surname;
    private String firstName;
    private String phoneNumber;
    private String type;

    static class Builder implements Serializable {
        private Contacts newContacts;

        public Builder() {
            newContacts = new Contacts();
        }

        public Builder surname(String surname) {
            newContacts.surname = surname;
            return this;
        }

        public Builder firstName(String firstName) {
            newContacts.firstName = firstName;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            newContacts.phoneNumber = phoneNumber;
            return this;
        }

        public Builder type(String type) {
            newContacts.type = type;
            return this;
        }

        public Contacts build() {
            return newContacts;
        }
    }

    String getSurname() {
        return surname;
    }

    String getFirstName() {
        return firstName;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    String getType() {
        return type;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Surname: " + surname + "; FirstName: " + firstName
                + "; PhoneNumber: " + phoneNumber + "; Type: " + type;
    }
}
