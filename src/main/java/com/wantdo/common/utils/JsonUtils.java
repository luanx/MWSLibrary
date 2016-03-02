package com.wantdo.common.utils;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */
public class JsonUtils {

    public static String getJson4List(List list){
        String jsondata = "";

        try {
            ObjectMapper mapper = new ObjectMapper();
            StringWriter sw = new StringWriter();
            JsonGenerator gen = new JsonFactory().createGenerator(sw);
            mapper.writeValue(gen, list);
            gen.close();
            jsondata = sw.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsondata;
    }

    public static String getJson4Object(Object object) {
        String jsondata = "";
        try {
            ObjectMapper mapper = new ObjectMapper();
            StringWriter sw = new StringWriter();
            JsonGenerator gen = new JsonFactory().createGenerator(sw);
            mapper.writeValue(gen, object);
            gen.close();
            jsondata = sw.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsondata;
    }


}
