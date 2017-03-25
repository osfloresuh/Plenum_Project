package login_distinction;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;

public class login_distinction {
	
	ObservableList<String> adminEmployeeList = FXCollections.observableArrayList("Admin", "Employee");
	
	@FXML
	private ChoiceBox adminEmployeeDistinction;
	
	@FXML
	private void initialize() {
		adminEmployeeDistinction.setItems(adminEmployeeList);
		adminEmployeeDistinction.setValue("mmm");
	}
	
	@FXML
    private PasswordField passwordBox;
	
}
