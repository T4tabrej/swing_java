import javax.swing.*;
// this class shows frame concept only
class helper {
   
    //second method by   inheritence we have to Inherit Jframe class
    
    // helper(){
            
    //         setSize(400,500);
    //         setVisible(true);
            
    //     }




    public static void main(String[] args) {
     

        //1 creating frame 
        // JFrame frame=new JFrame();
        JFrame frame=new JFrame("Demo Frame");

        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);//to the center of the screen
        frame.setVisible(true);
   
        //creating object of constructor  
        // new helper();

       




    }
}