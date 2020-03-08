/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourqustion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ToggleGroup;
import static javafx.scene.input.KeyCode.F;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


/**
 *
 * @author AZOOZ
 */
public class Fourqustion extends Application {
    private  Label l1;
    private TextArea t;
    private VBox v,v1;
    private HBox h;
   private Dialog <String> dialog;
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
 /*Button button = new Button("copy");
    button.setStyle
        ("-fx-color:red;-fx-border-reduies:10");
   ListView flist = new ListView();
        ListView dlist = new ListView();
        flist.getItems().
   addAll(0,1,2,3,4,5,6,7,8,9,10);
        flist.setMaxSize(100,150);
        dlist.setMaxSize(50,100);
        HBox list = new HBox(10,flist,button,
                dlist);
        VBox firstvbox = new VBox();
        flist.getSelectionModel().setSelectionMode
        (SelectionMode.MULTIPLE);
        button.setOnAction(e -> {
            if (!flist.getSelectionModel().
                    getSelectedItems().isEmpty()) {
   dlist.getItems().addAll(flist.getSelectionModel
        ().getSelectedItems());
            } else {
           JOptionPane.showMessageDialog(null, "please ,add what  you want to cpoy");

            }
        });

        firstvbox.getChildren().addAll(list);
        Scene scene = new Scene(firstvbox, 200, 250);
        primaryStage.setTitle("MSL");
    primaryStage.setScene(scene);
        primaryStage.show();*/  
 /*
        Label l=new Label("Enter selsus temp");
        TextField t=new TextField();
        t.getText();
        RadioButton r1=new RadioButton("fahrenheit");
        RadioButton r2=new RadioButton("keilvn");
        ToggleGroup g=new ToggleGroup();
        r1.setToggleGroup(g);
        r2.setToggleGroup(g);
        r1.setOnAction(e -> {
           double t1= Double.parseDouble(t.getText());
           t1*=(9/5)+32;
 JOptionPane.showMessageDialog(null, t1);

        //  l1=new Label("the fahrenheit is:"+ t1);
        });
          r2.setOnAction(e -> {
           double t1= Double.parseDouble(t.getText());
           t1+=273.15;
            JOptionPane.showMessageDialog(null, t1);
        //  l1=new Label("the fahrenheit is:"+ t1);
        });
        GridPane p=new GridPane();
        p.add(l, 0, 0);
        p.add(t, 0, 1);
        p.add(r1, 0, 2);
        p.add(r2,0,3);
        p.setAlignment(Pos.CENTER);
        Scene sc=new Scene(p,200,200);
        primaryStage.setScene(sc);
 primaryStage.show();*/
   /*     MenuBar b=new MenuBar();
        Menu u =new Menu("_file");
        MenuItem open=new MenuItem("_open");
        MenuItem close=new MenuItem("_close");
         MenuItem exit=new MenuItem("e_xit");
         u.getItems().addAll(open,close,exit);
        
        Menu u1 =new Menu("_edit");
        MenuItem front=new MenuItem("_front");
        MenuItem color=new MenuItem("co_lor");
        u1.getItems().addAll(front,color);
         b.getMenus().addAll(u,u1);
            front.setOnAction(new ev(){{
        v1=new VBox(b);
       } });
               color.setOnAction(new ev(){{
       v1=new VBox(b);
       } });
         open.setOnAction(new ev(){{
         t=new TextArea();
        v=new VBox(b,t);
       } });
   close.setOnAction(new ev(){{
         t=new TextArea();
        v=new VBox(b,t);
        } });
      exit.setOnAction(new ev(){{
         t=new TextArea();
        v=new VBox(b,t);
       } });
            h=new HBox(v,v1) ;
      primaryStage.setResizable(false);
       
         Scene scene=new Scene(h);
         primaryStage.setScene(scene);
 primaryStage.show();*/
   Button sign = new Button();
        Button exit = new Button();
        Button add = new Button();
        Button view = new Button();
        VBox vbox = new VBox(10,add,view);
        vbox.setAlignment(Pos.CENTER);
        
        TextField name = new TextField();
        PasswordField password = new PasswordField();
       Label user = new Label("User Name:");
       Label pass = new Label("Password:");
       Label wel = new Label("Welcome");
       wel.setId("la");
       user.setId("lab");
       pass.setId("lab");
        sign.setText("Sign up");
        exit.setText("Exit");
        add.setText("Add Studant");
        view.setText("View Studant");
       
     HBox hbox= new HBox(5 , sign,exit );
        GridPane grid = new GridPane();
        grid.add(wel, 0, 0);
        grid.add(user, 0, 1);
        grid.add(pass, 0, 2);
        grid.add(name, 1, 1);
        grid.add(password, 1, 2);
        grid.add(hbox, 1, 3);
        grid.setHgap(8);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(0, 0, 0, 50));
         String a= "azooz";
         String n = "noor";
         String s = "yaghi";

        exit.setOnAction((ActionEvent ev)->{ 
        Platform.exit();
        System.exit(0);
        });
        
       File file = new File("input.txt");
        Scene scene2 = new Scene(vbox,300, 250);
        try (PrintWriter output = new PrintWriter(file)) {
            output.print("azooz "+MD5.hash(a)+"\n");
            output.print("noor "+MD5.hash(n)+"\n");
            output.print("yaghi "+MD5.hash(s));
        } 
        Scanner input = new Scanner(file);

        
        
       
           sign.setOnAction((ActionEvent event) -> {
               String val =MD5.hash(password.getText());
               while(input.hasNext()){
                    String line = input.nextLine();
                   if (line.contains(val)&&line.contains(name.getText()) ){
                       scene2.getStylesheets().add("Style.css");
                       primaryStage.setScene(scene2);
                       primaryStage.setTitle("***********************");
                       primaryStage.show();
                          input.close();
                   }else{System.out.println("not working"); }
                   
                   
                   
               }
        });
         
        
        Scene scene = new Scene(grid, 300, 250);
        scene.getStylesheets().add("Style.css");
        primaryStage.setTitle("********");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   /* 
    q3
    private class ev implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent e) {
     String s=((MenuItem) e.getSource()).getText();
     switch(s){
         case "_open":
        try {
                    FileChooser fc = new FileChooser();
                    fc.setTitle("Open File");
                    fc.setInitialDirectory(new File("."));
                    File file = fc.showOpenDialog(null);
                    Scanner scanner = null;
                    t.setText("");
                    t.setWrapText(true);
                    scanner = new Scanner(file);
                    while (scanner.hasNext()) {
                        t.appendText(scanner.nextLine());
                    }
                    t.setEditable(true);
                } catch (FileNotFoundException ex) {
            System.out.println("exception");   
                }
        break;
         case "_close":
           t.clear();
           t.setDisable(false);
             break;
         case "e_xit":
             System.exit(0);
             break;
         case "_front":
             dialog= new TextInputDialog("");
              dialog.setTitle("Color Selection");
              dialog.setHeaderText("Enter the size of the font");
              String siz = dialog.showAndWait().get();
              int size = Integer.parseInt(siz);
              t.setStyle("-fx-font-size:"+size+"px"+";");  
             break;
         case "co_lor":
          
         dialog = new ChoiceDialog("blue","red","green","gold","gray","black","yellow");
              dialog.setTitle("Color Selection");
              dialog.setHeaderText("Select the color");
              String color = dialog.showAndWait().get();
              t.setStyle("-fx-text-fill:"+color+";");
            break;
            
             
     }

        }
    
    }*/
}