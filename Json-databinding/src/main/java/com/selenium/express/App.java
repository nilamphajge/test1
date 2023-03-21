package com.selenium.express;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws StreamReadException, DatabindException, IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
      
       
List<Student> studentarr =Arrays.asList(objectMapper.readValue(new File("data//hello.json"), Student[].class));
       
   for(Student st :studentarr)
   {
	   System.out.println(st);
   }
    }
}
