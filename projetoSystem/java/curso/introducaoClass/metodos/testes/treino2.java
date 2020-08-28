package metodos.testes;

public class treino2 {
    public String name;
    public int age;
    public String date;
    public String second_name;
    public String name_father;
    public String name_mother;
    public String name_brother;

    public void somador(){
        int number = 100;
        int cont = 0;

        while (cont < number) {
            cont++;
            System.out.println("My numbers of the 2 in 2: "+ (cont + 2));

        }
    }

    public void peaple(){
        String[][] name_person = {{"Erick", "Gabriel"}, {"Santos", "Fernandes"}};
        for (String[] name_type : name_person) {
            for (String type : name_type) {
                System.out.println("Types of the names: "+ type);
            }
        }
    }

}