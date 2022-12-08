package academy.devdojo.javacore.ZZjdbc.repository;

import academy.devdojo.javacore.ZZjdbc.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZjdbc.dominio.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    public static List<Producer> findAll(){
        System.out.println("Finding all Producers");
        String sql = "SELECT id, name FROM anime_store.producer";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smtm = conn.createStatement();
             ResultSet rs = smtm.executeQuery(sql); ) {
            while(rs.next()){
                var id = rs.getInt("id");
                var name = rs.getString("name");
                Producer producer = Producer.ProducerBuilder.builder().id(id).name(name).build();
                producers.add(producer);
            }
        }catch (SQLException e){
            System.out.println("Error while trying to find All producers "+e);
        }
        return producers;
    }public static List<Producer> findAllOtmized(){
        System.out.println("Finding all Producers");
        return finByName("");
    }
    public static List<Producer> finByName(String name){
        System.out.println("Finding all ByName");
        String sql = "SELECT * FROM anime_store.producer where name like '%s';".formatted("%"+name+"%");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smtm = conn.createStatement();
             ResultSet rs = smtm.executeQuery(sql); ) {
            while(rs.next()){
                Producer producer = Producer
                        .ProducerBuilder
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        }catch (SQLException e){
            System.out.println("Error while trying to find All producers "+e);
        }
        return producers;
    }
    public static void showProducerMetadata(){
        System.out.println("Showing Producer Metadata");
        String sql = "SELECT * FROM anime_store.producer";
        try(Connection conn = ConnectionFactory.getConnection();
            Statement smtm = conn.createStatement();
            ResultSet rs = smtm.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            rs.next();
            int columnCount = rsMetaData.getColumnCount();
            System.out.println("Columns cout "+columnCount);
            for (int i = 1; i < columnCount; i++) {
                System.out.println("Table name "+rsMetaData.getTableName(i));
                System.out.println("Column name "+rsMetaData.getColumnName(i));
                System.out.println("Column size "+rsMetaData.getColumnDisplaySize(i));
                System.out.println("Column type "+rsMetaData.getColumnTypeName(i));
            }
        }catch (SQLException e){
            System.out.println("Error wwhile trying to find all producers"+e);
        }
    }
}
