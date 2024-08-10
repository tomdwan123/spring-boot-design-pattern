package com.example.phucdevs.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@RequiredArgsConstructor
public class FileParserService {

    private final FileParserFactory fileParserFactory;

    public void parse(File file, String fileType) {
        FileParser fileParser = fileParserFactory.get(fileType);
        fileParser.parse(file);
    }
}
