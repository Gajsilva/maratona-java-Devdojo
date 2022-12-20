package academy.devdojo.javacore.ZZkjunit.dominio;

import java.util.Objects;

public record Manga(String name, int episodeos) {
    public Manga {
        Objects.requireNonNull(name);
    }
}
