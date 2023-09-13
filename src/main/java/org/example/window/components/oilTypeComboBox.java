package org.example.window.components;

import javax.swing.*;

public class oilTypeComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
    private String selectItem=null;
    private final String[] oilTypeArrayList={"BCoil","GTLightOil","GTOil","GTHeavyOil","GTExtraHeavyOil"};
    @Override
    public int getSize() {
        return oilTypeArrayList.length;
    }

    @Override
    public String getElementAt(int index) {
        return oilTypeArrayList[index];
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectItem=(String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectItem;
    }
}
