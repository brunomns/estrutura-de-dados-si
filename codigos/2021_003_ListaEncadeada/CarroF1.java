public class CarroF1{

  String equipe;
  String fabricanteMotor;
  String pneus;
  String cores;
  String piloto1;
  String piloto2;
  float peso;

  public void cadastra(String eq, String fm, String pn, String cor, String p1, String p2, float pso){
    this.equipe = eq;
    this.fabricanteMotor = fm;
    this.cores = cor;
    this.piloto1 = p1;
    this.piloto2 = p2;
    this.peso = pso;
  }

  public String toString(){
    return "Equipe: "+this.equipe+" Fabricante: "+this.fabricanteMotor+" Pneus: "+this.pneus+" Cores: "+this.cores+" Piloto 1 : "+this.piloto1+" Piloto2 : "+this.piloto2+" Peso: "+this.peso;
  }

}
