class Mamifero extends Animal{

  private Boolean possuiPelos;

  public Mamifero(String nome, String habitat, Boolean oviparo, Boolean possuiPelos) {
    super(nome, habitat, oviparo);
    this.possuiPelos = possuiPelos;
  }

  public Boolean getPossuiPelos() {
    return this.possuiPelos;
  }
  
  public String toString() {
    return "Nome: " + nome +
      " - Habitat: " + habitat +
      " - Ovíparo: " + oviparo +
      " - Possui pelos no corpo: " + possuiPelos;
  }
}