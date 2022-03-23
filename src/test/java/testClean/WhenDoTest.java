package testClean;

import activities.whenDO.CreateTaskScreen;
import activities.whenDO.ListScreen;
import activities.whenDO.TaskScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class WhenDoTest {
    ListScreen listScreen=new ListScreen();
    CreateTaskScreen createTaskScreen=new CreateTaskScreen();
    TaskScreen taskScreen=new TaskScreen();
    @Test
    public void newTaskTest() throws MalformedURLException {
        //Crear Tarea
        listScreen.addButton.click();
        createTaskScreen.nameText.click();
        createTaskScreen.nameText.setValue("Denisse");
        createTaskScreen.saveButton.click();
        String expectResult="Denisse";
        String actualResult=listScreen.resultLabel.getText();
        Assertions.assertEquals(expectResult,actualResult,"ERROR el nombre de la tarea es incorrecto");

        //Eliminar Tarea
        listScreen.resultLabel.click();
        taskScreen.deleteButton.click();
        taskScreen.deleteModalButton.click();

        String currentName=listScreen.noTareasLabel.getText();
        Assertions.assertTrue(!currentName.equals("Denisse"),"ERROR la tarea no se Elimino");


    }

    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
