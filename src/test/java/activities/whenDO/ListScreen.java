package activities.whenDO;

import controles.Button;
import controles.Label;
import org.openqa.selenium.By;

public class ListScreen {
    public Button addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label resultLabel = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    public Label noTareasLabel = new Label(By.id("com.vrproductiveapps.whendo:id/noNotesText"));


}
