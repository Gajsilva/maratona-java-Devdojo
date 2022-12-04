package academy.devdojo.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kenpachi";
        nomes[2] = "Jiraya";
        nomes[3] = "Vegeta";
        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
        }

        String[] name = new String[4];
        name[0] = "Luffy";
        name[1] = "Zoro";
        name[2] = "Kurosaki";
        name[3] = "Yussuki";

        for (int i = 0; i < name.length ; i++) {
            System.out.println(name[i]);
        }
    }

}
