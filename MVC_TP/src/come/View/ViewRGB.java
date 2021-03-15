package come.View;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeListener;

public class ViewRGB extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  final Alignment BASELINE = GroupLayout.Alignment.BASELINE ;
	private  final Alignment LEADING = GroupLayout.Alignment.LEADING;
	private  JLabel label = new JLabel("MVC RGB:"); 
	private  JSlider Slider = new  JSlider(0,255,0);
	private  JTextField FielText = new JTextField("0"); 
	private  JSlider Slider1 = new JSlider(0,255,0); 
    private  JTextField FielText1 = new JTextField("0"); 
    private  JSlider Slider2 = new JSlider(0,255,0);
    private  JTextField FielText2 = new JTextField("0"); 
    private  JPanel ColorDisplayer = new JPanel();
   


	public ViewRGB() {
		     
		        // Function to set the Default Look 
		        // And Feel Decorated of JFrame. 
		        ColorDisplayer.setBackground(Color.BLACK); 
		        setDefaultLookAndFeelDecorated(true); 
		        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
		        
		        // Creating Object of "GroupLayout" class 
		        GroupLayout layout = new GroupLayout(getContentPane()); 
		  
		        // to get the content pane 
		        getContentPane().setLayout(layout); 
		  
		        // it used to set Auto Create Gaps 
		        layout.setAutoCreateGaps(true); 
		  
		        // it used to set Auto Create Container Gaps 
		        layout.setAutoCreateContainerGaps(true); 
		  
		        // it used to set the horizontal group 
		        layout.setHorizontalGroup(
		        layout.createSequentialGroup().addComponent(label)
		        .addGroup(layout.createParallelGroup(LEADING)
		        .addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(LEADING)
		        .addComponent(Slider)).addGroup(layout.createParallelGroup(LEADING).addComponent(FielText,20,40,60)))
		        .addGroup(layout.createSequentialGroup()
		        .addGroup(layout.createParallelGroup(LEADING)
		        .addComponent(Slider1))
		        .addGroup(layout.createParallelGroup(LEADING)
		        .addComponent(FielText1,20,40,60)))
		        .addGroup(layout.createSequentialGroup()
		        .addGroup(layout.createParallelGroup(LEADING)
		        .addComponent(Slider2)).addGroup(layout.createParallelGroup(LEADING)
		        .addComponent(FielText2,20,40,60))))
		        .addComponent(ColorDisplayer,300,300,500)); 
		        
		        ///////////////////////////////////////////////
		        layout.linkSize(SwingConstants.HORIZONTAL, 
		                        label); 
		        
		          /////Create Vertical Group ///
		        layout.setVerticalGroup(layout.createParallelGroup(BASELINE).addComponent(ColorDisplayer,200,200,500)
		        .addGroup(layout
		        .createSequentialGroup() 	
		        .addGroup(layout.createParallelGroup(BASELINE)  
		        .addComponent(label)
		       
		       ).addGroup(layout.createParallelGroup(BASELINE).addComponent(Slider).addComponent(FielText,20,20,60))
		        .addGroup(layout.createParallelGroup(BASELINE).addComponent(Slider1).addComponent(FielText1,20,20,60))
		        .addGroup(layout.createParallelGroup(BASELINE).addComponent(Slider2).addComponent(FielText2,20,20,60))
		        		
		       ));
		       
		        
		     
		        pack(); 
		   
		}

	public void SetThecolor(Color c)  {
		ColorDisplayer.setBackground(c);
	}
	public int getSlider() {
		return Slider.getValue();
	}

	public void setSlider(int slider) {
		Slider.setValue(slider);
	}

	public String getFielText() {
		return FielText.getText();
	}

	public void setFielText(String fielText) {
		FielText.setText(fielText); 
	}

	public int getSlider1() {
		return Slider1.getValue();
	}

	public void setSlider1(int slider) {
		Slider1.setValue(slider);
	}

	public String getFielText1() {
		return FielText1.getText();
	}

	public void setFielText1(String fielText) {
		FielText1.setText(fielText); 
	}

	public int getSlider2() {
		return Slider2.getValue();
	}

	public void setSlider2(int slider) {
		Slider2.setValue(slider);
	}

	public String getFielText2() {
		return FielText2.getText();
	}

	public void setFielText2(String fielText) {
		FielText2.setText(fielText); 
	}
	
	public void ActionListnertoTextElemnts (ActionListener a) {
		FielText.addActionListener(a);
		FielText1.addActionListener(a);
		FielText2.addActionListener(a);
		
	}
	public void ActionListnertoSliderElemnts (ChangeListener a) {
		Slider.addChangeListener(a);
		Slider1.addChangeListener(a);
		Slider2.addChangeListener(a);
		
	}
}
