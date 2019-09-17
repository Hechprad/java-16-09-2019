class Insectoide extends Animal{

  private int numeroDePatas;

  public Insectoide(String nome, String habitat, Boolean oviparo, int numeroDePatas) {
    super(nome, habitat, oviparo);
    this.numeroDePatas = numeroDePatas;
  }
  
  public int getNumeroDePatas() {
    return this.numeroDePatas;
  }

  public String toString() {
    return "Nome: " + nome +
      " - Habitat: " + habitat +
      " - Ovíparo: " + oviparo +
      " - Número de patas: " + numeroDePatas;
  }
  
}