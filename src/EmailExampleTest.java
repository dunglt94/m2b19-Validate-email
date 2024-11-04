public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"abcdef@gmail.com", "1234ab@yahoo.com", "abc11D@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"1b123@gmail.com, @gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        for (String email : invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}
