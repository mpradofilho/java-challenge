public class App {

    public static String getEncryptedPassword(final String password) {

        final var sequence = "acdfgijloprtuvx";

        var encryptedPassword = "";

        for (int position = 0; position < password.length(); position++) {
            char character = password.charAt(position);

            var index = sequence.indexOf(character);
            if (index > 0) {
                encryptedPassword += String.valueOf(index);
            } else {
                encryptedPassword += character;
            }
        }
        return encryptedPassword;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(getEncryptedPassword("Luiza"));
        System.out.println(getEncryptedPassword("Florianópolis"));
        System.out.println(getEncryptedPassword("Everis"));
    }
    
}