public class Person {
    private String phoneNumber = "000-000-0000";

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("^(\\d{3})-(\\d{3})-(\\d{4})$")) {
            this.phoneNumber = phoneNumber;
        }
    }
}
