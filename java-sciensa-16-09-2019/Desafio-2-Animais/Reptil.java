class Reptil extends Animal{

  private Boolean ehEctotermicos;
  private Boolean possuiEscamas;
  public Reptil(String nome, String habitat, Boolean oviparo, Boolean ehEctotermicos, Boolean possuiEscamas) {
    super(nome, habitat, oviparo);
    this.ehEctotermicos = ehEctotermicos;
    this.possuiEscamas = possuiEscamas;
  }
  
  public Boolean getEhEctotermico() {
    return this.ehEctotermicos;
  }

  public Boolean getPossuiEscamas() {
    return this.possuiEscamas;
  }

  public String toString() {
    return "Nome: " + nome +
      " - Habitat: " + habitat +
      " - Ovíparo: " + oviparo +
      " - Equitotérmico: " + ehEctotermicos +
      " - Possui escamas no corpo: " + possuiEscamas;
  }
}