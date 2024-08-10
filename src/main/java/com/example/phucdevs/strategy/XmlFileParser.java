package com.example.phucdevs.strategy;

import org.springframework.stereotype.Service;

import java.io.File;

@Service(FileType.XML)
public class XmlFileParser implements FileParser {

    @Override
    public void parse(File file) {
        System.out.println("Parse file XML");
    }
}
