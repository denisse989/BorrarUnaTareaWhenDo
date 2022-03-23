package activities.whenDO;

import controles.Button;
import controles.Label;
import org.openqa.selenium.By;

public class TaskScreen {
    public Button deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button deleteModalButton =new Button(By.id("android:id/button1"));
}
