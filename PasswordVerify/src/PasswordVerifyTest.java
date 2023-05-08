import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @Test
    public void emptyPass() {
        PasswordVerify pass = new PasswordVerify("");

        String resultadoEsperado = "false, La contrasenya ha de tenir almenys 8 caràcters" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys 2 números" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys una lletra majúscula" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holaPass() {
        PasswordVerify pass = new PasswordVerify("hola");

        String resultadoEsperado = "false, La contrasenya ha de tenir almenys 8 caràcters" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys 2 números" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys una lletra majúscula" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holacaracolaPass() {
        PasswordVerify pass = new PasswordVerify("holacaracola");

        String resultadoEsperado = "false, La contrasenya ha de contenir almenys 2 números" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys una lletra majúscula" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void hola12Pass() {
        PasswordVerify pass = new PasswordVerify("hola12");

        String resultadoEsperado = "false, La contrasenya ha de tenir almenys 8 caràcters" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys una lletra majúscula" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holAPass() {
        PasswordVerify pass = new PasswordVerify("holA");

        String resultadoEsperado = "false, La contrasenya ha de tenir almenys 8 caràcters" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys 2 números" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void hola2Pass() {
        PasswordVerify pass = new PasswordVerify("hola!");

        String resultadoEsperado = "false, La contrasenya ha de tenir almenys 8 caràcters" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys 2 números" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator();
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holaA2Pass() {
        PasswordVerify pass = new PasswordVerify("holaA!");

        String resultadoEsperado = "false, La contrasenya ha de tenir almenys 8 caràcters" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys 2 números" +
                System.lineSeparator();
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void hola122Pass() {
        PasswordVerify pass = new PasswordVerify("hola12!");

        String resultadoEsperado = "false, La contrasenya ha de tenir almenys 8 caràcters" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys una lletra majúscula" +
                System.lineSeparator();
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void hola12APass() {
        PasswordVerify pass = new PasswordVerify("hola12A");

        String resultadoEsperado = "false, La contrasenya ha de tenir almenys 8 caràcters" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holacaracola12Pass() {
        PasswordVerify pass = new PasswordVerify("holacaracola12");

        String resultadoEsperado = "false, La contrasenya ha de contenir almenys una lletra majúscula" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holacaracola2Pass() {
        PasswordVerify pass = new PasswordVerify("holacaracola!");

        String resultadoEsperado = "false, La contrasenya ha de contenir almenys 2 números" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator();
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holacaracolAPass() {
        PasswordVerify pass = new PasswordVerify("holacaracolA");

        String resultadoEsperado = "false, La contrasenya ha de contenir almenys 2 números" +
                System.lineSeparator() + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void ho12APass() {
        PasswordVerify pass = new PasswordVerify("ho12A!");

        String resultadoEsperado = "false, La contrasenya ha de tenir almenys 8 caràcters" +
                System.lineSeparator();
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holacaracolaAPass() {
        PasswordVerify pass = new PasswordVerify("holacaracolaA!");

        String resultadoEsperado = "false, La contrasenya ha de contenir almenys 2 números" +
                System.lineSeparator();
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holacaracola122Pass() {
        PasswordVerify pass = new PasswordVerify("holacaracola12!");

        String resultadoEsperado = "false, La contrasenya ha de contenir almenys una lletra majúscula" +
                System.lineSeparator();
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holacaracola12APass() {
        PasswordVerify pass = new PasswordVerify("holacaracola12A");

        String resultadoEsperado = "false, La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void holacaracola12A2Pass() {
        PasswordVerify pass = new PasswordVerify("holacaracola12A!");

        String resultadoEsperado = "true, ";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void pabloPass() {
        PasswordVerify pass = new PasswordVerify("#P4blit0cl4v0uncl4vit0#");

        String resultadoEsperado = "true, ";
        String resultadoReal = pass.passwordVerifier();

        assertEquals(resultadoEsperado, resultadoReal);
    }

}