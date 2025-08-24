package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

@RestController
class ServerController {

    public String genHashVal(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(data.getBytes());
        byte[] digest = md.digest();
        StringBuilder hexString = new StringBuilder();

        for (byte b : digest) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

    @RequestMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException {
        String data = "Hello Huan Ai!";
        String hash = genHashVal(data);
        return "<p>data: " + data + " || checksum value: " + hash + "</p>";
    }
}
