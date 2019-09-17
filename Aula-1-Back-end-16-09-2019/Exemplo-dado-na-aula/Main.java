
class Main {

    public static void main (String[] args) {
        System.out.println("oi java");
        String mensagem = "oi string";
        
        char sexo = 'F';
        int idade = 0;
        float peso = 8.5f;
        String salario = "20.000";
        boolean comiMuito = true;

        Integer idadeWrapper = 10;

        System.out.println(
            "mensagem: " + mensagem
            + " - Sexo: " + sexo
            + " - Idade: " + idade
            + " - Peso: " + peso
            + " - Salário: " + salario
            + " - Comi muito: " + comiMuito
        );

        String tamanhoCalcado = "44";
        int tamanhoCalcadoInt = Integer.parseInt(tamanhoCalcado);
        System.out.println(tamanhoCalcadoInt);

        Double salarioDouble = Double.parseDouble(salario);
        System.out.println(salarioDouble);

        if(tamanhoCalcadoInt < 38) {
            System.out.println("Você tem o pé pequeno");
        } else if (tamanhoCalcadoInt > 38 && tamanhoCalcadoInt <= 43) {
            System.out.println("Pé grande");
        } else {
            System.out.println("vc tem o pé gigantesco");
        }


        // == comparando endereço de memória
        // equals camparando valores
        String igual = new String("44");
        if (tamanhoCalcado.equals(igual)) {
            System.out.println("Passou aqui!");
        }

        Integer idadeAvo = new Integer(70);
        int idadeAvoInt = 70;
        if(idadeAvo.equals(idadeAvoInt)){
            System.err.println("idade do meu avo");
        }

        switch (idadeAvo) {
            case 70: System.out.println("não é tão velho");
                break;
            case 80: System.out.println("é mais ou menos velho");
                break;
            default: System.err.println("Avo muito velho");
                break;
        }
    }

}