package com.example.phucdevs.strategy;

import org.springframework.stereotype.Service;

import java.io.File;

@Service(FileType.JSON)
public class JsonFileParser implements FileParser {

    @Override
    public void parse(File file) {
        System.out.println("Parse file JSON");
    }
}
