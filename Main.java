package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = new Pane();
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calculator");
			primaryStage.show();
			Label output = new Label("");
			Button second= new Button("2nd");
			primaryStage.setResizable(false);
			
			
			Button seven = new Button("7");
			Button four = new Button("4");
			Button one = new Button("1");
			Button point = new Button(".");
			
			
			Button eight = new Button("8");
			Button five = new Button("5");
			Button two = new Button("2");
			Button zero = new Button("0");
			
			
			Button nine = new Button("9");
			Button six = new Button("6");
			Button three = new Button("3");
			Button del = new Button("DEL");
			
			
			Button mod = new Button("%");
			Button mul = new Button("x");
			Button sub = new Button("-");
			Button plus = new Button("+");
			
			Button ce = new Button("CE");
			Button div = new Button("÷");
			Button eq = new Button("=");
						
			
			
			//first
			output.setLayoutX(0);
			output.setLayoutY(0);
			seven.setLayoutX(0);
			seven.setLayoutY(84);
			four.setLayoutX(0);
			four.setLayoutY(163);
			one.setLayoutX(0);
			one.setLayoutY(242);
			point.setLayoutX(0);
			point.setLayoutY(321);
			
			
			eight.setLayoutX(80);
			eight.setLayoutY(84);
			five.setLayoutX(80);
			five.setLayoutY(163);
			two.setLayoutX(80);
			two.setLayoutY(242);
			zero.setLayoutX(80);
			zero.setLayoutY(321);
		
			
			nine.setLayoutX(160);
			nine.setLayoutY(84);
			six.setLayoutX(160);
			six.setLayoutY(163);
			three.setLayoutX(160);
			three.setLayoutY(242);
			del.setLayoutX(160);
			del.setLayoutY(321);
			
			mod.setLayoutX(240);
			mod.setLayoutY(84);
			mul.setLayoutX(240);
			mul.setLayoutY(163);
			sub.setLayoutX(240);
			sub.setLayoutY(242);
			plus.setLayoutX(240);
			plus.setLayoutY(321);
			
			
			ce.setLayoutX(320);
			ce.setLayoutY(84);
			div.setLayoutX(320);
			div.setLayoutY(163);
			eq.setLayoutX(320);
			eq.setLayoutY(242);
			
			eq.setStyle("-fx-pref-height:158px");
			
			
			
			root.getChildren().add(seven);
			root.getChildren().add(four);
			root.getChildren().add(one);
			root.getChildren().add(point);
			root.getChildren().add(output);
			
			root.getChildren().add(eight);
			root.getChildren().add(five);
			root.getChildren().add(two);
			root.getChildren().add(zero);
			
			
			root.getChildren().add(nine);
			root.getChildren().add(six);
			root.getChildren().add(three);
			root.getChildren().add(del);
			
			
			root.getChildren().add(mod);
			root.getChildren().add(mul);
			root.getChildren().add(sub);
			root.getChildren().add(plus);
			
			root.getChildren().add(ce);
			root.getChildren().add(div);
			root.getChildren().add(eq);
			
		



			seven.setOnAction((event) -> {
				output.setText(output.getText()+  "7");
			   
			   
			});
			four.setOnAction((event) -> {
				output.setText(output.getText()+  "4");
			   
			   
			});
			one.setOnAction((event) -> {
				output.setText(output.getText()+  "1");
			   
			   
			});
			eight.setOnAction((event) -> {
				output.setText(output.getText()+  "8");
			   
			   
			});
			five.setOnAction((event) -> {
				output.setText(output.getText()+  "5");
			   
			   
			});
			two.setOnAction((event) -> {
				output.setText(output.getText()+  "2");
			   
			   
			});
			zero.setOnAction((event) -> {
				output.setText(output.getText()+  "0");
			   
			   
			});
			nine.setOnAction((event) -> {
				output.setText(output.getText()+  "9");
			   
			   
			});
			six.setOnAction((event) -> {
				output.setText(output.getText()+  "6");
			   
			   
			});
			three.setOnAction((event) -> {
				output.setText(output.getText()+  "3");
			   
			   
			});
			div.setOnAction((event) -> {
				output.setText(output.getText()+ " " + "/" + " ");
			   
			   
			});
			mul.setOnAction((event) -> {
				output.setText(output.getText()+ " " + "*"+ " ");
			   
			   
			});
			sub.setOnAction((event) -> {
				output.setText(output.getText()+ " " + "-"+ " ");
			   
			   
			});
			mod.setOnAction((event) -> {
				output.setText(output.getText()+ " " + "%"+ " ");
			   
			   
			});
			
			ce.setOnAction((event) -> {
				
				output.setText("");
			   
			   
			});
			
   
			plus.setOnAction((event) -> {
				
				output.setText(output.getText()+ " " + plus.getText()+ " ");
			   
			   
			});
		
			
			eq.setOnAction((event) -> {
				
				output.setText(solve(output.getText()));
				
			   
			   
			});
			point.setOnAction((event) -> {
				
				output.setText(output.getText()+ ".");
			   
			   
			});
			
			
		
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doSomething(String text)
	{
		System.out.println(text);
		if(text == "eq")
		{
			System.out.println("Skrrrt");
		}
	}
	
	public static String solve(String s)
	{
		String parts[] = s.split(" ");

		String a = parts[0];
		String b = parts[1];
		String c = parts[2];
		
		
		double result = 0;
		double x = Double.parseDouble(a);
		double y = Double.parseDouble(c);
		
		
		
		
		if(b.equals("+"))
		{
			result = x + y;
		}
		if(b.equals("*"))
		{
			result = x * y;
		}
		if(b.equals("-"))
		{
			result = x - y;
		}
		if(b.equals("/"))
		{
			result = x / y;
		}
		if(b.equals("%"))
		{
			result = x % y;
		}
		
		
		
	String result1 = Double.toString(result);
	
		return result1;
	}
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
