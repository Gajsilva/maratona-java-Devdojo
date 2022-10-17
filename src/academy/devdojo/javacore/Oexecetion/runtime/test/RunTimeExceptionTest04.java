package academy.devdojo.javacore.Oexecetion.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro da ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try{
            talvezLanceExcetion();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void talvezLanceExcetion() throws SQLException, FileNotFoundException{

    }
}
