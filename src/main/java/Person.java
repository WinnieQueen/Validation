public class Person {
    private String phoneNumber = "000-000-0000";
    private String name = "John Doe";

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("^(\\d{3})-(\\d{3})-(\\d{4})$")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Number was null or invalid format. Must follow ###-###-#### format.");
        }
    }
}
