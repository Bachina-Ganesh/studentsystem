package com.ganesh.filehandlers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ganesh.dto.Student;

public class WriteFile {

    public static void writeFile(List<Student> students, String filePath) throws IOException {
        /**
         * This method write list of student object data into json file
         */
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);
        objectMapper.writeValue(file, students);
    }
}
