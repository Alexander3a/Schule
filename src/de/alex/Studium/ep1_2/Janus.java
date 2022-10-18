/*
 * Copyright (c) 2022. Alexander Riedel
 */

package de.alex.Studium.ep1_2;

import java.io.*;
import java.lang.invoke.MethodHandles;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Janus {
    public static void main(String[] args) throws URISyntaxException, IOException {
        String[] current_package_path = (MethodHandles.lookup().lookupClass().getName()).split("\\.");
        Path src_path = new File("").getAbsoluteFile().toPath().resolve("src");
        for (String s : current_package_path) {
            src_path=src_path.resolve(s);
        }
        src_path=src_path.getParent().resolve(current_package_path[current_package_path.length-1]+".java");
        File src=src_path.toFile();
        if(src.exists()){
            try(BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(src)))){
                String b = br.readLine();
                while (b!=null){
                    System.out.println(b);
                    b= br.readLine();
                }
            }
        }else{
            System.out.println("didnt find the src so here is the bin");
            String text = new String(Files.readAllBytes(Path.of(Janus.class.getClassLoader().getResource(Janus.class.getName().replace(".","/")+".class").toURI())));
            System.out.println(text);
        }
    }
}
