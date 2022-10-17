package de.alex.Studium.ep1_2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Janus {
    public static void main(String[] args) throws URISyntaxException, IOException {
        String text = new String(Files.readAllBytes(Path.of(Janus.class.getClassLoader().getResource(Janus.class.getName().replace(".","/")+".class").toURI())));
        System.out.println(text);
    }
}
