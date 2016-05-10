/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbcmd4j;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.Post;
import com.restfb.types.User;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Fbcmd4j {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        // TODO code application logic here

        String accessToken = "EAACEdEose0cBANidFPBtNRLsowrA56FZADbP6UQ315qRiQ1jXipZB1cdDQemwotcmFRhxPc9xhd5T35wV3EUbtdpqupfdsQT3D94ZCGySXJ6rpj74iFZCaDzsIEFucjZARRmYLPQIVIwwj9vnJEeYVKJD9LlBClHJ1d1sBwCtDgZDZD";

        FacebookClient fbClient = new DefaultFacebookClient(accessToken);

        User me = fbClient.fetchObject("me", User.class);
        
        muro a = new muro();
        Timeline b = new Timeline();
        publicar c = new publicar();

        System.out.println("User: " + me.getName());
        System.out.print("Native Laguage: " + me.getLanguages().get(0).getName() + "\n" + "\n");


        Scanner user_elect = new Scanner(System.in);
        
        int eleccion;
        System.out.println("Elige que quieres hacer: \n");
        eleccion = user_elect.nextInt();

        int elige = eleccion;
        
        switch (elige) {
            case 1: 
                System.out.println(a);
                break;
            case 2: 
                System.out.println(b);
                break;
            case 3:
                System.out.println(c);
                break;
            default: System.out.println("Invalid command");
                     break;
        }   
    }
}
