package capitulo5;

public class AutoPolicy {

    private int accountNumber; // número da conta de apólice
    private String makeAndModel; // carro ao qual a apólice é aplicada
    private String state; // abreviatura do estado com duas letras

    // contrutor
    public AutoPolicy(int accountNumber, String makeAndModel, String state){

        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    //define o accountNumber
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    // retorna o accountNumber
    public int getAccountNumber(){
        return accountNumber;
    }

    // configura o makeModel
    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }

    // retorna o makeModel
    public String getMakeAndModel(){
        return makeAndModel;
    }

    // define o estado
    public void setState(String state){
        this.state = state;
    }

    // retorna o estado
    public String getState(){
        return state;
    }

    // método predicado é retornado se o estado tem seguros "sem culpas"
    public boolean isNoFaultState(){
        boolean noFaultState;

        // determina se o estado tem seguros de automovel sem culpa
        switch (getState()){

            // obtém a abreviatura do estado do obejto AutoPolicy

            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;

    }
}
