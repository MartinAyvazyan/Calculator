package com.company;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;



public class Main extends Application {
    public static void main(String[] args)  {
        launch(args);
    }
    String A="";
    String B="";
    int i=0;
    int ipl=0;
    int imin=0;

    int ix=0;
    int idiv =0;
    int eq=0;
    boolean bb=false;
    boolean pl=false;
    boolean min = false;
    boolean bazm = false;
    boolean baj = false;
    double x;
    double y;
    double z;
    double xx;


    @FXML
    Button btnbin = new Button();
    @FXML
    Button btn1 = new Button();
    @FXML
    Button btn2 = new Button();
    @FXML

    Button btn3 = new Button();
    @FXML
    Button btn4 = new Button();
    @FXML
    Button btn5 = new Button();
    @FXML
    Button btn6 = new Button();
    @FXML
    Button btn7 = new Button();
    @FXML
    Button btn8 = new Button();
    @FXML
    Button btn9 = new Button();
    @FXML
    Button btn0 = new Button();
    @FXML
    Button btnc = new Button();
    @FXML
    TextField txt = new TextField();
    @FXML
    Button btnpl = new Button();
    @FXML
    Button btnmin = new Button();
    @FXML
    Button btndiv = new Button();
    @FXML
    Button btneq = new Button();
    @FXML
    Button btnx = new Button();
    @FXML
    Button btndel = new Button();


    public void initialize(){

        txt.setText(A);
        btn1.setId("btn1c");
        btnbin.setOnAction(event -> {
            txt.setText(Integer.toBinaryString(Integer.parseInt(txt.getText())));

        });


        btn1.setOnAction(event -> {
           if (!bb){
                A = A + 1;
                txt.setText(A);
            }else{
               B = B + 1;
               txt.setText(B);
           }
        });
        btn2.setOnAction(event -> {
            if (!bb){
                A = A + 2;
                txt.setText(A);
            }else{
                B = B + 2;
                txt.setText(B);
            }

        });
        btn3.setOnAction(event -> {
            if (!bb){
                A = A + 3;
                txt.setText(A);
            }else{
                B = B + 3;
                txt.setText(B);
            }
        });
        btn4.setOnAction(event -> {
            if (!bb){
                A = A + 4;
                txt.setText(A);
            }else{
                B = B + 4;
                txt.setText(B);
            }
        });
        btn5.setOnAction(event -> {
            if (!bb){
                A = A + 5;
                txt.setText(A);
            }else{
                B = B + 5;
                txt.setText(B);
            }
        });
        btn6.setOnAction(event -> {
            if (!bb){
                A = A + 6;
                txt.setText(A);
            }else{
                B = B + 6;
                txt.setText(B);
            }
        });
        btn7.setOnAction(event -> {
            if (!bb){
                A = A + 7;
                txt.setText(A);
            }else{
                B = B + 7;
                txt.setText(B);
            }

        });
        btn8.setOnAction(event -> {
            if (!bb){
                A = A + 8;
                txt.setText(A);
            }else{
                B = B + 8;
                txt.setText(B);
            }

        });
        btn9.setOnAction(event -> {
            if (!bb){
                A = A + 9;
                txt.setText(A);
            }else{
                B = B + 9;
                txt.setText(B);
            }
        });
        btn0.setOnAction(event -> {
            if (!bb){
                A = A + 0;
                txt.setText(A);
            }else{
                B = B + 0;
                txt.setText(B);
            }
        });
        btnc.setOnAction(event -> {
            txt.setText("");
            A="";
            B="";
            i=0;
             ipl=0;
             imin=0;
             ix=0;
             idiv =0;
            eq=0;
            x=0;
            xx=0;
            y=0;
            z=0;
            ipl=0;
            imin=0;

            bb=false;
            pl=false;
            bazm=false;
            baj=false;
            min=false;


        });
        btndel.setOnAction(event -> {
           int lenght= txt.getText().length();
           txt.setText(txt.getText(0,lenght-1));
           A=txt.getText(0,lenght-1);
            bb=false;
            pl=false;
            bazm=false;
            baj=false;
            min=false;
            i=0;
            ipl=0;
            imin=0;
            ix=0;
            idiv =0;
            eq=0;
            x=0;
            xx=0;
            y=0;
            z=0;
            ipl=0;
            imin=0;
            if (txt.getText().length()<1){
                txt.setText("0");
            }
        });
        btnpl.setOnAction(event -> {
            xx=Integer.parseInt(txt.getText());
            if (ipl==0)x=Integer.parseInt(txt.getText());
            A="";
            B="";
            ipl++;

           if (ipl>1){


                    y=Integer.parseInt(txt.getText());
                    z=x+y;
                    if (z%1==0){
                        txt.setText(String.valueOf((int)z));
                    }
                    else {
                        txt.setText(String.valueOf(z));
                    }
                    x=z;
                    xx=z;
                    bb=false;
            }
            bb=true;
            pl=true;
            if (imin>0){

                y=Integer.parseInt(txt.getText());
                z=xx-y;

                if (z%1==0){
                    txt.setText(String.valueOf((int)z));
                }
                else {
                    txt.setText(String.valueOf(z));
                }
                imin=1;
                bb=false;
                x=z;
                xx=z;


            }if(i==1){

                y=Integer.parseInt(txt.getText());
                z=z-y;

                if (z%1==0){
                    txt.setText(String.valueOf((int)z));
                }
                else {
                    txt.setText(String.valueOf(z));
                }
                imin=0;
                bb=false;
                x=z;
                xx=z;
            }
                bb=true;
            pl=true;
            bazm=false;
            baj=false;
            min=false;


        });

        btnmin.setOnAction(event -> {
           if (imin==0)xx=Integer.parseInt(txt.getText());
            A="";
            B="";
            imin++;
            bb=true;
            min=true;
            if (imin>1){
                y=Integer.parseInt(txt.getText());
                z=xx-y;

                if (z%1==0){
                    txt.setText(String.valueOf((int)z));
                }
                else {
                    txt.setText(String.valueOf(z));
                }bb=false;
                x=z;
                xx=z;
            }


            if (ipl>0){


                y=Integer.parseInt(txt.getText());
                z=z+y;
                if (z%1==0){
                    txt.setText(String.valueOf((int)z));
                }
                else {
                    txt.setText(String.valueOf(z));
                }
                bb=false;
                x=z;
                xx=z;
                ipl=0;
                i=1;

            }
            bb=true;
            pl=false;
            bazm=false;
            baj=false;
            min=true;

        });
        btnx.setOnAction(event -> {
            xx=Integer.parseInt(txt.getText());
            if (ix==0)x=Integer.parseInt(txt.getText());
            A="";
            B="";
            ix++;

            if (ix>1){


                y=Integer.parseInt(txt.getText());
                z=x*y;
                if (z%1==0){
                    txt.setText(String.valueOf((int)z));
                }
                else {
                    txt.setText(String.valueOf(z));
                }
                x=z;
                xx=z;
                bb=false;
            }
            bb=true;
            pl=false;
            bazm=true;
            baj=false;
            min=false;
        });
        btndiv.setOnAction(event -> {
            xx=Integer.parseInt(txt.getText());
            if (idiv==0)x=Integer.parseInt(txt.getText());
            A="";
            B="";
            idiv++;

            if (idiv>1){


                y=Integer.parseInt(txt.getText());
                if (y!=0){
                    z=x/y;
                    if (z%1==0){
                        txt.setText(String.valueOf((int)z));
                    }
                    else {
                        txt.setText(String.valueOf(z));
                    }

                }
                else txt.setText("Error");

                x=z;
                xx=z;
                bb=false;
            }
            bb=true;
            pl=false;
            bazm=false;
            baj=true;
            min=false;

        });
        btneq.setOnAction(event -> {




                if(pl){
                    y=Integer.parseInt(txt.getText());
                    z=xx+y;

                    if (z%1==0){
                        txt.setText(String.valueOf((int)z));
                    }
                    else {
                        txt.setText(String.valueOf(z));
                    }
                    bb=false;


                }

            if(bazm){
                y=Integer.parseInt(txt.getText());
                z=x*y;

                if (z%1==0){
                    txt.setText(String.valueOf((int)z));
                }
                else {
                    txt.setText(String.valueOf(z));
                }
                bb=false;
            }

                if(min){

                if (eq==0){
                    y=Integer.parseInt(txt.getText());
                    z=xx-y;

                    if (z%1==0){
                        txt.setText(String.valueOf((int)z));
                    }
                    else {
                        txt.setText(String.valueOf(z));
                    }
                    xx=z;

                }
                if (eq>0){

                    z=xx-y;

                    if (z%1==0){
                        txt.setText(String.valueOf((int)z));
                    }
                    else {
                        txt.setText(String.valueOf(z));
                    }
                    xx=z;
                }
                    eq++;
                    bb=false;

                }
                if(baj){
                    if (eq==0){
                        y=Integer.parseInt(txt.getText());
                        z=x/y;
                        if (z%1==0){
                            txt.setText(String.valueOf((int)z));
                        }
                        else {
                            txt.setText(String.valueOf(z));

                        }x=z;
                    }
                    if (eq>0){
                        z=x/y;
                        if (z%1==0){
                            txt.setText(String.valueOf((int)z));
                        }
                        else {
                            txt.setText(String.valueOf(z));
                        }
                        x=z;
                    }

                    eq++;
                    bb=false;
                }









        });
    }



    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("new.fxml"));
        Scene scene = new Scene(root, 300,218);
        scene.setOnKeyPressed(event -> {
            if (event.getCode()==KeyCode.NUMPAD1){
                System.out.println(" bjbhhbj");

                    txt.setText(A);

            }
        });
        scene.getStylesheets().addAll(getClass().getResource("neew.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
