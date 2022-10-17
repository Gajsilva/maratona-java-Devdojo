package academy.devdojo.javacore.Oexecetion.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("ArrayIndexOutOfBoundsException | IndexOutOfBoundsException | IllegalArgumentException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try{
            talvezLanceExcetion();
        }catch (IOException | SQLException e){
            e.printStackTrace();
        }

    }

    private static void talvezLanceExcetion() throws SQLException, FileNotFoundException{

    }
}
