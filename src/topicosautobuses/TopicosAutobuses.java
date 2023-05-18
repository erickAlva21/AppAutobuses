package topicosautobuses;

import Frames.*;

public class TopicosAutobuses {

    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                Frame1 gui = new Frame1();
            }
        });
    }
    
}
