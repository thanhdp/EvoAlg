/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese.FitnessFunction;
import Ese.ClonalSelectionAlgorithm.Antibody;
import java.text.DecimalFormat;
import net.sf.javaml.core.Dataset;
import weka.core.Instances;

/**
 *
 * @author erigha eseoghene dan
 */
public class AffinityFunction implements AbstractFitnessFunction{

    @Override
    public double getFitness(Object o) {
       Antibody aAntibody = (Antibody)o;
        double x = formatNumber(aAntibody.getValue(0));
        double y = formatNumber(aAntibody.getValue(1));
        return quadraticSolver(x,y);
    }
    
    private double quadraticSolver(double x, double y){
        double val1 = x*x;
        return formatNumber(val1+y);
    }
    
    private double formatNumber(double num){
      DecimalFormat myFormat = new DecimalFormat("##.##");
      String outVar = myFormat.format(num);
      return Double.parseDouble(outVar);
    }

    @Override
    public double getFitness(Object o, Instances train, Instances test) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getFitness(Object o, Dataset train, Dataset test) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
