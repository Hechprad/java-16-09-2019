class Animal {
  
  //protected para que os filhos possam acessar os atributos
  protected String nome;
  protected String habitat;
  protected Boolean oviparo;

  public Animal(String nome, String habitat, Boolean oviparo){
    this.nome = nome;
    this.habitat = habitat;
    this.oviparo = oviparo;
  }

  public String getNome(){
    return this.nome;
  }

  public String getHabitat() {
    return this.habitat;
  }

  public Boolean getOviparo() {
    return this.oviparo;
  }

}