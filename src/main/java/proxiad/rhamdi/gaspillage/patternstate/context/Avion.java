package proxiad.rhamdi.gaspillage.patternstate.context;

import proxiad.rhamdi.gaspillage.patternstate.state.State;

public interface Avion {
    void setState(State state);
    void sortirDuGarage();//les operation de transition d'un etat à un autre
    void entrerAuGarage();
    void decoller();
    void atterir();
    void doActivity();

}
