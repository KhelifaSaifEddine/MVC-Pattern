import com.Controller.ControllerRGB;
import com.Model.ModelRGB;

import come.View.ViewRGB;

class Main { 
  

    // Main Method 
    public static void main (String[] args) 
    { 
    	ViewRGB View = new ViewRGB();
    	ModelRGB Model = new ModelRGB();
    	ControllerRGB Controller = new ControllerRGB(Model, View);
    	View.setVisible(true);;
 
    } 
} 