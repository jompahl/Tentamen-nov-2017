package uppgift2;

import java.util.ArrayList;

public class Register {
    private ArrayList<Fordon> fordonsRegister = new ArrayList<>();

    public ArrayList<Fordon> getFordonsRegister() {
        return fordonsRegister;
    }

    public void setFordonsRegister(ArrayList<Fordon> fordonsRegister) {
        this.fordonsRegister = fordonsRegister;
    }

    public void laggTillFordon(Fordon fordon) {
        fordonsRegister.add(fordon);
    }

    public Fordon hittaFordon(String regNr) {
        for(Fordon tmpFordon : fordonsRegister) {
            if(tmpFordon.getRegNr().equals(regNr)) {
                return tmpFordon;
            }
        }
        return null;
    }

    public void skrivUtAgarensAllaFordon(String pnr) {
        for(Fordon tmpFordon : fordonsRegister) {
            if(tmpFordon.getAgare().getPnr().equals(pnr)) {
                System.out.println("RegNr: " + tmpFordon.getRegNr() + " Märke: " + tmpFordon.getMarke());
            }
        }
    }
}
