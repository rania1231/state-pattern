package proxiad.rhamdi.gaspillage.patternstate.state;

import proxiad.rhamdi.gaspillage.patternstate.context.Avion;

public class EtatEnPiste extends State {

    public EtatEnPiste(Avion avion) {
        super(avion);
    }
    @Override
    public void executeSortirDuGarage() {
        System.out.println("Vous etes en piste, Impossible d'exécuter l'opération sortir du garage");
    }

    @Override
    public void executeEntrerAuGarage() {
        this.avion.setState(new EtatAuGarage(this.avion));
    }

    @Override
    public void executeDecoller() {

    }

    @Override
    public void executeAtterir() {

    }

    @Override
    public void executeDoActivity() {

    }
}
