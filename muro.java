/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbcmd4j;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Post;
import com.restfb.types.User;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class muro {
   
    public static void main(String[] args) {
        // TODO code application logic here

        String accessToken = "EAACEdEose0cBANidFPBtNRLsowrA56FZADbP6UQ315qRiQ1jXipZB1cdDQemwotcmFRhxPc9xhd5T35wV3EUbtdpqupfdsQT3D94ZCGySXJ6rpj74iFZCaDzsIEFucjZARRmYLPQIVIwwj9vnJEeYVKJD9LlBClHJ1d1sBwCtDgZDZD";

        FacebookClient fbClient = new DefaultFacebookClient(accessToken);

        User me = fbClient.fetchObject("me", User.class);

        System.out.println("User: " + me.getName());
        System.out.print("Native Laguage: " + me.getLanguages().get(0).getName() + "\n" + "\n");

        Connection<Post> result = fbClient.fetchConnection("me/feed", Post.class);

        int counter = 0;

        for (List<Post> page : result) {
            if (counter < 20) {
                for (Post aPost : page) {
                    if (counter < 20) {
                        System.out.println(counter + 1 + " " + aPost.getMessage());
                        System.out.println("facebook.com/" + aPost.getId() + "\n");
                        counter++;
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        System.out.println("Número de resultados: " + counter);   
    }
                }
