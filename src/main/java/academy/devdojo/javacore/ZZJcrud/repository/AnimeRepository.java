package academy.devdojo.javacore.ZZJcrud.repository;

import academy.devdojo.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.javacore.ZZJcrud.dominio.Producer;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

public class AnimeRepository {
    public static List<Anime> finByName(String name){
        System.out.println("Finding all ByName");

        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPrepareStamenteFindyByName(conn,name);
             ResultSet rs = ps.executeQuery();){

            while(rs.next()){
                Producer producer = Producer.builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();
                Anime anime = Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }
        }catch (SQLException e){
            System.out.println("Error while trying to find All animes "+e);
        }
        return animes;
    }
    private static PreparedStatement createdPrepareStamenteFindyByName(Connection conn, String name) throws SQLException {
        String sql = """ 
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join
                anime_store.producer p on a.producer_id = p.id
                where a.name like ?;
                """;
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, String.format("%%%s%%", name));
        return preparedStatement;
    }
    public static void delete (int id){
        try(Connection conn= ConnectionFactory.getConnection();
            PreparedStatement ps = createPrepareStamenteFindyByNameDelete(conn,id)) {
            ps.execute();
            System.out.println("Deleted anime "+id+" in the database, rows affected "+id);
        }catch (SQLException e){
            System.out.println("Error while trying to delete anime "+ id);
            e.printStackTrace();
        }
    }
    private static PreparedStatement createPrepareStamenteFindyByNameDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM anime_store . anime WHERE ( id = ? );";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }
    public static void save(Anime anime){
        System.out.println("Saving anime "+anime);
        try(Connection conn= ConnectionFactory.getConnection();
            PreparedStatement ps = createPrepareStatementeSave(conn, anime)) {
            ps.execute();
        }catch (SQLException e){
            System.out.println("Error while trying to delete anime "+ anime.getId() + e);
        }
    }
    private static PreparedStatement createPrepareStatementeSave(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO anime_store . anime ( name, episodes, producer_id ) VALUES (?, ?, ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, anime.getName());
        preparedStatement.setInt(2, anime.getEpisodes());
        preparedStatement.setInt(3, anime.getProducer().getId());
        return preparedStatement;
    }
    public static Optional <Anime> findById(Integer id){
        System.out.println("Finding anime by id "+id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPrepareStamenteFindyById(conn, id);
             ResultSet rs = ps.executeQuery();){
                if (!rs.next()) return Optional.empty();
            Producer producer = Producer.builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id"))
                    .build();
            Anime anime = Anime
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
                return Optional.of(anime);
        }catch (SQLException e){
            System.out.println("Error while trying to find All animes "+e);
        }
        return Optional.empty();
    }
    private static PreparedStatement createdPrepareStamenteFindyById(Connection conn, Integer id) throws SQLException {
        String sql = """ 
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join
                anime_store.producer p on a.producer_id = p.id
                where a.id = ?;
                """;
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        return preparedStatement;
    }
    public static void update(Anime anime){
        System.out.println("Updating anime "+anime);
        try(Connection conn= ConnectionFactory.getConnection();
            PreparedStatement ps = createdPrepareStatementUpdate(conn, anime)) {
            ps.execute();
        }catch (SQLException e){
            System.out.println("Error while trying to delete anime "+ anime.getId());
            e.printStackTrace();
        }
    }
    private static PreparedStatement createdPrepareStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = "UPDATE anime_store . anime SET name = ?, episodes = ? WHERE ( id = ? );";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, anime.getName());
        preparedStatement.setInt(1, anime.getId());
        preparedStatement.setInt(2, anime.getId());
        return preparedStatement;
    }
}

