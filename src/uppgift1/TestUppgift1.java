package uppgift1;

public class TestUppgift1 {

    public static void main(String[] args) {
        Parrot polly = new Parrot();
        Dog snoppy = new Dog();

        snoppy.beQuiet();
        snoppy.talk();
        snoppy.beNoisy();
        snoppy.talk();
        polly.talk();
        polly.learn("Polly want a cracker");
        polly.talk();
        snoppy.setName("Polly");
        polly.whatsYourName();
        snoppy.whatsYourName();
    }
}
