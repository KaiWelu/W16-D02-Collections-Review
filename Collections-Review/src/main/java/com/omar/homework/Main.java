package com.omar.homework;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Gson gson = new Gson();
    public static HttpClient httpClient = HttpClient.newHttpClient();

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the name of a country you want the information for");
        String inputtedName = scanner.nextLine();

//        Creating the request
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI(String.format("https://restcountries.com/v3.1/name/%s?fields=name,capital,population,continents",inputtedName)))
                .GET()
                .build();

//        send the request

       HttpResponse<String> responseFromAPI = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());






        if(responseFromAPI.statusCode()==200){
            JsonArray responseArray = gson.fromJson(responseFromAPI.body(),JsonArray.class);

            String name = responseArray.get(0).getAsJsonObject().get("name").getAsJsonObject().get("common").getAsString();
            int population = responseArray.get(0).getAsJsonObject().get("population").getAsInt();
            String continent = responseArray.get(0).getAsJsonObject().get("continents").getAsJsonArray().get(0).getAsString();
            String capital = responseArray.get(0).getAsJsonObject().get("capital").getAsJsonArray().get(0).getAsString();

            List<JsonElement> continents = responseArray.get(0).getAsJsonObject().get("continents").getAsJsonArray().asList();
            System.out.println(name);

            String outputtedString = String.format("%s country is a great country with a great population of %d and is in %s continent. With the following capitals: %s",name,population,continent,capital);
            System.out.println(outputtedString);

            for(JsonElement oneContitnent : continents){
                System.out.println(oneContitnent.getAsString());
            }

        }
        else{
            System.out.println("Country not found, please input a valid country name");
            HttpRequest starWarsRequest = HttpRequest.newBuilder()
                    .uri(new URI("https://swapi.dev/api/people/4"))
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(starWarsRequest,HttpResponse.BodyHandlers.ofString());

            System.out.println("Sorry we couldnt find your country heres the information for darth vader: " + response.body());
        }









    }

    public static void getCountry(){

    }
}
