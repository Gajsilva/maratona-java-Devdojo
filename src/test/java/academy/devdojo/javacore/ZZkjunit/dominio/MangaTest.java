package academy.devdojo.javacore.ZZkjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp(){
        manga1 = new Manga("Kimetseu no yaba", 24);
        manga2 = new Manga("Kimetseu no yaba", 24);
    }

    @Test
    public void acessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Kimetsu no yaba",manga1.name());
        Assertions.assertEquals(24, manga1.episodeos());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals( manga1, manga2);
    }

    @Test
    public void hashcode_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals( manga1.hashCode(), manga2.hashCode());
    }

    @Test
    public void construtor_ThrowPointerExecption_WhenNameIsNull(){
        Assertions.assertThrows(NullPointerException.class,
                () -> new Manga(null, 12)
                );
    }
}