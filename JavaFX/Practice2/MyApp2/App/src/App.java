import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class App extends Application{



        Button b;
        int count;

        @Override
        public void start(Stage stage)throws Exception{

            b = new Button("Click");
            b.setOnAction(new EventHandler<ActionEvent>(){


                public void handle(ActionEvent ae){
                    count++;
                    b.setText("" + count);
                }



            });
            b.setPrefSize(100 , 30);


            FlowPane fp = new FlowPane(b);
            
            
            Scene sc =  new Scene(fp, 400 , 400);
            
            
            stage.setScene(sc);
            stage.show( );

        
        }

        

        public static void main(String args []){

                launch(args);


        }   
    
}