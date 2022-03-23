package activities.whenDO;

import controles.Button;
import controles.TextBox;
import org.openqa.selenium.By;

public class CreateTaskScreen {
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public TextBox nameText =new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));

}
