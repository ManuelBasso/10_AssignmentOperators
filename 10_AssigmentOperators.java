//Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore 
//scelto da te e le moltiplichi fra di loro.
//Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.

public class Main {
    public static void main (String[] args){
    int first = 2;
    int second = 1;
    System.out.println("Risultato : " + addAndMult (first, second));
}

static int addAndMult (int a ,int  b) {
    a+=3;
    b+=1;
    return a*b;
}
}
