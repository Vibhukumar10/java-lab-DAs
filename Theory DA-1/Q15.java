import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import java.time.LocalDate;
public class one extends Application {
    public void start(Stage s)
    {
        s.setTitle("COUNTRIES");
        Menu m = new Menu("Choose Country");
        MenuItem m1 = new MenuItem("INDIA");
        MenuItem m2 = new MenuItem("ENGLAND");
        MenuItem m3 = new MenuItem("FRANCE");
        MenuItem m4 = new MenuItem("BELGIUM");
        MenuItem m5 = new MenuItem("GERMANY");
        MenuItem m6 = new MenuItem("ITALY");
        //MenuItem m7 = new MenuItem("JUVENTUS");
        m.getItems().add(m1);
        m.getItems().add(m2);
        m.getItems().add(m3);
        m.getItems().add(m4);
        m.getItems().add(m5);
        m.getItems().add(m6);
        //m.getItems().add(m7);
        Label l = new Label("\t\t\t\t"+ "no country is selected");
        String RM = "The Capital of India is: New Delhi";
        String MU = "The Capital of England is: London";
        String AS = "The Capital of France is: Paris";
        String CHE = "The Capital of Belgium is: Brussels";
        String FCB = "The Capital of Germany is: Berlin";
        String ACM = "The Capital of Italy is: Rome";
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                if(((MenuItem)e.getSource()).getText() == "INDIA")
                l.setText(RM);
                else if(((MenuItem)e.getSource()).getText() == "ENGLAND")
                l.setText(MU);
                else if(((MenuItem)e.getSource()).getText() == "FRANCE")
                l.setText(AS);
                else if(((MenuItem)e.getSource()).getText() == "BELGIUM")
                l.setText(CHE);
                else if(((MenuItem)e.getSource()).getText() == "GERMANY")
                l.setText(FCB);
                else if(((MenuItem)e.getSource()).getText() == "ITALY")
                l.setText(ACM);
            }
        };
        m1.setOnAction(event);
        m2.setOnAction(event);
        m3.setOnAction(event);
        m3.setOnAction(event);
        m4.setOnAction(event);
        m5.setOnAction(event);
        m6.setOnAction(event);
        MenuBar mb = new MenuBar();
        mb.getMenus().add(m);
        VBox vb = new VBox(mb, l);
        Scene sc = new Scene(vb, 500, 300);
        s.setScene(sc);
        s.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}