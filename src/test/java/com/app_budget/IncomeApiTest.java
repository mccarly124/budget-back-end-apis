package com.app_budget;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import com.app_budget.Entity.Income;



public class IncomeApiTest {
    public static LocalDate dateTest = LocalDate.now();
    public static Income incomeTest = new Income(20, dateTest, null, "Cash", "Noah");
    public static Income incomeTest2 = new Income(30, dateTest , null, "Credit", "Maggie");

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException{

        String incomeTestString = incomeTest2.toString();

        // Create HTTP Client
        HttpClient client = HttpClient.newHttpClient();

        // Create POST Request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://localhost:8080/income/post"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(incomeTestString))
                .build();

        // Send Request and get Response
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print Response
        System.out.println("Response Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
