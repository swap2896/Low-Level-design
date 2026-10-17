public class DocProxy implements IDocReader{

    IDocReader pdfReader;
    passwordValidator pwdvalidator =  new passwordValidator();
    @Override
    public String unlockPDF(String password) {
        if(pwdvalidator.isPasswordCorrect(password)) {
            pdfReader = new BackendPdfReader();
            return pdfReader.unlockPDF(password);
        } else {
            return "Incorrect password. Cannot unlock PDF";
        }
    }
}
