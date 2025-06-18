package proxiad.rhamdi.gaspillage.patternstate.state;

import proxiad.rhamdi.gaspillage.patternstate.context.Avion;

public abstract class State {
    protected Avion avion;
    public State(Avion avion) {
        this.avion = avion;
    }
    abstract  public void executeSortirDuGarage();//les operation de transition d'un etat à un autre
    abstract public void executeEntrerAuGarage();
    abstract public void executeDecoller();
    abstract public void executeAtterir();
    abstract public void executeDoActivity();
}
