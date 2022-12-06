package academy.devdojo.javacore.ZZjdbc.repository;

import academy.devdojo.javacore.ZZjdbc.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save (Producer producer){
        String sql = "INSERT INTO anime_store . producer ( name ) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn= ConnectionFactory.getConnection();
            Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println("Inserted producer "+producer.getName()+" in the database, rows affected "+rowsAffected);
        }catch (SQLException e){
            System.out.println("Error while trying to insert producer "+ producer.getName());
            e.printStackTrace();
        }
    }
    public static void delete (int id){
        String sql = "DELETE FROM anime_store . producer WHERE ( id = '%d' );".formatted(id);
        try(Connection conn= ConnectionFactory.getConnection();
            Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println("Deleted producer "+id+" in the database, rows affected "+rowsAffected);
        }catch (SQLException e){
            System.out.println("Error while trying to delete producer "+ id);
            e.printStackTrace();
        }
    }
    public static void deleteTodos (){
        String sql = "DELETE FROM anime_store . producer ;";
        try(Connection conn= ConnectionFactory.getConnection();
            Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println("Deleted all producer in the database, rows affected "+rowsAffected);
        }catch (SQLException e){
            System.out.println("Error while trying to delete producer");
            e.printStackTrace();
        }
    }

    public static void update (Producer producer){
        String sql = "UPDATE anime_store . producer SET name = '%s' WHERE ( id = '%d' );"
                .formatted(producer.getName(), producer.getId());
        try(Connection conn= ConnectionFactory.getConnection();
            Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println("Update producer "+producer.getId()+" in the database, rows affected "+rowsAffected);
        }catch (SQLException e){
            System.out.println("Error while trying to delete producer "+ producer.getId());
            e.printStackTrace();
        }
    }
}
