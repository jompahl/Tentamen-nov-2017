package uppgift2;

public class TestUppgift2 {
    public static void main(String[] args) {

        //Skapar fordon
        Fordon fordon1 = new Fordon();
        Fordon fordon2 = new Fordon();
        Fordon fordon3 = new Fordon();
        Motorcykel motorcykel1 = new Motorcykel();

        //Sätter uppgifter för fordonen
        fordon1.setRegNr("ABC123");
        fordon1.setMarke("Volvo");
        fordon1.setArsmodell(99);
        fordon2.setRegNr("CBA123");
        fordon2.setMarke("SAAB");
        fordon2.setArsmodell(02);
        fordon3.setRegNr("ABC321");
        fordon3.setMarke("Huyndai");
        fordon3.setArsmodell(14);
        motorcykel1.setRegNr("BAB222");
        motorcykel1.setMarke("BMW");
        motorcykel1.setArsmodell(15);

        //Skapar ägare
        Agare agare1 = new Agare();
        Agare agare2 = new Agare();

        //Skapar register
        Register fordonsRegister = new Register();

        //Sätter uppgifter för ägarna
        agare1.setPnr("111");
        agare1.setNamn("Rolke af Sturup");
        agare2.setPnr("222");
        agare2.setNamn("Kristin af Kastrup");

        //Kopplar fordonen till registret
        fordonsRegister.laggTillFordon(fordon1);
        fordonsRegister.laggTillFordon(fordon2);
        fordonsRegister.laggTillFordon(fordon3);
        fordonsRegister.laggTillFordon(motorcykel1);

        //Kopplar fordon till ägarna
        fordon1.setAgare(agare1);
        fordon2.setAgare(agare1);
        fordon3.setAgare(agare2);
        motorcykel1.setAgare(agare2);

        fordonsRegister.skrivUtAgarensAllaFordon("111");

        //skriver ut alla bilar i registret och dess ägares namn
        for(Fordon tmpFordon : fordonsRegister.getFordonsRegister()) {
            System.out.println(tmpFordon.getRegNr() + " " + tmpFordon.getMarke() + " " + tmpFordon.getAgare().getNamn());
        }
     }
}
