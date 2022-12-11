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
    public static void updatePreparedStatement (Producer producer){
        try(Connection conn= ConnectionFactory.getConnection();
            PreparedStatement ps = preparedStatementUpdate(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            System.out.println("Update producer "+producer.getId()+" in the database, rows affected "+rowsAffected);
        }catch (SQLException e){
            System.out.println("Error while trying to delete producer "+ producer.getId());
            e.printStackTrace();
        }
    }
    public static List<Producer> findAll() {
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
    }
    public static List<Producer> findAllOtmized(){
        System.out.println("Finding all Producers");
        return finByName("");
    }
    private static PreparedStatement preparedStatementUpdate(Connection conn,Producer producer) throws SQLException {
        String sql = "UPDATE anime_store . producer SET name = ? WHERE ( id = ? );";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;
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
    public static List<Producer> finByNamePreparedStatementComSQLINJECTION(String name){
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
    public static List<Producer> finByNamePreparedStatement(String name){
        System.out.println("Finding all ByName");

        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn,name);
             ResultSet rs = ps.executeQuery();){

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
    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, String.format("%%%s%%", name));
        return preparedStatement;
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
            System.out.println("Error while trying to find all producers"+e);
        }
    }
    public static void showDriverMetadata(){
        System.out.println("Showing Producer Metadata");
        String sql = "SELECT * FROM anime_store.producer";
        try(Connection conn = ConnectionFactory.getConnection()){
            DatabaseMetaData dbmetaData = conn.getMetaData();
            if (dbmetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                System.out.println("Supports TYPE_FORWARD_ONLY");
                if (dbmetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("And Supports CONCUR_UPDATABLE");
                }
            }
            if (dbmetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                System.out.println("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbmetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("And Supports CONCUR_UPDATABLE");
                }
            }
            if (dbmetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                System.out.println("Supports TYPE_SCROLL_SENSITIVE");
                if (dbmetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("And Supports CONCUR_UPDATABLE");
                }
            }
        }catch (SQLException e){
            System.out.println("Error while trying to find all producers"+e);
        }
    }
    public static void showTypeScrollWorking(){
        String sql = "SELECT * FROM anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement smtm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smtm.executeQuery(sql); ) {
            System.out.println("Last row "+rs.last());
            System.out.println("Row Number "+rs.getRow());
            System.out.println(Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            System.out.println("First row "+rs.first());
            System.out.println("Row Number "+rs.getRow());
            System.out.println(Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            System.out.println("Last row "+rs.absolute(3));
            System.out.println("Row Number "+rs.getRow());
            System.out.println(Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            System.out.println("Last relative "+rs.relative(-2));
            System.out.println("Row Number "+rs.getRow());
            System.out.println(Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

        }catch (SQLException e){
            System.out.println("Error while trying to find All producers "+e);
        }

    }
    public static List<Producer> findByUpdateUpercase(String name){
        System.out.println("Finding all ByName");
        String sql = "SELECT * FROM anime_store.producer where name like '%s';".formatted("%"+name+"%");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smtm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smtm.executeQuery(sql); ) {
            while(rs.next()){
                rs.updateString("name", rs.getString("name").toUpperCase());
                Producer producer = Producer
                        .ProducerBuilder
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        }catch (SQLException e){
            System.out.println("Error while trying to find All producers update "+e);
        }
        return producers;
    }
    public static List<Producer> findByAndInsetWhenNotFound(String name){
        System.out.println("Finding all ByName");
        String sql = "SELECT * FROM anime_store.producer where name like '%s';".formatted("%"+name+"%");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smtm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smtm.executeQuery(sql); ) {
            if (!rs.next()) return producers;
                rs.moveToInsertRow();
                rs.updateString("name", name);
                rs.insertRow();
            producers.add(getProducer(rs));

        }catch (SQLException e){
            System.out.println("Error while trying to find All producers update "+e);
        }
        return producers;
    }
    public static List<Producer> findByAndDelete(String name){
        System.out.println("Finding all ByName");
        String sql = "SELECT * FROM anime_store.producer where name like '%s';".formatted("%"+name+"%");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smtm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smtm.executeQuery(sql); ) {
            while(rs.next()){
                System.out.println("Deleting"+rs.getString("name"));
                rs.deleteRow();
            }

        }catch (SQLException e){
            System.out.println("Error while trying to find All producers update "+e);
        }
        return producers;
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
       return Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build();

    }
}
