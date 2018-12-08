package main;

import views.CalculatorView;
import models.CalculatorModel;
import controllers.CalculatorController;

public class Main {
    private CalculatorView view;
    private CalculatorModel model;
    private CalculatorController controller;
    
    public static void main(String[] args) {
             CalculatorView view = new CalculatorView();
             CalculatorModel model = new CalculatorModel();
             CalculatorController controllerCalculadora = new CalculatorController(view, model);
       
    }
}
