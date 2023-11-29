package view;

import com.model.LocationDao;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class CreateBooking extends VerticalLayout {
    private LocationDao locationDao;
    public CreateBooking() {
        locationDao = new LocationDao();
        createForm();
    }

    private void createForm() {
        setAlignItems(Alignment.STRETCH);

        ComboBox<Location> fromComboBox = new ComboBox(label: "Dari");
        fromComboBox.setItems(locationDao.getALL());
        fromComboBox.setItemLabelGenerator(Location::getNameame);

        ComboBox<Location> toComboBox = new ComboBox(label: "Ke");
        toComboBox.setItems(locationDao.getALL());
        toComboBox.setItemLabelGenerator(Location::getName);
    }
}
