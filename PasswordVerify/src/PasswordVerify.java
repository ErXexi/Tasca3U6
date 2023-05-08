public class PasswordVerify {
    private String password;
    private boolean isVerified = false;
    private String errorMessage = "";

    public PasswordVerify(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String passwordVerifier(){
        if(password.length()<8)errorMessage +=  "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator();
        if(!password.matches(".*\\d.*\\d.*")) errorMessage += "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator();
        if(!password.matches(".*[A-Z].*")) errorMessage += "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator();
        if(!password.matches(".*[!@#$%^&*()\\-=_+\\[\\]{};':\"\\\\|,.<>\\/?].*")){
            errorMessage +=  "La contrasenya ha de contenir almenys un caràcter especial";
        }
        if(errorMessage.equals("")) isVerified = true;
        String passBoolean = isVerified + ", " + errorMessage;
        return passBoolean;
    }
}