package org.openjfx.memorygame;

import java.io.IOException;
import javafx.scene.paint.Color;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

public class SecondaryController {

	@FXML
	private Label myLabel;
	
	private int counter=10;
	private int disable =0;
	
	@FXML
	private ImageView imageView1;
	@FXML
	private ImageView imageView2;
	@FXML
	private ImageView imageView3;
	@FXML
	private ImageView imageView4;
	@FXML
	private ImageView imageView5;
	@FXML
	private ImageView imageView6;
	@FXML
	private ImageView imageView7;
	@FXML
	private ImageView imageView8;
	@FXML
	private ImageView imageView9;
	@FXML
	private ImageView imageView10;
	@FXML
	private ImageView imageView11;
	@FXML
	private ImageView imageView12;

	@FXML
	private TilePane tilePane;
	
	@FXML
	private void increment() {
		counter--;
		myLabel.setText("nbr d'essais :"+counter);
	
	if (counter == 0) {
		Platform.exit();
	 	}
	}
	
/*	public void initialize () {
		var file1 = App.class.getResource("C_01_01.png");
		Image image1 = new Image (file1.toString());
		imageView1.setImage(image1);
		imageView7.setImage(image1);
		
		var file2 = App.class.getResource("C_03_04.png");
		Image image2 = new Image (file2.toString());
		imageView2.setImage(image2);
		imageView8.setImage(image2);
		
		var file3 = App.class.getResource("C_02_04.png");
		Image image3 = new Image (file3.toString());
		imageView3.setImage(image3);
		imageView9.setImage(image3);
		
		var file4 = App.class.getResource("C_02_09.png");
		Image image4 = new Image (file4.toString());
		imageView4.setImage(image4);
		imageView10.setImage(image4);
		
		var file5 = App.class.getResource("C_01_07.png");
		Image image5 = new Image (file5.toString());
		imageView5.setImage(image5);
		imageView11.setImage(image5);
		
		var file6 = App.class.getResource("C_03_05.png");
		Image image6 = new Image (file6.toString());
		imageView6.setImage(image6);
		imageView12.setImage(image6);
	}*/
    
	public void image1 (Event event) {
				
		ImageView imv = (ImageView) event.getTarget();
		
		
		if (imv.equals(imageView1)) {
			var file1 = App.class.getResource("C_01_01.png");
			Image image1 = new Image (file1.toString());
			imageView1.setImage(image1);
			disable++;
		}
			if (imv.equals(imageView7)) {
				var file1 = App.class.getResource("C_01_01.png");
				Image image1 = new Image (file1.toString());
				imageView7.setImage(image1);
				disable++;
			}
		
				if (imv.equals(imageView2)) {
					var file2 = App.class.getResource("C_03_04.png");
					Image image2 = new Image (file2.toString());
					imageView2.setImage(image2);
					disable++;
				}
					if (imv.equals(imageView8)) {
							var file2 = App.class.getResource("C_03_04.png");
							Image image2 = new Image (file2.toString());
							imageView8.setImage(image2);
							disable++;
					}

						if (imv.equals(imageView3)) {
							var file3 = App.class.getResource("C_02_04.png");
							Image image3 = new Image (file3.toString());
							imageView3.setImage(image3);
							disable++;
						}
							if (imv.equals(imageView9)) {
								var file3 = App.class.getResource("C_02_04.png");
								Image image3 = new Image (file3.toString());
								imageView9.setImage(image3);
								disable++;
							}
				
								if (imv.equals(imageView4)) {
									var file4 = App.class.getResource("C_02_09.png");
									Image image4 = new Image (file4.toString());
									imageView4.setImage(image4);
									disable++;
								}
									if (imv.equals(imageView10)) {
										var file4 = App.class.getResource("C_02_09.png");
										Image image4 = new Image (file4.toString());
										imageView10.setImage(image4);
										disable++;
									}
					
										if (imv.equals(imageView5)) {
											var file5 = App.class.getResource("C_01_07.png");
											Image image5 = new Image (file5.toString());
											imageView5.setImage(image5);
											disable++;
										}
											if (imv.equals(imageView11)) {
												var file5 = App.class.getResource("C_01_07.png");
												Image image5 = new Image (file5.toString());
												imageView11.setImage(image5);
												disable++;
											}
						
												if (imv.equals(imageView6)) {
													var file6 = App.class.getResource("C_03_05.png");
													Image image6 = new Image (file6.toString());
													imageView6.setImage(image6);
													disable++;
												}
													if (imv.equals(imageView12)) {
														var file6 = App.class.getResource("C_03_05.png");
														Image image6 = new Image (file6.toString());
														imageView12.setImage(image6);
														disable++;
													}
														if (disable == 2) {
															tilePane.setDisable(true);
															disable=0;
															tilePane.setDisable(false);
														}
														
					}

	
	
	
	
}
