public class Carro{

  String marca;
  String modelo;
  int anoF;
  int numPortas;

  //Construtor
  public Carro(String mar, String mod, int ano, int portas){

    this.marca = mar;
    this.modelo = mod;
    this.anoF = ano;
    this.numPortas = portas;

  }


  public String toString(){
    return "Marca: "+marca+"\n Modelo: "+modelo+"\n Ano: "+anoF+"\n NumPortas: "+numPortas;
  }


}
