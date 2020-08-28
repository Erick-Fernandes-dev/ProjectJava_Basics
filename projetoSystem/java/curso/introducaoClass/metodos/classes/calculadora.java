package metodos.classes;

public class calculadora{
    public void somaDoisNumeros(){
        System.out.println(5+5);

    }
    public void subtraiDoisNumeros(){
        System.out.println(10 - 5);
    }
    public void printandoArray(){
        String[] nome = new String[3];
        nome[0] = "Erick";
        nome[1] = "Jose";
        nome[2] = "julio";

        for (String arr : nome) {
            System.out.println(arr);

          }


    }

}