package proxiad.rhamdi.gaspillage.patternstate.context;


import proxiad.rhamdi.gaspillage.patternstate.state.EtatEnPiste;
import proxiad.rhamdi.gaspillage.patternstate.state.State;

public class AvionImpl implements Avion {
    private State state;

    //Pour que l'etat initial soit en piste , je veux lors de la creation du AvionImpl spécifier ceci
    public AvionImpl() {
        this.state = new EtatEnPiste(this);
    }
//pour pouvoir changer state
    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void sortirDuGarage() {
       state.executeSortirDuGarage();
    }

    @Override
    public void entrerAuGarage() {
        state.executeEntrerAuGarage();
    }

    @Override
    public void decoller() {
         state.executeDecoller();
    }

    @Override
    public void atterir() {
        state.executeAtterir();
    }

    @Override
    public void doActivity() {
        state.executeDoActivity();
    }
}
