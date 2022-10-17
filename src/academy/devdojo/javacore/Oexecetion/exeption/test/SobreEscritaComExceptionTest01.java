package academy.devdojo.javacore.Oexecetion.exeption.test;

import academy.devdojo.javacore.Oexecetion.exeption.dominio.Funcionario;
import academy.devdojo.javacore.Oexecetion.exeption.dominio.LoginInvalidoException;
import academy.devdojo.javacore.Oexecetion.exeption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreEscritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
           e.printStackTrace();
        }
    }
}
