/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.josneyo.i2018.topicos2.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class JsonRequest {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://api.github.com/users/kyriosdata");

        try {
            // Set a connection with the URL
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("URL informed is not valid");
                return;
            }

            // Read the JSON from the URL
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;

            while ((current = in.readLine()) != null) {
                urlString += current;
            }

            // Convert JSON string to Map
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> map = new HashMap<String, Object>();
            map = mapper.readValue(urlString, new TypeReference<Map<String, String>>() {});
            // Put JSON onto a object and Display it
            Object a = new Object();
            String pureLink = map.put("avatar_url", a).toString();
            System.out.println(pureLink);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
