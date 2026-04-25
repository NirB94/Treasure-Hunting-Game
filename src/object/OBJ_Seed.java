package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Seed extends SuperObject {

        public OBJ_Seed() {
        
        name = "Seed";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/Seed.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }

}
