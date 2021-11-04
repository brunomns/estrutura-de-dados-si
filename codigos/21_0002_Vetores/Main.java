class Main {

  public static int calcMedia(int val1, int val2, int val3) {

    int resultado = (int) (val1 + val2 + val3) / 3;
    return resultado;

  }

  public static void main(String[] args) {

    int v1;
    int v2;
    int v3;
    int media;

    v1 = 10;
    v2 = 20;
    v3 = 50;
    media = calcMedia(v1, v2, v3);

    System.out.println("v1: " + v1 + " v2: " + v2 + " v3: " + v3 + " média: " + media);

    Carro c1 = new Carro("Fiat", "Uno", 2008, 4);

    Carro c2 = new Carro("Ford", "Fiesta", 2019, 4);

    Carro c3 = new Carro("Volks", "Fusca", 1975, 2);

    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());




    int vetInt[ ] = new int[30];

    for (int i=0; i< vetInt.length; i++){
          vetInt[i] = i*2;
          System.out.print(vetInt[i]+" | ");
    }

// troca de valores

    for (int i=0; i<vetInt.length; i++){
          int posini = i;
          int posFim = vetInt.length - 1 - i;
          if (posFim <= posini)
                break;
          //troca de valores
          int aux = vetInt[posini];
          vetInt[posini] = vetInt[posFim];
          vetInt[posFim] = aux;

    }
    System.out.println("Troca de valores... ");
    for (int i=0; i< vetInt.length; i++){     System.out.print(vetInt[i]+" | ");
    }

  }
}
