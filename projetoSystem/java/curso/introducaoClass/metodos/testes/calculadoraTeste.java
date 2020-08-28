package metodos.testes;

import metodos.classes.calculadora;

public class calculadoraTeste{
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.printandoArray();
        System.out.println("continuando a exe.");
    }
}