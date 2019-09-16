import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main (String[] args) throws Exception {
        
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Honda", "cit", "preto", 2019));
        carros.add(new Carro("Toyota", "Corola", "cinza", 2019));
        carros.add(new Carro("Honda", "cit", "prata", 2019));
        carros.add(new Carro("Toyota", "Corola", "azul", 2019));
        carros.add(new Carro("Honda", "cit", "azul", 2019));
        
        LojaDeCarros loja1 = new LojaDeCarros("Loja Sciensa", 
        "999.999.999-99", "Rua Augusta 2840", 989898, "(11)1234-5678", carros);

        System.out.println(loja1);
        System.out.println("---------------------------");
        loja1.getCarros().forEach(carro -> System.out.println(carro));
        System.out.println("---------------------------");

        List<Carro> carrosAzuis = new ArrayList<>();
        for (Carro carro : loja1.getCarros()) {
             if(carro.getCor().equals("azul")){
                   carrosAzuis.add(carro);
             }
        }
        loja1.getCarros().removeAll(carrosAzuis);
        loja1.getCarros().forEach(carro -> System.out.println(carro));
        System.out.println("========================================");

        FileWriter fw = null;
        try {
            File file = new File("carros.txt");
            fw = new FileWriter(file);

            fw.write(loja1.toString());
            fw.write("--------------------------------------------------------------------------"+"\n");
            for (Carro carro : loja1.getCarros()) {
                fw.write(carro.toString() + "\n");
            }
        } catch(Exception exc) {
            exc.printStackTrace();
        } finally {
            fw.close();
        }

    }
}

class LojaDeCarros {
    private String nome; 
    private String CNPJ;
    private String logradouro;
    private int numero;
    private String telefone;
    private List<Carro> carros;

    public List<Carro> getCarros(){
        return this.carros;
    }
    public void setCarros(List<Carro> carros){
        this.carros = carros;
    }

    public LojaDeCarros(
        String nome, 
        String CNPJ, 
        String logradouro,
        int numero,
        String telefone,
        List<Carro> carros){
    
    this.nome = nome;
    this.CNPJ = CNPJ;
    this.logradouro = logradouro;
    this.numero = numero;
    this.telefone = telefone;
    this.carros = carros;

    }

    public String toString() {
        return "Nome: " + nome +
            " - CNPJ: " + CNPJ +
            " - Logradouro: " + logradouro +
            " - Número: " + numero +
            " - Telefone: " + telefone +
            "\n";
    }
}

class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String marca, String modelo, String cor, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getCor(){
        return this.cor;
    }

    public String toString() {
        return "Marca: " + marca + " - Modelo: " + modelo + " - Ano: " + ano + " - Cor: " + cor;
    }
}

