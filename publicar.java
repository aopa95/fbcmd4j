/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbcmd4j;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.User;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class publicar {

    public static void main(String[] args) {

        String accessToken = "EAACEdEose0cBANidFPBtNRLsowrA56FZADbP6UQ315qRiQ1jXipZB1cdDQemwotcmFRhxPc9xhd5T35wV3EUbtdpqupfdsQT3D94ZCGySXJ6rpj74iFZCaDzsIEFucjZARRmYLPQIVIwwj9vnJEeYVKJD9LlBClHJ1d1sBwCtDgZDZD";

        FacebookClient fbClient = new DefaultFacebookClient(accessToken);

        User me = fbClient.fetchObject("me", User.class);

        Scanner user_input = new Scanner(System.in);

        String compartir;
        System.out.println("Escribe lo que quieras compartir: \n");
        compartir = user_input.nextLine();

        FacebookType publishMessageResponse = fbClient.publish("me/feed", FacebookType.class, Parameter.with("message", compartir));

        System.out.println("Published message ID: " + publishMessageResponse.getId());
        System.out.println(compartir + " ha sido públicado en tu muro");
    }
}
