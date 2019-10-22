package uppgift2;

import java.util.ArrayList;

public class Agare {
    private String pnr;
    private String namn;
    private ArrayList<Fordon> fordonsLista = new ArrayList<>();

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public ArrayList<Fordon> getFordonsLista() {
        return fordonsLista;
    }

    public void setFordonsLista(ArrayList<Fordon> fordonsLista) {
        this.fordonsLista = fordonsLista;
    }

    public void laggTillFordon(Fordon fordon) {
        fordonsLista.add(fordon);
    }

    public Fordon hittaFordon(String regNr) {
        for(Fordon tmpFordon : fordonsLista) {
            if(tmpFordon.getRegNr().equals(regNr)) {
                return tmpFordon;
            }
        }
        return null;
    }
}
