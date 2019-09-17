import java.util.ArrayList;
import java.util.List;

class Main{
  public static void main(String[] args){
    List<Animal> animais = new ArrayList<>();
    
    animais.add(new Reptil("Lagarto", "Deserto", true, true, true));
    animais.add(new Reptil("Iguana", "Floresta Tropical", true, true, true));
    animais.add(new Mamifero("Gato", "Doméstico", false, true));
    animais.add(new Mamifero("Cachorro", "Doméstico", false, true));
    animais.add(new Insectoide("Arranha", "Jardim", true, 8));
    animais.add(new Insectoide("Formiga", "Jardim", true, 6));
  
    animais.forEach(animal -> System.out.println(animal));
  }
}