package AbstractFactory;


public interface WidgetFactory {
    Button createButton();
    TextBox createTextBox();
    Grid createGrid();
    Label createLabel();

}
