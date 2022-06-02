package baitap.validatePhoneNumber;

public class Test {
    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidNumber = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String phone : validPhoneNumber) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println(phone + "is valid " + isValid);
        }

        for (String phone : invalidNumber) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println(phone + "is valid " + isValid);
        }
    }
}
