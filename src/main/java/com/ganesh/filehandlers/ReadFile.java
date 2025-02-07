package com.ganesh.filehandlers;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ganesh.dto.Student;
import java.util.List;

public class ReadFile {

    public static List<Student> readStudentData(String filePath) throws IOException{
        /**
         * Read student data from file and return list of student objects
         */

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);
        List<Student> students = objectMapper.readValue(file, new TypeReference<List<Student>>() {});
        return students;
    }

}
