package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.CalculatorModel;
import views.CalculatorView;

public class CalculatorController {
    public CalculatorView calculatorView;
    public CalculatorModel calculatorModel;
       
    public CalculatorController(CalculatorView calculatorView, CalculatorModel calculatorModel){
        this.calculatorModel = calculatorModel;
        this.calculatorView = calculatorView;
        this.startView();
        
       this.calculatorView.jb_add.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                addButton(e);
            }
        });
       
       this.calculatorView.jb_subtract.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                subtractButton(e);
            }
        });
       
       this.calculatorView.jb_multiplicate.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                multiplicateButton(e);
            }
        });
       
       this.calculatorView.jb_divide.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                divideButton(e);
            }
        });
       
    }
    
    public void addButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.calculatorView.jtx_firstValue.getText());
        double secondValue = Double.parseDouble(this.calculatorView.jtx_secondValue.getText());
        this.calculatorModel.setValues(firstValue, secondValue);
        this.calculatorView.jtx_result.setText(""+this.calculatorModel.add());
    }
    
    public void subtractButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.calculatorView.jtx_firstValue.getText());
        double secondValue = Double.parseDouble(this.calculatorView.jtx_secondValue.getText());
        this.calculatorModel.setValues(firstValue, secondValue);
        this.calculatorView.jtx_result.setText(""+this.calculatorModel.subtract());
    }
    
    public void multiplicateButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.calculatorView.jtx_firstValue.getText());
        double secondValue = Double.parseDouble(this.calculatorView.jtx_secondValue.getText());
        this.calculatorModel.setValues(firstValue, secondValue);
        this.calculatorView.jtx_result.setText(""+this.calculatorModel.multiplicate());
    }
    
    public void divideButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.calculatorView.jtx_firstValue.getText());
        double secondValue = Double.parseDouble(this.calculatorView.jtx_secondValue.getText());
        this.calculatorModel.setValues(firstValue, secondValue);
        this.calculatorView.jtx_result.setText(""+this.calculatorModel.divide());
    }
    
    public void startView(){
        this.calculatorView.setTitle("Calculadora");
        this.calculatorView.setLocationRelativeTo(null);
        this.calculatorView.setVisible(true);
    }
}
