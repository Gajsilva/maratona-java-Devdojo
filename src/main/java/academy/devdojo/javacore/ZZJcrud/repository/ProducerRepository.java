package academy.devdojo.javacore.ZZJcrud.repository;

import academy.devdojo.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZJcrud.dominio.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
}

