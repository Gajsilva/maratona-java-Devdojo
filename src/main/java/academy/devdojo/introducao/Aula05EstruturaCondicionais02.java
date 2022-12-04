package academy.devdojo.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        //idade <15 categoria juvenil
        //idade >=15 && idade < 18 categoria juvenil
        //idade >=18 categoria adulta

        int idade = 16;
        String categoria;

        if(idade < 15){
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria adulta";
        }
        System.out.println(categoria);
    }
}
