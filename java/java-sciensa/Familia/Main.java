import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    public static void main (String[] args) throws Exception {
        List<Filho> filhos = new ArrayList<>();
        filhos.add(new Filho("Filho 1"));// filhos.get(0)
        filhos.add(new Filho("Filho 2"));// filhos.get(1)
        filhos.add(new Filho("Filho 3"));// filhos.get(2)

        Pai pai = new Pai("Sciensa Pai");
        Familia familia = new Familia(pai, filhos);
        System.out.println(familia.getPai().getNome());
        System.out.println(familia.getPai().getSalario());

        // for (int indice = 0; indice < familia.getFilhos().size(); indice++) {
        //     Filho filho = familia.getFilhos().get(indice);
        //     System.out.println("Lista 1: " + filho.getNome());
        // }

        List<Filho> filhosBastardos = new ArrayList<>();
        for (Filho filho : familia.getFilhos()) {
            System.out.println("Lista 2: " + filho.getNome());
             if(filho.getNome().equals("filho 1") || filho.getNome().equals("filho 2")){
                   filhosBastardos.add(filho);
             }
        }
        familia.getFilhos().removeAll(filhosBastardos);
        System.out.println("===============Filhos e idade======================");


        // lambda
        familia.getFilhos().forEach(filho -> System.out.println(filho));
        System.out.println("================Sem filho 1=====================");

        // Set = colleção que não pode repetir
        List<Filho> filhosList = familia
            .getFilhos()
            .stream()
            .filter(filho -> !filho.getNome().equals("Filho 1"))
            .collect(Collectors.toList());   

        filhosList.forEach(filho -> System.out.println(filho.getNome()));

        // criando arquivo txt
        FileWriter fw = null;
        try {
            File file = new File("filhos.txt");
            fw = new FileWriter(file);

            for (Filho filho : filhosList) {
                fw.write(filho.toString() + "\n");
            }
        } catch(Exception exc) {
            exc.printStackTrace();
        } finally {
            fw.close();
        }


    }
}

class Familia {
    private Pai pai;
    private List<Filho> filhos = new ArrayList<>();

    public Familia(Pai pai, List<Filho> filhos) {
        this.pai = pai;
        this.filhos = filhos;
    }

    public Pai getPai() {
        return this.pai;
    }

    public void setPai(Pai pai) {
        this.pai = pai;
    }

    public List<Filho> getFilhos() {
        return this.filhos;
    }
}

class Pessoa {
    String nome;
    int idade;
    
    public String getNome() {
        return this.nome;
    }
}

class Filho extends Pessoa {

    public Filho(String nome){
        this.nome = nome;
    }

    public String toString() {
        return this.nome + " - " + this.idade;
    }
}

class Pai extends Pessoa {
    double salario = 60;

    public Pai (String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return this.salario;
    }

    public String toString() {
        return this.nome + " - " + this.idade + " - " + this.salario;
    }
}