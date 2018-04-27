/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w12_program_in_section16;

/**
 *
 * @author albertgeorge
 */
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTable;


public class DogYearsFrame extends JFrame implements ChangeListener {
   private JSpinner yearsSpinner;    // Triggers travel time calculation
   private JTextField ageHumanField; // Displays dog's age in human years
   private JLabel yearsLabel;        // Label for dog years
   private JLabel ageHumanLabel;     // Label for human years

/* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   DogYearsFrame() {
      int initYear = 0; // Spinner initial value display
      int minYear = 0;  // Spinner min value
      int maxYear = 30; // Spinner max value
      int stepVal = 1;  // Spinner step
      
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;
      
      // Specifies the types of values displayed in spinner
      SpinnerNumberModel spinnerModel = null;
      
      // Set frame's title
      setTitle("Dog's age in human years");
      
      // Create labels
      yearsLabel = new JLabel("Select dog's age (years):");
      ageHumanLabel = new JLabel("Age (human years):");
      
      // Create a spinner model, the spinner, and set the change listener
      spinnerModel = new SpinnerNumberModel(initYear, minYear, maxYear, stepVal);
      yearsSpinner = new JSpinner(spinnerModel);
      yearsSpinner.addChangeListener(this);
      
      // Create field
      ageHumanField = new JTextField(15);
      ageHumanField.setEditable(false);
      ageHumanField.setText("0 - 15");

      // Use a GridBagLayout
      setLayout(new GridBagLayout());

      // Specify component's grid location
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      add(yearsLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      add(yearsSpinner, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      add(ageHumanLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(ageHumanField, layoutConst);
   }
    @Override
   public void stateChanged(ChangeEvent event) {
      Integer dogAgeYears = 0; // Dog age input

      dogAgeYears = (Integer) yearsSpinner.getValue();

      // Choose output based on dog's age component
    
      // Changed switch statement to array
      String[] humanAgeIndex = {"0-15","15","24", "28", "32", "37","42", "47", "52", "57" , "62", "67", "72", "77", "82"};
      
      if (dogAgeYears > humanAgeIndex.length - 1){
          ageHumanField.setText("That's a long life!");
      }
      else{
          
          String humansAge =  humanAgeIndex[dogAgeYears];
          ageHumanField.setText(humansAge);
      }
      return;

   }
   /* Creates a DogYearsFrame and makes it visible */
   public static void main(String[] args) {
      // Creates DogYearsFrame and its components
      DogYearsFrame myFrame = new DogYearsFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);

      return;
   }
}

        