/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.RootPanel;
import org.insset.client.remise.RemisePresenter;
import org.insset.client.calculator.CalculatorDecimalPresenter;
import org.insset.client.exemple.ExemplePresenter;

/**
 *
 * @author user
 */
public class HistoryListener implements ValueChangeHandler<String> {

    @Override
    public void onValueChange(ValueChangeEvent<String> event) {

        //Accès a la page de conversion roman
        if (event.getValue().equals("roman")) {
            RootPanel.get().clear();
            RootPanel.get().add(new CalculatorDecimalPresenter());
        }

        //Accès a la page d'exemple
        if (event.getValue().equals("exemple")) {
            RootPanel.get().clear();
            RootPanel.get().add(new ExemplePresenter());
        }

        //Accès a la page remise
        if (event.getValue().equals("remise")) {
            RootPanel.get().clear();
            RootPanel.get().add(new RemisePresenter());
        }
    }

}
