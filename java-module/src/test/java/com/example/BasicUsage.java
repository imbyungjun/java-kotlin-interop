package com.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

public class BasicUsage {
    @Test
    public void jsonRequestTest() {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://naver.com")
                .build();

        try (Response response = client.newCall(request).execute()) {
            assert response.code() == 200;
            assert response.body().bytes().length > 0;
        } catch (IOException e) {
            // do nothing
        }
    }
}
