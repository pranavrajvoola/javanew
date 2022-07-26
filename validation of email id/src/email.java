import java.util.ArrayList;

public class email {
public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        
        emailID.add("pranavraj@gmail.com");
        emailID.add("lucky@gmail.com");
        emailID.add("voola@gmail.com");
       
       
        int c = 0;
        
   
        String searchEmail = "lucky@gmail.com";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    
                    if(searchEmail==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                       c = 1;
                        
                        break;
                        
                    }
                }
                
                if(c==1)
                {System.out.println("email ID :" + searchEmail + "  is found");}
                else{System.out.println("email ID Not found");}

    }

}
