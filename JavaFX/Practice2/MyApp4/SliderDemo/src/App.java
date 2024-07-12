import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    
    @Override
    public void start(Stage stage)throws Exception{
        
    TextArea ta = new TextArea();
    ta.setPrefColumnCount(100);
    ta.setPrefRowCount(20);

    Slider sl = new Slider(10 , 50 , 10); //min max and default
    sl.setMajorTickUnit(10);
    sl.setShowTickMarks(true);
    sl.setShowTickLabels(true);


    sl.valueProperty().addListener(e->{

        ta.setFont(Font.font(sl.getValue()));



    });


    VBox vb = new VBox();
    vb.getChildren().addAll(ta , sl);

    



    
    
    Scene sc = new Scene(vb , 500 , 500);
    stage.setScene(sc);
    stage.show();
    
    }
    
    
    
    
    
    
    
    public static void main(String[] args){
        
        launch(args);

    }
}
