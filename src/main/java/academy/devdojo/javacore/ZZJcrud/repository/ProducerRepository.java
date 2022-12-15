package academy.devdojo.javacore.ZZJcrud.repository;

import academy.devdojo.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZJcrud.dominio.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProducerRepository {
    public static List<Producer> finByName(String name){
        System.out.println("Finding all ByName");

        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPrepareStamenteFindyByName(conn,name);
             ResultSet rs = ps.executeQuery();){

            while(rs.next()){
                Producer producer = Producer
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
    private static PreparedStatement createdPrepareStamenteFindyByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, String.format("%%%s%%", name));
        return preparedStatement;
    }
    public static void delete (int id){
        try(Connection conn= ConnectionFactory.getConnection();
            PreparedStatement ps = createPrepareStamenteFindyByNameDelete(conn,id)) {
            ps.execute();
            System.out.println("Deleted producer "+id+" in the database, rows affected "+id);
        }catch (SQLException e){
            System.out.println("Error while trying to delete producer "+ id);
            e.printStackTrace();
        }
    }
    private static PreparedStatement createPrepareStamenteFindyByNameDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM anime_store . producer WHERE ( id = ? );";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }
    public static void save(Producer producer){
        System.out.println("Saving Producer "+producer);
        try(Connection conn= ConnectionFactory.getConnection();
            PreparedStatement ps = createPrepareStatementeSave(conn, producer)) {
            ps.execute();
        }catch (SQLException e){
            System.out.println("Error while trying to delete producer "+ producer.getId() + e);
        }
    }
    private static PreparedStatement createPrepareStatementeSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO anime_store . producer ( name ) VALUES (?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        return preparedStatement;
    }
    public static Optional <Producer> findById(Integer id){
        System.out.println("Finding Producer by id "+id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPrepareStamenteFindyById(conn, id);
             ResultSet rs = ps.executeQuery();){
                if (!rs.next()) return Optional.empty();
                return Optional.of(Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build());
        }catch (SQLException e){
            System.out.println("Error while trying to find All producers "+e);
        }
        return Optional.empty();
    }
    private static PreparedStatement createdPrepareStamenteFindyById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        return preparedStatement;
    }
    public static void update(Producer producer){
        System.out.println("Updating producer "+producer);
        try(Connection conn= ConnectionFactory.getConnection();
            PreparedStatement ps = createdPrepareStatementUpdate(conn, producer)) {
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("Error while trying to delete producer "+ producer.getId());
            e.printStackTrace();
        }
    }
    private static PreparedStatement createdPrepareStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE anime_store . producer SET name = ? WHERE ( id = ? );";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;
    }
}

