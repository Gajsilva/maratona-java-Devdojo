package academy.devdojo.javacore.ZZJcrud.service;

import academy.devdojo.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op){
        switch (op){
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName(){
        System.out.println("Type name or empty to all");
        String name = SCANNER.nextLine();
        List<Anime> animes = AnimeRepository.finByName(name);
        animes.forEach(p -> System.out.printf("[%d] - %s%n",p.getId(), p.getName()));
    }
    private static void delete(){
        System.out.println("Type id of the anime you want to delete ");
        findByName();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)){
            AnimeRepository.delete(id);
        }
    }
    private static void save(){
        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer");
        Integer producerId  = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder()
                .episodes(episodes)
                .name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }
    public static void update(){
        System.out.println("Type the id of the object you  want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()){
            System.out.println("anime not found");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("anime found "+animeFromDb);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the new number of episodes or enter to keep the same");
        int episodes =Integer.parseInt(SCANNER.nextLine());


        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producer(animeFromDb.getProducer())
                .name(name)
                .build();
        AnimeRepository.update(animeToUpdate);
    }
}
