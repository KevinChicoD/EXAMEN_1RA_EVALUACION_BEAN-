package contra;

public class Contra {

    public static void main(String[] args) {
        // TODO code application logic here
        Password contra = new Password();
        boolean result = contra.verificarAcceso("admin", "admin123");
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
}
