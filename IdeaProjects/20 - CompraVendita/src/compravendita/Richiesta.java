package compravendita;

public class Richiesta {
    private int iIdProdotto;
    private int iQuantita;
    private long lTimestamp;

    public Richiesta(int iIdProdotto) {
        setId(iIdProdotto);
    }

    public Richiesta(int iIdProdotto, int iQuantita){
        setId(iIdProdotto);
        setQuantita(iQuantita);
        lTimestamp = System.currentTimeMillis();
    }

    public int getQuantita() {
        return iQuantita;
    }

    public void setQuantita(int iQuantita) {
        this.iQuantita = iQuantita;
    }

    public int getId() {
        return iIdProdotto;
    }

    public void setId(int iId) {
        this.iIdProdotto = iId;
    }

    public long getTimestamp() {
        return lTimestamp;
    }

    @Override
    public boolean equals(Object oObject) {
        if(!(oObject instanceof Richiesta oRichiesta))
            return false;

        if(this == oObject)
            return true;

        return iIdProdotto == oRichiesta.getId() && iQuantita == oRichiesta.getQuantita() ;
    }
}
