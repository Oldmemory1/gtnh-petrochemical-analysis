package org.example.window.components;

import javax.swing.*;

public class heavyOilCrackTypeComboBox extends AbstractListModel<Integer> implements ComboBoxModel<Integer> {
    private Integer selectItem=null;
    private final Integer[] heavyOilCrackTypeArrayList={0,1,2,3,4,5,6};
    @Override
    public void setSelectedItem(Object anItem) {
        selectItem=(Integer) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectItem;
    }

    @Override
    public int getSize() {
        return heavyOilCrackTypeArrayList.length;
    }

    @Override
    public Integer getElementAt(int index) {
        return heavyOilCrackTypeArrayList[index];
    }
}
